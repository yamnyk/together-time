package com.danit.togethertime.controller;

import com.danit.togethertime.DTO.UserDTO;
import com.danit.togethertime.entity.UserEntity;
import com.danit.togethertime.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class UserController {
  @Autowired
  private UserServise userServise;

  @GetMapping("/users")
  private String showAllUsers(ModelMap model) {
    List<UserEntity> all = userServise.getAll();
    List<UserDTO> allUsersDTO = new ArrayList<>();
    all.forEach((u) -> allUsersDTO.add(new UserDTO(u)));
    model.put("users", allUsersDTO);
    return "users";
  }
}
