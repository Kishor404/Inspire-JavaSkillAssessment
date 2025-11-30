package com.kishor.onlinebanking.repository;

import com.kishor.onlinebanking.model.Account;
import com.kishor.onlinebanking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUser(User user);
    Optional<Account> findByAccountNumber(String accountNumber);
}
