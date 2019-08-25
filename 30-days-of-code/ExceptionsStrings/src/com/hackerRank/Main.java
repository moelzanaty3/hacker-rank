package com.hackerRank;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        try {
            String S = in.next();
            System.out.println(Integer.parseInt(S));
        } catch (Exception e) {
            System.out.println("Bad String");
        }

        /*
         * Exceptions
         *   1. An Event that occurs during the execution of a program.
         *   2. Disrupts the normal flow of the program flow instructions.
         * How Do we handle exceptions ?
         *   1. Checked Exceptions
         *       - Occurs at compile time [ SYNTAX ]
         *   2. UnChecked Exceptions
         *       - Occurs at run time [ LOGIC ]
         * */
    }
}
