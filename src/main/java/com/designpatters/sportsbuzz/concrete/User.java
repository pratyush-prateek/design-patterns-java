package com.designpatters.sportsbuzz.concrete;

import com.designpatters.sportsbuzz.interfaces.Subscriber;

public class User implements Subscriber {
    private String userId;
    private String fullName;
    private int age;
    private String email;
    public User(String userId, String fullName, int age, String email) {
        this.userId = userId;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void notify(Game game) {
        System.out.println(this.fullName);
        System.out.println(this.userId);
        System.out.println(game.toString());
    }
}
