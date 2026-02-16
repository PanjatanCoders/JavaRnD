package com.saddy.solid.order;

/*
    I have a class called ProcessOrder which perform validation, price calculation, save and send confirmation tasks
    For this normally we end up doing like below
    Problem with this approach is for any changes we may touch unrelated codes.
    The solution is going with SOLID principes - single repository concept. One class for one responsibility
 */
public class OrderProcessor_Old {
    void processOrder(Order order) {
        validateOrder(order);
        double price = calculatePrice(order);
        saveOrder(order, price);
        sendConfirmation(order);
    }

    void validateOrder(Order order) {
        // your login to validate an order
    }

    void saveOrder(Order order, double price) {
//        logic to save an order
    }
    void sendConfirmation(Order order) {
//        logic to send confirmation
    }
    double calculatePrice(Order order) {
        return 0;
    }
}

class Order {}
