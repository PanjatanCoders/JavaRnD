package com.saddy.solid.payment;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        IO.println("Payment of amount " + amount + " made by UPI Successful.");
    }

}
