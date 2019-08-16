package com.dictionaryPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // TODO: Phone Book Numbers
        Scanner in = new Scanner(System.in);
        // Declare a String to Integer map and Initialize it as a new String to Integer HashMap
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();



        // TODO: English to Spanish Dictionary

        // Declare a String to String map and Initialize it as a new String to String HashMap
        Map<String, String> englishSpanishDictionary = new HashMap<String, String>();
        String[] englishDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] spanishDays = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        // Putting Things inside our dictionary
        int i = 0;
        for (String englishWeekDay : englishDays) {
            englishSpanishDictionary.put(englishWeekDay, spanishDays[i]);
            i++;
        }
        // Retrieve things from our dictionary
        for (Map.Entry<String, String> entry : englishSpanishDictionary.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        // Print out all keys
        System.out.println("The KeySet for englishSpanishDictionary is : " + englishSpanishDictionary.keySet());
        // Print out all values
        System.out.println("The Values of englishSpanishDictionary is : " + englishSpanishDictionary.values());
        // Print out size
        System.out.println("The Size of englishSpanishDictionary is : " + englishSpanishDictionary.size());


    }
}
