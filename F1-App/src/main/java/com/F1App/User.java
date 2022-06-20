package com.F1App;

public class User {

    private String firstName;
    private String lastName;
    private String user;
    private int age;

    public User(String firstName, String lastName, String user, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.user = user;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
