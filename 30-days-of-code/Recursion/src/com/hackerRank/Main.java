package com.hackerRank;

public class Main {

    private static int Submission(int n) {

        return n <= 0 ? 0 : n + Submission(n-1);
    }

    private static int Factorial(int n) {
    	// Basic Case
		if (n <= 1) return 1;
		// Recursive Case
		else return n * Factorial(n-1);
	}

    public static void main(String[] args) {

        int submission = Submission(3);
        System.out.println(submission); // 6

		int factorial = Factorial(3);
		System.out.println(factorial); // 6
		/*
	    * The Process of defining a function or calculating a number by repeated application of an algorithm
	    * 1. Basic Case
	    *       - When we stop repeating our algorithm
	    * 2. Recursive Case
	    *       - Repeating the algorithm.
	    * f(f(f(a))) ---- a = 20
	    * f(a) = 5 + a
	    * f(20) = 5 + 20  => 25
	    * f(f(25))
	    * f(25) = 5 + 25 => 30
	    * f(30)
	    * f(30) = 5 + 30 => 35
	    * */

    }
}
