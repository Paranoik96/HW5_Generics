package com.cursor.generics.MyList;

import java.util.ArrayList;

public class MyList<T extends Number> {

    private ArrayList<T> arrayList = new ArrayList<T>();

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void add(T value) {
        arrayList.add(value);
    }

    public T smallestValue() {
        T min = arrayList.get(0);
        for (T value : arrayList) {
            if (min.doubleValue() > value.doubleValue()) {
                    min=value;
            }
        }
        return min;
    }
    public T LargestValue() {
        T max = arrayList.get(0);
        for (T value : arrayList) {
            if (max.doubleValue() < value.doubleValue()) {
                max=value;
            }
        }
        return  max;
    }
}
