package com.danit.togethertime.service;

import com.danit.togethertime.entity.MeetingEntity;
import com.danit.togethertime.repository.MeetingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {
  @Autowired
  private MeetingsRepository meetingsRepository;

  public List<MeetingEntity> getAll() {
    List<MeetingEntity> all = meetingsRepository.findAll();
    int a = 0;
    return all;
  }
}
