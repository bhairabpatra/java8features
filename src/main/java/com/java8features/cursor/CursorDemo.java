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
            System.out.println(listIterator.previousIndex());
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
        Vector<String> names = new Vector<>();
        names.add("Galu");
        names.add("Shree");
        names.add("Gugi");
        names.add("Koko");

        System.out.println("name list " + names.size());
        for(String name: names){
            System.out.println(name);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("bhairab");
        arrayList.add("priyanka");
        arrayList.add("Santosha");
        List<String> list =  arrayList.stream().filter(x-> x.endsWith("a")).map(String::toUpperCase).toList();
        System.out.println("List" + list);
    }

    public static void main(String[] args) {
        CursorDemo cursorDemo = new CursorDemo();
        cursorDemo.cursorTestIterator();
        //cursorDemo.ListIteratorExample();
        //cursorDemo.EnumerationExample();
        cursorDemo.ForEachExample();
    }
}
