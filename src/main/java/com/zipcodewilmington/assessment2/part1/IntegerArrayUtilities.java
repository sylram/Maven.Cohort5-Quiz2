package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length==11){
            return true;
        }return false;
    }

    public Integer[] range(int start, int stop) {
        int length = stop-start+1;
        Integer[] rangeArray = new Integer[length];
        for (int i = 0; i <length; i++) {
            rangeArray[i]=start+i;

        }
        return rangeArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return null;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return null;
    }
}
