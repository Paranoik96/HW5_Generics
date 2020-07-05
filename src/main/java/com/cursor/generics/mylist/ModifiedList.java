package com.cursor.generics.mylist;

import java.util.ArrayList;

public class ModifiedList<T extends Comparable>  {

   private ArrayList<T> arrayList = new ArrayList<T>();

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void add(T value) {
        arrayList.add(value);
    }
}
