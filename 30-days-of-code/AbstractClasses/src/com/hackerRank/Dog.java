package com.hackerRank;

class Dog extends Animal {

    Dog() {
        super(15);
        System.out.println("Dog has been created");
    }

    @Override
    void eat() {
        System.out.println("A Dog is eating");
    }

    @Override
    void sleep() {
        System.out.println("A Dog is sleeping");
    }

    void ruff() {
        System.out.println("A Dog say ruff");
    }

    void run() {
        System.out.println("A Dog is running");
    }


}
