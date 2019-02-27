package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    List<Integer> list = new ArrayList<Integer>();

    public Boolean add(int i) {

        return list.add(i);
    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {
//        Set<Integer> = getUnique();
        Set<Integer> elements = new HashSet<Integer>(list);
        List<Integer> unique = new ArrayList<Integer>(elements);
        return unique;
    }

    public String join() {
        StringBuilder stringJoined = new StringBuilder();
        stringJoined.append(list.toString());
        String joined = new String(stringJoined);
        return joined;
    }

    public Integer mostCommon() {

        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        if (list.contains(valueToAdd)) {
            return true;
        }
        return false;
    }


}
