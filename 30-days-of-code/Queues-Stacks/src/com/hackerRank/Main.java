package com.hackerRank;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*Problem Set Queues and Stacks*/
        String name = "mohammed";
        Queue<Character> stringQueue = new LinkedList<>();;
        Stack<Character> stringStack = new Stack<>();
        for (char character:
                name.toCharArray()) {
            stringQueue.add(character);
            stringStack.push(character);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < name.length()/2; i++) {
            if (stringQueue.peek() != stringStack.lastElement()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println( "The word, " + name + ", is "
                        + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ));


        /*Video*/
        Queuey queuey = new Queuey();
        queuey.enqueue(5);
        queuey.enqueue(6);
        queuey.enqueue(7);
        System.out.println("First out: " + queuey.dequeue());

        Stack<String> stringStackVideo = new Stack<>();
        stringStackVideo.push("Mohammed");
        stringStackVideo.push("Yasmeen");
        stringStackVideo.peek();
        System.out.println(stringStackVideo.pop());;
    }
}
