package com.durgaprasad.dp.adapterpattern;

public class NikeCheckout{
    private Adapter paymentAdapter;

    public NikeCheckout(Adapter adapter){
        this.paymentAdapter = adapter;
    }

    public boolean processOrder(){
        return paymentAdapter.finalizeTransaction();
    }
}
