package com.hackerRank;

class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public char calculate () {
        int average = this.calculateAverage();

        if (average < 40) {
            return 'T';
        } else if (average < 55 ) {
            return 'D';
        } else if (average < 70 ) {
            return 'P';
        } else if (average < 80 ) {
            return 'A';
        } else if (average < 90 ) {
            return 'E';
        } else if (average <= 100 ) {
            return 'O';
        }
        return  'F';
    }

    private int calculateAverage() {
        int sum = 0;
        for (int grade:
             testScores) {
            sum += grade;
        }
        return sum / testScores.length;
    }
}