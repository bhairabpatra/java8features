package com.java8features.specialiterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;
//18-Java-8-Features-20-Oct
public class SpecialIteratorDemo {
    public static void main(String args[]) {

        //List of data traverse using for
        List<String> users = Arrays.asList("Galu", "Koko", "Shree", "gugi");
        for (String user : users) {
            System.out.println(user);
        }

        //List of data traverse using iterator
        Iterator<String> iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //List of data traverse using spliterator
        users.spliterator().forEachRemaining(name -> System.out.println(name));
        users.spliterator().forEachRemaining(System.out::println);

    }
}
