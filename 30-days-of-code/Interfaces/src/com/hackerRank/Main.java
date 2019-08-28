package com.hackerRank;

import java.util.Scanner;

public class Main {

    private static void print(Polygon p) {
        System.out.println("A " + p.getClass().getSimpleName() + " has " + p.getNumberOfSides() + " sides.");
        System.out.println("The perimeter of this shape is: " + p.getPerimeter() + '\n');
    }

    public static void main(String[] args) {
        /*Problem Set*/
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);

        /*Explanation*/
        Polygon triangle = new Triangle(1, 2, 3);
        print(triangle);

        Polygon rectangle = new Rectangle(2, 3);
        print(rectangle);

        Polygon square = new Square(2);
        print(square);
        /*
         * Interfaces
         *   - Recall that abstraction is the separation between what something does and how it's accomplished.
         *   - A collection of abstract methods and constants that form a common set of base rules/specifications for those classes that implement it.
         *   - Like  an abstract class BUT an interface cannot be instantiated and must be implemented by a class.
         * */
    }
}
