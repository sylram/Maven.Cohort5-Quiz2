package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        if (value >= 5) {
            return true;
        }
        return false;
    }

    public Boolean isLessThan7(Integer value) {
        if (value <= 7) {
            return true;
        }
        return false;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if (isGreaterThan5(valueToEvaluate) && isLessThan7(valueToEvaluate)) {
            return true;
        }
    return false;
    }


    public Boolean startsWith(String string, Character character) {
        String stringtoLowerCase =string.toLowerCase();
        String charToLowerCase = character.toString().toLowerCase();
        if(stringtoLowerCase.startsWith(charToLowerCase)){

        return true;
    }
    return false;
    }
}
