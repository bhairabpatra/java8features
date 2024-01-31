package com.java8features.reflection;

public class Student {
    private int id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    private void privateMethod(String x) {
        System.out.println("Private method called -> " + x);
    }
    private static void iAmPrivateStaticMethod() {
        System.out.println("Hi,  i am private static Method");
    }
}
