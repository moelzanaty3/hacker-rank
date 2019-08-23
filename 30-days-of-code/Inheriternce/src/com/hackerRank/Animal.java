package com.hackerRank;

public class Animal {

    private int age;

    Animal() {
        System.out.println("An animal has been created");
    }

    Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created with age " + this.age);
    }

    public void eat() {
        System.out.println("The animal is eating");
    }

    public int getAge() {
        return age;
    }
}