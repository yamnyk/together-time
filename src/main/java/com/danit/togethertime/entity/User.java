package com.danit.togethertime.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tt_users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  @Column(name = "userid")
  private Long userid;

  @Column(name = "firstname")
  private String firstName;

  @Column(name = "lastname")
  private String lastName;

  @Column(name = "login")
  private String login;

  @Column(name = "password")
  private String password;

  @ManyToMany(cascade = { CascadeType.ALL })
  @JoinTable(
          name = "rel_meeting_users",
          joinColumns = { @JoinColumn(name = "userid") },
          inverseJoinColumns = { @JoinColumn(name = "meetingid") }
  )
  private List<Meeting> meetings;

  public void setUserid(Long userid) {
    this.userid = userid;
  }

  public List<Meeting> getMeetings() {
    return meetings;
  }

  public void setMeetings(List<Meeting> meetings) {
    this.meetings = meetings;
  }

  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
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


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
