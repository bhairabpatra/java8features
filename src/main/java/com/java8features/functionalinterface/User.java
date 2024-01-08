package com.java8features.functionalinterface;

@FunctionalInterface
public interface User {
    //    void getUsers(String name, int age);
    int mathFunction(int n1, int n2);

    // Static method in the functional interface
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Default method in the functional interface
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}
