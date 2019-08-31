package com.hackerRank;

import java.util.Scanner;

public class Main {

    private static <E> void printArray(E[] array) {
        for (E element:
             array) {
            System.out.println(element);
        }
    }

    private static <T extends Comparable<T>> T findMax(T a, T b) {

        return (a.compareTo(b) > 0) ? a : b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }

        Integer[] arrInt = {1, 3, 4, 5};
        printArray(arrInt);

        String[] arrString = {"mohammed", "ahmed", "yasmeen", "hamza"};
        printArray(arrString);

        System.out.println(findMax(1, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(3, 2));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("yasmeen", "mohammed"));

        /*
        * Generics
        *   - Generic constructs are a very efficient way of reusing your code.
        *   - commonly-used generic type parameters:
                E - Element
                K - Key
                V - Value
                N - Number
                T - Type (e.g.: data type)
                S,U,V, etc. These are second, third, and fourth types for when T is already in use.
        *
        * */
    }
}
