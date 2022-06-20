package com.F1App;

public class User {

    private String firstName;
    private String lastName;
    private String user;
    private String email;
    private String password;
    private int age;

    public User(String firstName, String lastName, String user, String email, String password, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.user = user;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
