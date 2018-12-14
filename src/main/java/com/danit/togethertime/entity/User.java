package com.danit.togethertime.entity;


import javax.persistence.*;

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
