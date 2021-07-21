package com.durgaprasad.dp.iteratorpattern;

public class ArrayIterator implements Iterator{
    private String[] items;
    private int index = 0;

    public ArrayIterator(String[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.length;
    }

    @Override
    public String next() throws Exception {
        if(hasNext()){
            index++;
            return items[index-1];

        }else {
            throw new Exception("No more elements to iterate");
        }
    }
}
