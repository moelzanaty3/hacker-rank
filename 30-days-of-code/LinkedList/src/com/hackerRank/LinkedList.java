package com.hackerRank;

class LinkedList {

    // Properties
    private Node head;
    private int count;

    // Constructor
    // List must have at least one node.
    /*LinkedList() {
        head = null;
        count = 0;
    }*/

    LinkedList(Node head) {
        this.head = head;
        count = 1;
    }

    // Methods!
    // TODO: add nodes to list
    void add(int data) {
        Node newNode = new Node(data);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
        count++;
    }

    // TODO: get node to list
    int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // TODO: size to list
    int size() {
        return count;
    }

    // TODO: isEmpty to list
    boolean isEmpty() {
        return head == null;
    }

    // TODO: remove to list
    void remove() {
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

}
