package com.java8features.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
//18-Java-8-Features-20-Oct
    public static void main(String args[]){
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("Galu");
        stringJoiner.add("Koko");
        stringJoiner.add("gugi");
        stringJoiner.add("Shree");
        System.out.println(stringJoiner);

        StringJoiner stringJoiner1 = new StringJoiner(",", "{" ,"}");
        stringJoiner1.add("Galu");
        stringJoiner1.add("Koko");
        stringJoiner1.add("gugi");
        stringJoiner1.add("Shree");
        System.out.println(stringJoiner1);

    }
}
