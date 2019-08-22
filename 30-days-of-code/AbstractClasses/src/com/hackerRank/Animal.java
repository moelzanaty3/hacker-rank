package com.hackerRank;

abstract class Animal {

    private int age;

    Animal() {
        System.out.println("An animal has been created");
    }

    Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created with age " + this.age);
    }

    abstract void eat();

    void sleep() {
        System.out.println("An animal is sleeping");
    }
    int getAge() {
        return age;
    }
}

