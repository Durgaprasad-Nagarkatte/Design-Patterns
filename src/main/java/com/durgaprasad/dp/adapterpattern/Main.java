package com.durgaprasad.dp.adapterpattern;

public class Main {
    public static void main(String[] args){
        Payment payment = new VisaPayment();
        Adapter adapter = new PaypalAdapter(payment);
        NikeCheckout nikeCheckout = new NikeCheckout(adapter);
        nikeCheckout.processOrder();
    }
}
