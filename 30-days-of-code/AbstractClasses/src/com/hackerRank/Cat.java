package com.hackerRank;

class Cat extends Animal {

    Cat() {
        super(15);
        System.out.println("Cat has been created");
    }

    @Override
    void eat() {
        System.out.println("A Cat is eating");
    }

    @Override
    void sleep() {
        System.out.println("A Cat is sleeping");
    }

    void meow() {
        System.out.println("A Cat say meow");
    }

    void prance() {
        System.out.println("A Cat is Prancing");
    }
}
