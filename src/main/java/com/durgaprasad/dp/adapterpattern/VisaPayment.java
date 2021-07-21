package com.durgaprasad.dp.adapterpattern;

public class VisaPayment implements Payment{
    @Override
    public boolean processPayment() {
        System.out.println("Payment Processed from this " + this.getClass());
        return true;
    }
}
