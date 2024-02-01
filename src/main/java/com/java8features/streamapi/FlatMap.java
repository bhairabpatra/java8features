package com.java8features.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

    public void getCourseList() {
        List<String> webCourse = Arrays.asList("HTML", "CSS", "java script", "bootstrap");
        List<String> backEndCourse = Arrays.asList("JAVA", "Spring boot", "php", "python");
        List<String> cloudCourse = Arrays.asList("AWS", "K8s", "CI/CD", "GCP");

        List<List<String>> allCourse = Arrays.asList(webCourse, backEndCourse, cloudCourse);

        Stream<List<String>> stream1 = allCourse.stream();

        Stream<String> courses = stream1.flatMap(Collection::stream);
        courses.forEach(System.out::println);

    }

    public static void main(String[] args) {
        System.out.println("This is flatmap");
        FlatMap flatMap = new FlatMap();
        flatMap.getCourseList();
    }
}
