package com.zipcodewilmington.assessment2.part3;

public abstract class Bird implements Animal {


    public String move() {
        return "fly";
    }

    @Override
    public int getSpeed() {
        return 13;
    }

    @Override
    public String color() {
        return null;
    }

    public void setMigrationMonth(String expected) {

    }

    public String getMigrationMonth() {
        return null;
    }
}
