package com.durgaprasad.dp.iteratorpattern;

public class AdigasMenuItems implements MenuItems {
    private String[] items;

    public AdigasMenuItems(){
        this.items = new String[25];
    }

    public void addItems(){
        items[0] = "Idli";
        items[1] = "Vada";
        items[2] = "Dosa";
    }


    @Override
    public Iterator createIterator() {
        return new ArrayIterator(items);
    }
}
