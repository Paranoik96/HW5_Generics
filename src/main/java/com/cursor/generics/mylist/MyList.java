package com.cursor.generics.mylist;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {

    private List<T> list = new ArrayList<>();

    public void add(T value) {
        list.add(value);
    }

    public T smallestValue() {
        T min = list.get(0);
        for (T value : list) {
            if (min.doubleValue() > value.doubleValue()) {
                    min=value;
            }
        }
        return min;
    }
    public T largestValue() {
        T max = list.get(0);
        for (T value : list) {
            if (max.doubleValue() < value.doubleValue()) {
                max=value;
            }
        }
        return  max;
    }
}
