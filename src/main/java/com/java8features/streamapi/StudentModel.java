package com.java8features.streamapi;


public class StudentModel {
    private int id;
    private String name;
    private String email;
    private String division;

    public StudentModel(int id, String name, String email, String division) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.division = division;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
