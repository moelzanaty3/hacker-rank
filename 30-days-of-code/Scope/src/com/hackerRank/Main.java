package com.hackerRank;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.getMaximumDifference());

        Scope s = new Scope();

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        System.out.println(cal.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format.format(cal.getTime());
        System.out.println(formatted);
        /*

        * Package -> A group of similar classes.
        *   - There are two main types of packages
        *       1. user-defined packages
        *       2. built-in packages [ java -> [util, io, net, awt...]]
        *       3. import pk1.pk2.....pkn.class
        *       4. import pk1.pk2.....pkn.* -> to import all from specific package

        * Scope -> Lifetime & Accessibility of a variable.
        *   - This term refers to the region of the program to which an identifier applies. While it is not good practice,
        *     you can declare multiple variables within a program that use the same identifier as long as the identifiers have differing scopes;

        * */
    }
}
