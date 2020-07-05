package com.cursor.generics.mylist;

public class HighestAndLowest<T extends Comparable> {

    private T[] array;

    public HighestAndLowest(T[] array) {
        this.array = array;
    }

    public T lowestValue() {
        T min = array[0];
        for (T value : array) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }

    public T highestValue() {
        T max = array[0];
        for (T value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }
}
