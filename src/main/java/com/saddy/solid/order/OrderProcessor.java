package com.saddy.solid.order;

public class OrderProcessor {
    private final OrderValidator orderValidator;
    private final PriceCalculator priceCalculator;
    private final OrderRepository orderRepository;
    private final NotificationService notificationService;

    public OrderProcessor(
            OrderValidator orderValidator,
            PriceCalculator priceCalculator,
            OrderRepository orderRepository,
            NotificationService notificationService
    ) {
        this.orderValidator = orderValidator;
        this.priceCalculator = priceCalculator;
        this.orderRepository = orderRepository;
        this.notificationService = notificationService;
    }
    void processOrder(Order order) {
        orderValidator.validateOrder(order);
        double price = priceCalculator.calculatePrice(order);
        orderRepository.saveOrder(order,  price);
        notificationService.sendConfirmation(order);
    }
}

/*
    Why this design is superior (real talk)

    Each class has one reason to change
    You can test price logic without DB
    You can change email provider without touching order logic
    Multiple developers can work in parallel
    Code reads like a story, not a crime scene
    OrderProcessor now coordinates, not does everything.
 */