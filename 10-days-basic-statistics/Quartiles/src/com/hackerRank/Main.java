package com.hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static int median(int[] values) {

        int median;
        if (values.length % 2 == 0) {
            median = (values[values.length / 2] + values[values.length / 2 - 1]) / 2;
        } else {
            median = values[values.length / 2];
        }
        return median;
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        int[] arr_lower_half = new int[n/2];
        int[] arr_upper_half = new int[n/2];
        int startPositionArrayCopied = n %  2 == 0 ? n/2 :  (n/2) + 1;

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        scanner.close();

        Arrays.sort(arr);

        System.arraycopy(arr, 0, arr_lower_half, 0, arr_lower_half.length);
        System.arraycopy(arr, startPositionArrayCopied, arr_upper_half, 0, arr_upper_half.length);

        /*Q1 -> The first quartile is the middle number between the smallest number in a data set and its median.*/
        System.out.println("Q1 => " + median(arr_lower_half));
        /*Q2 -> The second quartile is the median ( percentile) of the data set.*/
        System.out.println("Q2 => " + median(arr));
        /*Q3 -> The third quartile is the middle number between a data set's median and its largest number.*/
        System.out.println("Q3 => " + median(arr_upper_half));
        /*
         * Quartiles
         * The quartiles of an ordered data set are the  points that split the data set into  equal groups. The  quartiles are defined as follows:
                Q1: The first quartile is the middle number between the smallest number in a data set and its median.
                Q2: The second quartile is the median ( percentile) of the data set.
                Q3: The third quartile is the middle number between a data set's median and its largest number.
         *  1. Find the median --> Q2
         *  2. Find the median of upper/lower halves
         *  3. Define your Quartiles
         *  4. Define IQR Inter Quartile Range Q3 - Q1
         *  5. Interpret IQR
         * */
    }
}
