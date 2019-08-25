package com.hackerRank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();

        /*Mean*/
        double sum = 0;
        for (int number :
                arr) {
            sum += number;
        }
        System.out.println(sum / arr.length);
        /*Median*/
        Arrays.sort(arr);
        double median = 0;
        if (arr.length % 2 == 0) {
            median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1]) / 2;
        } else {
            median = arr[arr.length/2];
        }
        System.out.println(median);
        /*Mode*/
        int maxCount = 0;
        int maxValue = 0;
        Arrays.sort(arr);
        for (int number:
             arr) {
            int count = 0;
            for (int innerNumber:
                 arr) {
                if (number == innerNumber) {
                    ++count;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = number;
            }

        }
        System.out.println(maxValue);
        /*
         *  1. Mean
         *       - sum all the integers in a set of values / number of them.
         *  2. Median
         *       - Sort Numbers
         *       - Odd
         *           * Find middle element of the sorted numbers
         *       - Event
         *           * Find 2 middle element and get mean of them
         *  3. Mode
         *       - The element(s) that occur most frequently in a data set
         * */
    }
}
