package com.danit.togethertime.entity;

import java.util.ArrayList;

public class User {
    public String login;
    public long ID;
    private String firstName;
    private String secondName;
    private String password;
    private ArrayList<Long> friends;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Long> getFriends() {
        return friends;
    }

    //if I need an addFriend method, should I wrote it right there?

    public void setFriends(ArrayList<Long> friends) {
        this.friends = friends;
    }
}
