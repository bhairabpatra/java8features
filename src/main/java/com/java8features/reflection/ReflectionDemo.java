package com.java8features.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectionDemo {

    public void refDemo() throws Exception {
        Student student = new Student(1, "bhairab");
        Class<?> cls = student.getClass();
        // Get the declared fields of the class
        System.out.println("Before reflection -> " + student.getName());
        Field[] studentClassFields = cls.getDeclaredFields();
        for (Field field : studentClassFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(student, "Priyanka");
            }
        }
        System.out.println("After reflection is demo  ->" + student.getName());

        // Get the declared methods of the class
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().equals("iAmPrivateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(student);
            }
            if (method.getName().equals("privateMethod")) {
                method.setAccessible(true);
                method.invoke(student, "This is private method");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ReflectionDemo reflectionDemo = new ReflectionDemo();
        reflectionDemo.refDemo();
    }
}
