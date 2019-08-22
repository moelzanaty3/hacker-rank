package com.hackerRank;

abstract class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

}
