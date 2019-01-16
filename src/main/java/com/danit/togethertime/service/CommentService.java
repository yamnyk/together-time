package com.danit.togethertime.service;

import com.danit.togethertime.DTO.CommentDTO;
import com.danit.togethertime.repository.CommentRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CommentService {
  @Autowired
  private CommentRepository commentRepository;

  @Autowired
  private ModelMapper modelMapper;

  public List<CommentDTO> getAllComments() {

    return commentRepository.findAll()
        .stream()
        .map((comment) -> modelMapper.map(comment, CommentDTO.class))
        .collect(Collectors.toList());
  }
}
