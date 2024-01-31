package com.java8features.streamapi;

import com.java8features.functionalinterface.UserModel;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
    public void users(String division) {
        Set<StudentModel> userModels = new HashSet<>();
        userModels.add(new StudentModel(1, "bhairab", "bhairab@gmail.com", "FIRST"));
        userModels.add(new StudentModel(2, "priyanka", "priyanka@gmail.com", "FIRST"));
        userModels.add(new StudentModel(3, "kuna", "Kuna@gmail.com", "FIRST"));
        userModels.add(new StudentModel(4, "gugi", "Gugi@gmail.com", "SECOND"));
        userModels.add(new StudentModel(5, "shree", "Shree@gmail.com", "THIRD"));
        userModels.add(new StudentModel(6, "ankita", "ankita@gmail.com", "THIRD"));
        userModels.add(new StudentModel(7, "koko", "ankita2@gmail.com", "SECOND"));

        //condition -1 filter student with div

        if (division.equals(Division.FIRST)) {
            List<StudentModel> firstDiv = userModels.stream().filter(div -> div.getDivision().equals(division)).toList();
            System.out.println(firstDiv);
        } else if (division.equals(Division.SECOND)) {
            List<StudentModel> secondtDiv = userModels.stream().filter(div -> div.getDivision().equals(division)).toList();
            System.out.println(secondtDiv);
        } else {
            List<StudentModel> thirdDiv = userModels.stream().filter(div -> div.getDivision().equals(division)).toList();
            System.out.println(thirdDiv);
        }

        List<StudentModel> firstDev = userModels.stream().filter(div -> div.getDivision().equals(division)).toList();
        System.out.println(firstDev);

        //condition -2 filter student with name "g"
        List<StudentModel> names = userModels.stream().filter(name -> name.getName().startsWith("a") || name.getName().endsWith("a")).toList();
        List<String> stdName = names.stream().map(name -> name.getName().toUpperCase()).toList();
        System.out.println(stdName);

        // condition name the student those are 1st div

        List<String> nameofFirstDiv = userModels.stream().filter(name -> name.getDivision().equals(division)).map(name -> name.getName().toUpperCase()).toList();
        System.out.println(nameofFirstDiv);

        List<Integer> rollNumber = Arrays.asList(23, 56, 89, 123, 567, 9, 12, 1, 5, 8);
        Collections.sort(rollNumber);
        List<Integer> even = rollNumber.stream().filter(num -> num % 2 == 0).map(x -> x*2).toList();
        System.out.println(even);

    }

    public static void main(String[] args) {
        System.out.println("This is call");
        StreamAPIExample streamAPIExample = new StreamAPIExample();
        streamAPIExample.users("SECOND");
    }
}


