package com.kishor.onlinebanking.service;

import com.kishor.onlinebanking.dto.AccountDto;
import com.kishor.onlinebanking.dto.DepositRequest;
import com.kishor.onlinebanking.dto.TransferRequest;
import com.kishor.onlinebanking.dto.WithdrawRequest;
import com.kishor.onlinebanking.dto.TransactionDto;
import com.kishor.onlinebanking.model.Account;
import com.kishor.onlinebanking.model.Transaction;
import com.kishor.onlinebanking.model.TransactionType;
import com.kishor.onlinebanking.model.User;
import com.kishor.onlinebanking.repository.AccountRepository;
import com.kishor.onlinebanking.repository.TransactionRepository;
import com.kishor.onlinebanking.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public AccountDto getAccountForUser(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Account account = accountRepository.findByUser(user)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        AccountDto dto = new AccountDto();
        dto.setUsername(user.getUsername());
        dto.setFullName(user.getFullName());
        dto.setAccountNumber(account.getAccountNumber());
        dto.setBalance(account.getBalance());
        return dto;
    }

    public void deposit(DepositRequest request) {
        if (request.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Amount must be positive");
        }

        User user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Account account = accountRepository.findByUser(user)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        account.setBalance(account.getBalance().add(request.getAmount()));
        accountRepository.save(account);

        Transaction tx = new Transaction();
        tx.setAccount(account);
        tx.setType(TransactionType.DEPOSIT);
        tx.setAmount(request.getAmount());
        tx.setDescription("Deposit");
        tx.setCreatedAt(LocalDateTime.now());
        transactionRepository.save(tx);
    }

    public void withdraw(WithdrawRequest request) {
        if (request.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Amount must be positive");
        }

        User user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Account account = accountRepository.findByUser(user)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        if (account.getBalance().compareTo(request.getAmount()) < 0) {
            throw new RuntimeException("Insufficient balance");
        }

        account.setBalance(account.getBalance().subtract(request.getAmount()));
        accountRepository.save(account);

        Transaction tx = new Transaction();
        tx.setAccount(account);
        tx.setType(TransactionType.WITHDRAW);
        tx.setAmount(request.getAmount());
        tx.setDescription("Withdraw");
        tx.setCreatedAt(LocalDateTime.now());
        transactionRepository.save(tx);
    }

    @Transactional
    public void transfer(TransferRequest request) {
        if (request.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Amount must be positive");
        }

        User fromUser = userRepository.findByUsername(request.getFromUsername())
                .orElseThrow(() -> new RuntimeException("Source user not found"));
        Account fromAccount = accountRepository.findByUser(fromUser)
                .orElseThrow(() -> new RuntimeException("Source account not found"));

        Account toAccount = accountRepository.findByAccountNumber(request.getToAccountNumber())
                .orElseThrow(() -> new RuntimeException("Target account not found"));

        if (fromAccount.getBalance().compareTo(request.getAmount()) < 0) {
            throw new RuntimeException("Insufficient balance");
        }

        fromAccount.setBalance(fromAccount.getBalance().subtract(request.getAmount()));
        toAccount.setBalance(toAccount.getBalance().add(request.getAmount()));

        accountRepository.save(fromAccount);
        accountRepository.save(toAccount);

        LocalDateTime now = LocalDateTime.now();

        Transaction outTx = new Transaction();
        outTx.setAccount(fromAccount);
        outTx.setType(TransactionType.TRANSFER_OUT);
        outTx.setAmount(request.getAmount());
        outTx.setDescription("Transfer to " + toAccount.getAccountNumber());
        outTx.setCreatedAt(now);
        transactionRepository.save(outTx);

        Transaction inTx = new Transaction();
        inTx.setAccount(toAccount);
        inTx.setType(TransactionType.TRANSFER_IN);
        inTx.setAmount(request.getAmount());
        inTx.setDescription("Transfer from " + fromAccount.getAccountNumber());
        inTx.setCreatedAt(now);
        transactionRepository.save(inTx);
    }
    public List<TransactionDto> getTransactionsForUser(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Account account = accountRepository.findByUser(user)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        List<Transaction> list = transactionRepository.findByAccount(account);

        return list.stream().map(tx -> {
            TransactionDto dto = new TransactionDto();
            dto.setId(tx.getId());
            dto.setType(tx.getType());
            dto.setAmount(tx.getAmount());
            dto.setDescription(tx.getDescription());
            dto.setCreatedAt(tx.getCreatedAt());
            return dto;
        }).collect(Collectors.toList());
    }
}
