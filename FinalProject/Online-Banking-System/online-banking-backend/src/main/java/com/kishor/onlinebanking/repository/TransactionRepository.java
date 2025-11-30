package com.kishor.onlinebanking.repository;

import com.kishor.onlinebanking.model.Account;
import com.kishor.onlinebanking.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccount(Account account);
}
