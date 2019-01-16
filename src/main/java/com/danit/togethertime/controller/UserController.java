package com.danit.togethertime.controller;

import com.danit.togethertime.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
  @Autowired
  private UserServise userServise;

  @GetMapping("/users")
  private String showAllUsers(ModelMap model) {
    model.put("users", userServise.getAll());
    return "users";
  }
}
