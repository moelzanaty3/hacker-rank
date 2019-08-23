package com.hackerRank;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*Problem Set*/
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());

        /*Reading Example*/
        Employee employee = new Employee("Mohammed");
        employee.print();
        employee.setSalary(60000);
        employee.print();

        Volunteer volunteer = new Volunteer("Yasmeen");
        volunteer.setHours(250);
        volunteer.print();

        /*Video Example*/
        Animal animal = new Animal(5);
        Dog dog = new Dog();
        Cat cat = new Cat();

        /*Print Statements*/
        dog.ruff();
        cat.meow();
        animal.eat();
        dog.eat();
        cat.eat();
        dog.run();
        cat.prance();
        /*
         * Establish a hierarchy for your classes. A class that inherits from some other class (referred to as a superclass) is called a subclass.
         * Subclass  -> A subclass is defined with the extends keyword.
         * Overriding Methods -> When overriding a method, it is best practice to precede the method with the @Override annotation
         * Everything in code that is REFERENCED inherits from OBJECT
         * OBJECT is the SUPERCLASS of things we created in java
         * A SUBCLASS can be generalized to a SUPERCLASS
         * A SUPERCLASS can NOT become more specific SUBCLASS
         * */
    }
}
