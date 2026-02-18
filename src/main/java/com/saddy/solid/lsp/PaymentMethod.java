package com.saddy.solid.lsp;

public interface PaymentMethod {
    boolean support(double amount);

    void pay(double amount);
}
