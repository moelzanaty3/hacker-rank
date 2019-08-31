package com.hackerRank;

class Printer <T> {


    Printer() {

    }
    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param A generic array
     **/
    <A> void printArray(A[] arr) {
        for (A element:
             arr) {
            System.out.println(element);
        }
    }
}
