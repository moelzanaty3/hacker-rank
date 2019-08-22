package com.hackerRank;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    // instance variables:
    private String name;
    private int salary;

    /**
     * Parameterized Constructor
     *
     * @param name The volunteer's name.
     */
    Employee(String name) {
        // use name param to initialize instance variable:
        this.name = name;
    }

    /**
     * @return The name instance variable.
     */
    public String getName() {
        return name;
    }

    /**
     * @return The salary instance variable.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary The integer to set as the salary instance variable.
     **/
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /* Print information about an instance of Employee. **/
    public void print() {
        if (this.salary == 0) {
            System.err.println("Error: No salary set for " + this.name
                    + "; please set salary and try again.\n");
        } else { // Print employee information
            // Formatter for salary that will add commas between zeroes:
            NumberFormat salaryFormat = NumberFormat.getNumberInstance(Locale.US);

            System.out.println("Employee Name: " + this.name
                    + "\nSalary: " + salaryFormat.format(this.salary) + "\n");
        }
    }
}
