package com.java8features.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

//    public void predicateExample() {
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Predicate<Integer> predicate = n -> n % 2 == 0;
//
//        for (Integer val : list) {
//            if (predicate.test(val)) {
//                System.out.println(val);
//            }
//        }
//
//        String[] std = {"runa", "muna", "kuna", "kanha", "miku"};
//
//        Predicate<String> names = (name) -> name.startsWith("u", 1);
//        for (String s : std) {
//            if (names.test(s)) {
//                System.out.println(s);
//            }
//        }
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> evenlist = numbers.stream().filter(val -> val % 2 != 0).toList();
//        for (Integer val : evenlist) {
//            System.out.println(val);
//        }
//
//        List<Integer> evenNumbers = filterList(numbers, predicate);
//        System.out.println(evenNumbers);
//
//        //check vote
//
//        ArrayList<Person> person = new ArrayList<>();
//        person.add(new Person("miku", 10));
//        person.add(new Person("runa", 99));
//        person.add(new Person("papu", 25));
//
//        Predicate<Person> canVote = (personObj) -> personObj.getAge() >  18;
//
//        List<Person> people = checkCastVote(person, canVote);
//        System.out.println("number of person can vote  -> " + people.size());
//        people.forEach(per -> System.out.println(per.getName()));
//
//        List<Person> canVoteList = person.stream().filter(x -> x.getAge() > 18).toList();
//        for(Person person1: canVoteList){
//            System.out.println(person1.toString());
//        }
//
//    }

//    private List<Integer> filterList(List<Integer> numbers, Predicate<Integer> predicate) {
//        return numbers.stream().filter(predicate).toList();
//    }
//
//    private List<Person>   checkCastVote(List<Person> personList, Predicate<Person> predicate){
//        return  personList.stream().filter(predicate).collect(Collectors.toList());
//    }

    public void predicateJoinDemo() {
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("miku", 10));
        person.add(new Person("runa", 99));
        person.add(new Person("papu", 25));
        person.add(new Person("gugi", 15));

        Predicate<Person> condition1 = (age) -> age.getAge() > 10;
        Predicate<Person> condition2 = (age) -> age.getName().startsWith("g");

        for (Person age : person) {
            boolean test = condition1.and(condition2).test(age);
//            Predicate<Person> test = condition1.and(condition2);
            if (test) {
                System.out.println(test);
                System.out.println(age.getName());
            }
        }

    }
    public void biPredicateDemo() {

        BiPredicate<Integer, Integer> predicate = (n1 , n2) -> n1 + n2 > 20;

        System.out.println(predicate.test(10,30));
    }


    public static void main(String[] args) {
        System.out.println("This is predicate  example");
        PredicateDemo predicateDemo = new PredicateDemo();
//        predicateDemo.predicateExample();
       // predicateDemo.predicateJoinDemo();
        predicateDemo.biPredicateDemo();
    }
}
