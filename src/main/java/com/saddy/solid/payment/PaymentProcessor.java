package com.saddy.solid.payment;

public class PaymentProcessor {
//    void pay(String paymentType, double amount) {
//        if ("Cash".equals(paymentType)) {
//            IO.println("Order Payed by Cash");
//        } else if ("CARD".equals(paymentType)) {
//            IO.println("Order Payed by Card");
//        } else if ("UPI".equals(paymentType)) {
//            IO.println("Order Payed by UPI");
//        } else if ("CASH".equals(paymentType)) {
//            IO.println("Order Payed by Cash");
//        }
//    }
    void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}

// it looks good
// Problem: Every time new payment method introduced we need to update the class
// that means existing logic is touched.
// regression risks increases
// code grows into if-else graveyard
// this is called closed for extension, open for bugs