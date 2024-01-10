package com.java8features.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {

    public void users() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 2, 5, 8);
//            find all even number
        List<Integer> odd = numbers.stream().filter(number -> number % 2 != 0).
                map(n -> n * 5).toList();
        System.out.println("Even number " + odd);
        System.out.println("Number of even number " + odd.size());
    }

    public void optionalExample() {
        Optional<String> rollNumbers = Optional.of("Hello, Optional!");

        rollNumbers.ifPresent(x -> System.out.println(x));
        Optional<String> newString = rollNumbers.map(x -> x.toUpperCase());
        System.out.println(newString);

        if (rollNumbers.isPresent()) {
            String value = rollNumbers.get();
            System.out.println("Value is present  ->" + value);
        } else {
            System.out.println("No Value present");
        }

        Optional<String> optionalEmpty = Optional.empty();
        String defaultValue = optionalEmpty.orElse("Default Value");
        System.out.println("Value of optionalEmpty orElse default: " + defaultValue);

    }

    public static void main(String args[]) {
        System.out.println("This is the example of the optional");
        OptionalExample optionalExample = new OptionalExample();
        optionalExample.users();
        optionalExample.optionalExample();
    }
}



//import java.util.Optional;
//
//public class OptionalExample {
//    public static void main(String[] args) {
//        // Creating an Optional with a non-null value
//        Optional<String> optionalWithValue = Optional.of("Hello, Optional!");
//
//        // Creating an empty Optional
//        Optional<String> optionalEmpty = Optional.empty();
//
//        // Checking if optionalWithValue contains a value and then getting it
//        if (optionalWithValue.isPresent()) {
//            String value = optionalWithValue.get();
//            System.out.println("Value is present: " + value);
//        } else {
//            System.out.println("Value is absent");
//        }
//
//        // Using orElse to provide a default value if the optionalEmpty is empty
//        String defaultValue = optionalEmpty.orElse("Default Value");
//        System.out.println("Value of optionalEmpty orElse default: " + defaultValue);
//
//        // Using ifPresent to perform an action only if a value is present
//        optionalWithValue.ifPresent(val -> System.out.println("Value from ifPresent: " + val));
//
//        // Using map to transform the value if it's present
//        Optional<String> transformedValue = optionalWithValue.map(val -> val.toUpperCase());
//        System.out.println("Transformed value: " + transformedValue.orElse("No value present to transform"));
//
//        // Using filter to check and return a value if it meets a condition
//        Optional<String> filteredValue = optionalWithValue.filter(val -> val.contains("Hello"));
//        System.out.println("Filtered value: " + filteredValue.orElse("No value containing 'Hello'"));
//
//        // Avoiding null checks and NullPointerExceptions
//        String nullString = null;
//        Optional<String> optionalNull = Optional.ofNullable(nullString);
//        System.out.println("Value of optionalNull orElse default: " + optionalNull.orElse("Default Value"));
//    }
//}
