package com.danit.togethertime.DTO;

import com.danit.togethertime.entity.Meeting;
import com.danit.togethertime.entity.User;

import java.util.List;

public class UserDTO {
    private String firstName;
    private String lastName;
    private String login;
    private List<Meeting> meetings;

    public UserDTO() {
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
