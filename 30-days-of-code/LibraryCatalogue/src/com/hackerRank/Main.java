package com.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class Main {

    // Properties/ Fields/ Global Variables
    private Map<String, Book> bookCollection = new HashMap<String, Book>();
    private int currentDay = 0;
    private int lengthOfCheckoutPeriod = 7;
    private double initialLateFee = 0.50;
    private double feePerLateDay = 1.00;

    public Main(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public Main(Map<String, Book> bookCollection, int lengthOfCheckoutPeriod,
                double initialLateFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public void setBookCollection(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public void nextDay() {
        currentDay++;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public void setLengthOfCheckoutPeriod(int lengthOfCheckoutPeriod) {
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public void setInitialLateFee(double initialLateFee) {
        this.initialLateFee = initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    public void setFeePerLateDay(double feePerLateDay) {
        this.feePerLateDay = feePerLateDay;
    }

    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.isCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title);
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the Library $" + (getInitialLateFee() + daysLate * getFeePerLateDay())
                    + " because your book is " + daysLate + "days");
        } else {
            System.out.println("Book Returned");
        }
        book.setCheckedOut(false, -1);
    }

    private void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already Checkout");
    }

    public static void main(String[] args) {


    }
}
