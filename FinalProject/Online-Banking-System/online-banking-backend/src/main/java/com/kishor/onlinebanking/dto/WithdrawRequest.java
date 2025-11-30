package com.kishor.onlinebanking.dto;

import java.math.BigDecimal;

public class WithdrawRequest {
    private String username;
    private BigDecimal amount;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
}
