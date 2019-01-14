package com.danit.togethertime.service;

import com.danit.togethertime.entity.UserEntity;
import com.danit.togethertime.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServise {
  @Autowired
  private UserRepository userRepository;

  public List<UserEntity> getAll() {
    return userRepository.findAll();
  }
}
