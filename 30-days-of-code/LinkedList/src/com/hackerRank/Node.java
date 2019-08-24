package com.hackerRank;

class Node {
    // Properties
    Node next;
    int data;

    // Methods!

    // Constructors
    Node(int data) {
        this.data = data;
        next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Getter and Setter

    int getData() {
        return data;
    }

    Node getNext() {
        return next;
    }

    void setData(int data) {
        this.data = data;
    }

    void setNext(Node next) {
        this.next = next;
    }

}
