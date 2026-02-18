package com.saddy.solid.lsp;

public class PaymentTest {
    static void main() {
        CashPayment cashPayment = new CashPayment();
        double amount = 2500;
        if (!cashPayment.support(amount)) {
            throw new IllegalArgumentException("Payment not supported");
        }
        cashPayment.pay(amount);
    }
}
