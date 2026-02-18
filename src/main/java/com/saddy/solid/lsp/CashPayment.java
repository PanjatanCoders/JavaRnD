package com.saddy.solid.lsp;

public class CashPayment implements PaymentMethod{
    @Override
    public boolean support(double amount) {
        return amount <= 2000.0;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount);
    }
}
