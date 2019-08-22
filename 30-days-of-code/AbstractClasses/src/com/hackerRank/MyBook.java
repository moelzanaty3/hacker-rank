package com.hackerRank;

class MyBook extends Book {

    private int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.getTitle()
                + "\nAuthor: " + this.getAuthor()
                + "\nPrice: " + this.getPrice());
    }
}
