package com.F1App;

public class User {

    private String firstName;
    private String lastName;
    private String id;
    private int age;

    public User(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public String getFirst() {
        return firstName;
    }

    public void setFirst(String firstName) {
        this.firstName = firstName;
    }

    public String getLast() {
        return lastName;
    }

    public void setLast(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
