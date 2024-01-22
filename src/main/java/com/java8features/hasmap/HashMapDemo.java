package com.java8features.hasmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public void testHashmap(){
        Map<Integer, String> emp = new HashMap<>();
        emp.put(1,"bhairab");
        emp.put(2,"priyanka");

//        System.out.println("emp" + emp);
//        System.out.println(emp.containsKey(1));
//        System.out.println(emp.get(11));

        //iteration

        for(Map.Entry<Integer,String> e: emp.entrySet()){
                System.out.println(e.getKey());
                System.out.println(e.getValue());
        }
    }
    public static void main(String args[]){
        System.out.println("This is hashmap example");
        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.testHashmap();
    }


}
