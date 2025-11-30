package com.kishor.onlinebanking.service;

import com.kishor.onlinebanking.dto.LoginRequest;
import com.kishor.onlinebanking.dto.UserRegistrationDto;
import com.kishor.onlinebanking.model.Account;
import com.kishor.onlinebanking.model.User;
import com.kishor.onlinebanking.repository.AccountRepository;
import com.kishor.onlinebanking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(UserRegistrationDto dto) {
        // check if username already exists
        Optional<User> existing = userRepository.findByUsername(dto.getUsername());
        if (existing.isPresent()) {
            throw new RuntimeException("Username already taken");
        }

        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPasswordHash(passwordEncoder.encode(dto.getPassword()));
        user.setFullName(dto.getFullName());
        user.setEmail(dto.getEmail());
        user.setRole("CUSTOMER");

        User savedUser = userRepository.save(user);

        // create account for this user
        Account account = new Account();
        account.setUser(savedUser);
        account.setAccountNumber(generateAccountNumber());
        account.setBalance(BigDecimal.ZERO);
        account.setCreatedAt(LocalDateTime.now());

        accountRepository.save(account);
    }

    public boolean login(LoginRequest dto) {
        Optional<User> userOpt = userRepository.findByUsername(dto.getUsername());
        if (userOpt.isEmpty()) return false;

        User user = userOpt.get();
        return passwordEncoder.matches(dto.getPassword(), user.getPasswordHash());
    }

    private String generateAccountNumber() {
        // simple random 12 digit account number
        String random = UUID.randomUUID().toString().replaceAll("-", "");
        return random.substring(0, 12).toUpperCase();
    }
}
