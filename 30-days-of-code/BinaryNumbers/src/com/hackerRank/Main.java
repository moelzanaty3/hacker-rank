package com.hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    // Return Convert Decimal Number as an Array.
    private static int[] convertDecimalToBinary(int number) {

        int remainder;
        int[] binary = new int[40];
        int index = 0;
        while (number > 0) {

            remainder = number % 2;
            binary[index++] = remainder;
            number /= 2;
        }
        return Arrays.copyOf(binary, index);
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        // Assume n = 35
        int consequenceOnes = 0; // consequenceOnes = 0
        // binary of given in in string
        String strBinary = Integer.toString(n, 2); // strBinary: "100011" n:35
        // get all strings of ones
        String[] strParts = strBinary.split("0"); // strParts: {"1", "", "", "11"} strBinary: "100011"
        // find max from One's
        /*
         * First Iteration
         *   1. strPart: "1" strParts: {"1", "", "", "11"}
         *   2. consequenceOnes = 0  strPart: "1"
         *   3. consequenceOnes = 1
         * Second Iteration
         *   1. strPart: "" strParts: {"1", "", "", "11"}
         *   2. consequenceOnes = 0  strPart: ""
         * Third Iteration
         *   1. strPart: "" strParts: {"1", "", "", "11"}
         *   2. consequenceOnes = 0  strPart: ""
         * Last Iteration
         *   1. strPart: "11" strParts: {"1", "", "", "11"}
         *   2. consequenceOnes = 0  strPart: "11"
         *   3. consequenceOnes = 2
         * */
        for (String strPart : strParts) { // strPart: "1" strParts: {"1", "", "", "11"}
            if (consequenceOnes < strPart.length()) { // consequenceOnes = 0  strPart: "1"
                consequenceOnes = strPart.length(); // consequenceOnes = 1
            }
        }
        System.out.println(consequenceOnes);



        /*
         * The number of digits that can be used to represent a number in a positional number system.
         * Pseudo code
         * while(n > 0):
                remainder = n%2;
                n = n/2;
                Insert remainder to front of a list or push onto a stack

            Print list or stack
         * */
    }
}
