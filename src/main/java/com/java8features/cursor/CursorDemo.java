package com.java8features.cursor;

import java.util.*;

public class CursorDemo {

    public void cursorTestIterator() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Galu");
        names.add("Shree");
        names.add("Gugi");
        names.add("Koko");

        System.out.println("name list " + names.size());

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }

    public void ListIteratorExample() {
        List<String> names = new ArrayList<>();
        names.add("Galu");
        names.add("Shree");
        names.add("Gugi");
        names.add("Koko");

        System.out.println("name list " + names.size());

        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("**********************************************");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }


    public void EnumerationExample() {
        Vector<String> names = new Vector<>();
        names.add("Galu");
        names.add("Shree");
        names.add("Gugi");
        names.add("Koko");

        System.out.println("name list " + names.size());

        Enumeration<String> elements = names.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
        System.out.println("**********************************************");
    }

    public void ForEachExample() {
        List<String> names = new ArrayList<>();
        names.add("Zak Crawley");
        names.add("Ollie Pope");
        names.add("Foakes ");
        names.add("Hartleyb ");
        names.add("Mark Wood");
        names.add("Jack Leach");

        System.out.println("size of the list " + names.size());

        System.out.println("************* for ***********");

        for(String name: names){
            System.out.println(name);
        }

        System.out.println("************foreach stream api java 8***************");
        //foreach stream api java 8
        names.forEach(System.out::println);

        System.out.println("**********************************************");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Crawley");
        arrayList.add("Leach");
        arrayList.add("Hartley");
        arrayList.add("Wood");
        arrayList.add("Foakes");
        List<String> list =  arrayList.stream().filter(x-> x.endsWith("y")).map(String::toUpperCase).toList();
        System.out.println("List" + list);
    }

    public static void main(String[] args) {
        CursorDemo cursorDemo = new CursorDemo();
//        cursorDemo.cursorTestIterator();
//        cursorDemo.ListIteratorExample();
       // cursorDemo.EnumerationExample();
        cursorDemo.ForEachExample();
    }
}
