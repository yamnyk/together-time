package com.danit.togethertime.controller;

import com.danit.togethertime.DTO.UserDTO;
import com.danit.togethertime.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
  @Autowired
  private UserServise userServise;

  @GetMapping("/users")
  private String showAllUsers(ModelMap model) {
    model.put("users", userServise.getAll());
    return "users";
  }

  @GetMapping("/user/{id}")
  private String showUserPage(ModelMap model, @PathVariable("id") Long userId) {
    UserDTO userById = userServise.getUserById(userId);
    model.put("user", userById);
    return "userpage";
  }
}
