package com.durgaprasad.dp.iteratorpattern;

public class Main {
    public static void main(String[] args){
        AdigasMenuItems menuItems = new AdigasMenuItems();
        menuItems.addItems();
        Iterator iterator = menuItems.createIterator();

        while (iterator.hasNext()){
            try {
                System.out.println(iterator.next());
            }catch (Exception e){
                System.out.println("Completed iteration");
            }
        }
    }
}
