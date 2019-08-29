package com.hackerRank;

import java.util.Scanner;

public class Main {

    private static void printArray(String s, int[] x) {
        System.out.println(s + " Array: ");
        for (int number :
                x) {
            System.out.println(number + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] x) {
        printArray("Initial", x);

        int endPosition = x.length - 1;
        int swapPosition;

        while (endPosition > 0) {
            swapPosition = 0;

            for (int i = 0; i < endPosition; i++) {

                if (x[i] > x[i + 1]) {
                    // Swap elements 'i' and 'i + 1':
                    int tmp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = tmp;

                    swapPosition = i;
                } // end if

                printArray("Current", x);
            } // end for

            endPosition = swapPosition;
        } // end while

        printArray("Sorted", x);
    }

    private static void bubbleSorting(int[] a) {

        int n = a.length;
        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {

                break;
            }
        }

        System.out.println("Array is sorted in "+ numberOfSwaps +" swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+ a[n-1]);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        /*Explanation*/
        int n = scan.nextInt();
        int[] unsorted = new int[n];
        for (int i = 0; i < n; i++) {
            unsorted[i] = scan.nextInt();
        }
        scan.close();

        // bubbleSort(unsorted);
        bubbleSorting(unsorted);
        /*Video*/
        Person perterParker = new Person();
        // Aliases
        Person spiderMan = perterParker;

        perterParker.setHairColor(HairColor.BLONDE);
        System.out.println("Hair color of Peter Parker: " + perterParker.getHairColor()); // BLACK
        System.out.println("Hair color of Spider Man: " + spiderMan.getHairColor()); // BLACK
        /*
         *   - Sorting ->  The act of ordering elements.
         *   - Pointer ->  Variables that store the address of another variables in memory.
         *   - Reference Data Types / Primitive Data Types
         *   - Enum -> A special Data Type that allow for a variable to be one of a set of pre-defined constants.
         *   - Aliases -> set a nickname to same variable
         * */
    }
}
