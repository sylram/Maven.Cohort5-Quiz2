package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length%2==0) {
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
        int length = stop - start + 1;
        Integer[] rangeArray = new Integer[length];
        for (int i = 0; i < length; i++) {
            rangeArray[i] = start + i;

        }
        return rangeArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum = sum + array[i];

        }
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        Integer product = 1;
        for (int i = 0; i <=1; i++) {
            product = product * array[i];

        }
        return product;
    }
}
