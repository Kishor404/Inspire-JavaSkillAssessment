package com.kishor.onlinebanking.controller;

import com.kishor.onlinebanking.dto.*;
import com.kishor.onlinebanking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.kishor.onlinebanking.dto.TransactionDto;

import java.util.List;

@RestController
@RequestMapping("/api/account")
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/me")
    public ResponseEntity<AccountDto> getMyAccount(@RequestParam String username) {
        AccountDto dto = accountService.getAccountForUser(username);
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/deposit")
    public ResponseEntity<?> deposit(@RequestBody DepositRequest request) {
        accountService.deposit(request);
        return ResponseEntity.ok("Deposit successful");
    }

    @PostMapping("/withdraw")
    public ResponseEntity<?> withdraw(@RequestBody WithdrawRequest request) {
        accountService.withdraw(request);
        return ResponseEntity.ok("Withdraw successful");
    }

    @PostMapping("/transfer")
    public ResponseEntity<?> transfer(@RequestBody TransferRequest request) {
        accountService.transfer(request);
        return ResponseEntity.ok("Transfer successful");
    }

    @GetMapping("/transactions")
    public ResponseEntity<List<TransactionDto>> getTransactions(@RequestParam String username) {
        List<TransactionDto> txs = accountService.getTransactionsForUser(username);
        return ResponseEntity.ok(txs);
    }
}
