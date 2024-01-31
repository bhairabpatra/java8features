package com.java8features.specialiterator;

import java.util.*;

//18-Java-8-Features-20-Oct
public class SpecialIteratorDemo {
    public static void main(String args[]) {

        //List of data traverse using for
//        List<String> users = Arrays.asList("Galu", "Koko", "Shree", "gugi");
//        for (String user : users) {
//            System.out.println(user);
//        }
//
//        //List of data traverse using iterator
//        Iterator<String> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        Spliterator<Integer> spliterator = numbers.spliterator();

       // spliterator.forEachRemaining(n -> System.out.println(n));

        // Create a new spliterator covering only even numbers
        Spliterator<Integer> evenSpliterator = spliterator.trySplit();

        // Process elements in parallel
        evenSpliterator.forEachRemaining(n -> {
            if (n % 2 == 0) {
                System.out.println("Square of " + n + " is " + (n * n));
            }
        });


        //List of data traverse using spliterator
//        users.spliterator().forEachRemaining(name -> System.out.println(name));
//        //Method reference
//        users.spliterator().trySplit().forEachRemaining(System.out::println);
//
//
//        ListIterator<String> listIterator = users.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }

    }
}
