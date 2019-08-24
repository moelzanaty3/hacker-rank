package com.hackerRank;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static  Node insert(Node head, int data) {

        // Create a new node with given data
        Node new_node = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            head = new_node;
        } else  {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return head;
    }

     private static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();

        LinkedList<String> linkedList = new LinkedList<>();
        // Add a node with data="First" to back of the (empty) list
        linkedList.add("First");
        // Add a node with data="Second" to the back of the list
        linkedList.add("Second");
        // Insert a node with data="Third" at front of the list
        linkedList.addFirst("Third");
        // Insert a node with data="Fourth" at back of the list
        linkedList.addLast("Fourth");
        // Insert a node with data="Fifth" at index 2
        linkedList.add(2, "Fifth");
        // Print the list: [Third, First, Fifth, Second, Fourth]
        System.out.println(linkedList);
        // Print the value at list index 2:
        System.out.println(linkedList.get(2));
        // Empty the list
        linkedList.clear();
        // Print the newly emptied list: []
        System.out.println(linkedList);
        // Adds a node with data="Sixth" to back of the (empty) list
        linkedList.add("Sixth");
        System.out.println(linkedList); // print the list: [Sixth]


        /*
         *
         * DATA STRUCTURE -> Container that hold data
         * LINKED LIST ->
         *       - is a data structure that consists of a group
         *         of nodes which represent a sequence together.
         *       -  a data structure having a list of elements where each element
         *          has a reference pointing to the next element in the list.
         * */
    }
}
