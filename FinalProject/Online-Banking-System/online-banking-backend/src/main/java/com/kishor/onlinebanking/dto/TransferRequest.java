package com.kishor.onlinebanking.dto;

import java.math.BigDecimal;

public class TransferRequest {
    private String fromUsername;
    private String toAccountNumber;
    private BigDecimal amount;

    public String getFromUsername() { return fromUsername; }
    public void setFromUsername(String fromUsername) { this.fromUsername = fromUsername; }

    public String getToAccountNumber() { return toAccountNumber; }
    public void setToAccountNumber(String toAccountNumber) { this.toAccountNumber = toAccountNumber; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
}
