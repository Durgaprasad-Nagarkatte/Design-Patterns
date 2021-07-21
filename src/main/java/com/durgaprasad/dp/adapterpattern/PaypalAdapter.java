package com.durgaprasad.dp.adapterpattern;

public class PaypalAdapter implements Adapter{
    private Payment payment;

    public PaypalAdapter(Payment payment){
        this.payment = payment;
    }

    @Override
    public boolean finalizeTransaction() {
        return payment.processPayment();
    }
}
