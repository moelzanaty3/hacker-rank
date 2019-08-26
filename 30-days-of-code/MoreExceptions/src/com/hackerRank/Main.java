package com.hackerRank;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final double TOO_HOT = 185;
    private static final double TOO_COLD = 160;

    private static void drinkHotChocolate(double cocoaTemperature) throws TooHotException, TooColdException {
        if (cocoaTemperature >= TOO_HOT) {
            throw new TooHotException();
        } else if (cocoaTemperature <= TOO_COLD) {
            throw new TooColdException();
        }
    }

    private static void example() throws Exception {
        throw new Exception("This exception will always thrown");
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        /*Problem*/
        int t = scanner.nextInt();
        while (t-- > 0) {

            int n = scanner.nextInt();
            int p = scanner.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();

        /*Notes*/
        try {
            example();
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        /*Video*/
        double currentCocoaTemperature = 200;
        boolean wrongTemperature = true;
        while (wrongTemperature) {
            try {
                drinkHotChocolate(currentCocoaTemperature);
                System.out.println("That cocoa was good!");
                wrongTemperature = false;
            } catch (TooHotException e1) {
                System.out.println("That's too HOT!");
                currentCocoaTemperature -= 5;
            } catch (TooColdException e2) {
                System.out.println("That's too COLD! it's like the arctic");
                currentCocoaTemperature += 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("And it's gone.");
        /*
         * Exceptions
         *
         * */
    }
}
