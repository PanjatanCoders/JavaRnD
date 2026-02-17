package com.saddy.solid.payment;

public class CreditPayment implements Payment {

    @Override
    public void pay(double amount) {
        IO.println("Payment of amount" + amount + " made by Credit Card Successful");
    }
}
