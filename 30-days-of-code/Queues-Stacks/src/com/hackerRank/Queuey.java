package com.hackerRank;

import java.util.LinkedList;

class Queuey {

    LinkedList<Integer> queue;

    Queuey() {
        queue = new LinkedList<>();
    }

    // Check if our queue empty
    boolean isEmpty() {
        return queue.isEmpty();
    }

    // Get size of queue
    int size() {
        return queue.size();
    }

    // Enqueuing an item
    void enqueue(int n) {
        if (queue.isEmpty()) {
            queue.addLast(n);
        }
    }

    // Dequeuing  an item
    int dequeue() {
        return queue.remove(0);
    }

    // Peek at the first item
    int peek() {
        return queue.get(0);
    }

}
