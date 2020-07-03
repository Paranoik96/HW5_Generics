package com.cursor.generics;

import com.cursor.generics.MyList.HighestAndLowest;
import com.cursor.generics.MyList.ModifiedList;
import com.cursor.generics.MyList.MyList;

public class Application {
    public static void main(String[] args) {

        MyList<Float> myFloatList = new MyList<>();
        myFloatList.add(33.5f);
        myFloatList.add(1.9f);
        myFloatList.add(16.7f);

        System.out.println("Thw Smallest value is : " + myFloatList.smallestValue());
        System.out.println("Thw Largest value is : " + myFloatList.LargestValue());

        ModifiedList<Integer> modifiedList = new ModifiedList<>();
        modifiedList.add(22);
        modifiedList.add(5);
        modifiedList.add(132);
        modifiedList.add(435);
        System.out.println(modifiedList.getArrayList());

        ModifiedList<String> modifiedListSting = new ModifiedList<>();
        modifiedListSting.add("Never");
        modifiedListSting.add("Gonna");
        modifiedListSting.add("Give");
        modifiedListSting.add("You");
        modifiedListSting.add("Up");
        System.out.println(modifiedListSting.getArrayList());

        Integer[] array = {4, 56, 656, 75, 4, 232, 1, 66, 64, 898};
        HighestAndLowest highestAndLowest = new HighestAndLowest(array);
        System.out.println(highestAndLowest.highestValue());
        System.out.println(highestAndLowest.lowestValue());


    }
}