package com.java8features.functionalinterface;

import java.util.*;

public class UserService {
    public void Users() {
//        User user = (name, age) -> {
//            System.out.println("Name -> " + name);
//            System.out.println("Age -> " + age);
//        };
//        user.getUsers("Bhairab", 30);

        User user = (n1, n2) -> {
            try {
                if (n1 == 0 && n2 == 0) {
                    throw new RuntimeException("The value can't be zero");
                }
                return n1 * n2;
            } catch (RuntimeException e) {
                // Handle the exception if needed
                System.out.println("Exception caught: " + e.getMessage());
                throw e; // Rethrow the exception if necessary
            }
        };

        try {
            int result = user.mathFunction(0, 0); // Example usage
            System.out.println("Result: " + result);
        } catch (RuntimeException e) {
            // Handle the exception from the lambda here if needed
            System.out.println("Exception caught outside lambda: " + e.getMessage());
        }

        user.defaultMethod();
        User.staticMethod();

//        In this example, defaultMethod is called on the lambda instance of User.
//        Meanwhile, staticMethod is called directly on the interface itself since it's a static method.

    }

    public void sortMethod() {

        List<UserModel> userModels = new ArrayList<>();
        userModels.add(new UserModel(1, "zbhairab", "bhairab@gmail.com"));
        userModels.add(new UserModel(2, "priyanka", "priyanka@gmail.com"));
        userModels.add(new UserModel(3, "kuna", "Kuna@gmail.com"));
        userModels.add(new UserModel(4, "gugi", "Gugi@gmail.com"));
        userModels.add(new UserModel(5, "shree", "Shree@gmail.com"));

        //After sort
        Collections.sort(userModels, Comparator.comparing(o -> o.getName().toUpperCase()));

        for (UserModel userModel : userModels) {
            System.out.println(userModel); // Assuming UserModel has overridden toString() method
        }
    }
}

//class MyComparator implements Comparator<UserModel> {
//    @Override
//    public int compare(UserModel o1, UserModel o2) {
//        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
//    }
//}


