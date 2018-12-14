package com.danit.togethertime.DTO;

import com.danit.togethertime.entity.Meeting;

import java.util.List;

public class UserDTO {
    private String firstName;
    private String lastName;
    private String login;

    public UserDTO() {
    }

    private List<Meeting> meetings;

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

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }
}
