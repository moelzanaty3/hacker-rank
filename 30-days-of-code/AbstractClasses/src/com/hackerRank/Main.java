package com.hackerRank;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*Problem Set*/
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();

        /*Video Example*/
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Casting
        Object fakeDog = new Dog();
        Dog realDog = (Dog) fakeDog;
        realDog.sleep();
        Animal animal = (Animal) realDog;
        animal.sleep();

        /*Print Statements*/
        dog.ruff();
        cat.meow();
        dog.eat();
        cat.eat();
        dog.run();
        cat.prance();
        dog.sleep();
        cat.sleep();

        /*
        * Abstract Classes ->
        *   1. Class with at least one abstract method, a method declared without an implementation
        *   2. May have abstract methods and non abstract methods.
        *   3. Can not be initialized.
        * Casting  -> Converting DataType 2 another data type
        * */
    }
}
