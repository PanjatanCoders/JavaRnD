package com.saddy.solid.payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PaymentProcessorTest {

    private PaymentProcessor paymentProcessor;

    @Mock
    private Payment payment;

    @BeforeEach
    void setUp() {
        paymentProcessor = new PaymentProcessor();
    }

    @Test
    void processPayment_callsPayOnPayment_withCorrectAmount() {
        double amount = 150.34;

        paymentProcessor.processPayment(payment, amount);

        verify(payment, times(1)).pay(amount);
    }

    @Test
    void processPayment_propagatesException_fromPayment() {
        double amount = 99.99;
        doThrow(new RuntimeException("payment failed")).when(payment).pay(amount);

        assertThrows(RuntimeException.class, () -> paymentProcessor.processPayment(payment, amount));

        verify(payment).pay(amount);
    }

    @Test
    void processPayment_multiplePayments_orderPreserved() {
        Payment p1 = mock(Payment.class);
        Payment p2 = mock(Payment.class);

        paymentProcessor.processPayment(p1, 10.0);
        paymentProcessor.processPayment(p2, 20.0);

        InOrder inOrder = inOrder(p1, p2);
        inOrder.verify(p1).pay(10.0);
        inOrder.verify(p2).pay(20.0);
    }
}
