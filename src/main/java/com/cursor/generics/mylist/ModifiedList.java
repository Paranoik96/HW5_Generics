package com.cursor.generics.mylist;

import java.util.ArrayList;
import java.util.List;

public class ModifiedList<T extends Comparable<T>>  {

   private List<T> list = new ArrayList<T>();

    public List<T> getArrayList() {
        return list;
    }

    public void add(T value) {
        list.add(value);
    }
}
