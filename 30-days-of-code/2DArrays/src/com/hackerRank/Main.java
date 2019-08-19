package com.hackerRank;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * int rowSize = numberOfRows;
         * int colSize = numberOfColumns;
         * int[][] myArray = new int[rowSize][colSize];
         * */
        int rowSize = 6;
        int colSize = 6;
        int[][] arr = new int[rowSize][colSize];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

       /*
            a b c
              d
            e f g
        */
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < rowSize-2; i++) {
            for (int j = 0; j < colSize-2; j++) {

                sum = arr[i  ][j]   + arr[i  ][j+1]   + arr[i  ][j+2]
                                    + arr[i+1][j+1]   +
                      arr[i+2][j]   + arr[i+2][j+1]   + arr[i+2][j+2];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);

        scanner.close();


    }
}
