package com.hackerRank;

public class Book {

    private String title;
    private int pageCount;
    private int ISBN;
    private boolean isCheckedOut; // whether or not the book is checked out
    private int dayCheckedOut = -1;

    public Book(String title, int pageCount, int ISBN) {
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut, int dayCheckedOut) {
        isCheckedOut = checkedOut;
        setDayCheckedOut(dayCheckedOut);
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    private void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }
}
