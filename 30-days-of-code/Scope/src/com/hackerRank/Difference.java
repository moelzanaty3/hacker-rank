package com.hackerRank;

class Difference {
    private int[] elements;
    private int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    int computeDifference() {

        if (this.elements.length < 2) return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int element : elements) {

            if (element < min) min = element;
            if (element > max) max = element;
        }
        this.maximumDifference = Math.abs(max - min);
        return maximumDifference;
    }

    int getMaximumDifference() {
        return maximumDifference;
    }
}