package com.durgaprasad.dp.adapterpattern;

public class MastercardPayment implements Payment{
    @Override
    public boolean processPayment() {
        System.out.println("Payment Processed from this " + this.getClass());
        return true;
    }
}
