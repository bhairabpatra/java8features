package com.java8features.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public void testHashSet() {
        HashSet<Integer> emp = new HashSet<>();
        emp.add(1);
        emp.add(2);
        emp.add(3);
        emp.add(4);
        emp.add(5);
        emp.add(2);


        if (emp.isEmpty()) {
            System.out.println("Set is not empty");
        }
//        System.out.println(emp);
//        for (Integer value : emp) {
//            System.out.println(value);
//        }
//
//        if (emp.contains(100)) {
//            System.out.println("Ser containes");
//        }
        emp.iterator().forEachRemaining(System.out::println);

        Iterator<Integer> it = emp.iterator();
        while ((it.hasNext())){
                System.out.println(it.next());
        }

        //iteration


    }

    public static void main(String args[]) {
        System.out.println("This is hash set example");
        HashSetDemo hashMapDemo = new HashSetDemo();
        hashMapDemo.testHashSet();
    }
}
