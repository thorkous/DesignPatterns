package com.delta.behavioralPattern.strategy;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
