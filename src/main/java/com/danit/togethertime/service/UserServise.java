package com.danit.togethertime.service;

import com.danit.togethertime.DTO.UserDTO;
import com.danit.togethertime.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UserServise {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private ModelMapper modelMapper;

  public List<UserDTO> getAll() {

    return userRepository.findAll()
        .stream()
        .map((user) -> modelMapper.map(user, UserDTO.class))
        .collect(Collectors.toList());
  }
}
