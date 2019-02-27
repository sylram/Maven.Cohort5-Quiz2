package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for(int i:array1)
            integerArrayList.add(i);
        for(int j: array2)
            integerArrayList.add(j);
        Integer[] mergedArray = new Integer[integerArrayList.size()];
        mergedArray = integerArrayList.toArray(mergedArray);
        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotated = new Integer[index];
        for (int i = 0; i <index ; i++) {
            rotated[i]=array[i];
        }
        int itemsLeft = array.length-index;

        Integer[] restOfArray = new Integer[itemsLeft];
        for (int j = index; j <itemsLeft ; j++) {
            restOfArray[j]=restOfArray[j];
        }

        return merge(rotated,restOfArray);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                count = count + 1;
            }
        }
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == valueToEvaluate) {
                    count= count+ 1;
                }
            }return count;

        }


    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
