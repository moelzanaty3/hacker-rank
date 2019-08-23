package com.hackerRank;

public class Volunteer extends Employee {

    // instance variable:
    private int hours;

    /**
     * Parameterized Constructor
     *
     * @param name The volunteer's name.
     **/
    Volunteer(String name) {
        // explicit call to superclass' parameterized constructor
        super(name);
    }

    /**
     * @param hours the hours instance variable.
     **/
    void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * @return The hours instance variable
     **/
    int getHours() {
        return hours;
    }

    /* Overrides the superclass' print method and prints information about an instance of Volunteer. **/
    @Override
    public void print() {
        System.out.println("Volunteer Name: " + this.getName() + "\nHours: " + this.getHours());
    }
}