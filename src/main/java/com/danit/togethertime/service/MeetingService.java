package com.danit.togethertime.service;

import com.danit.togethertime.DTO.MeetingDTO;
import com.danit.togethertime.entity.MeetingEntity;
import com.danit.togethertime.repository.MeetingsRepository;
import com.danit.togethertime.utils.AppUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MeetingService {
  @Autowired
  private MeetingsRepository meetingsRepository;

  @Autowired
  private ModelMapper modelMapper;

  public List<MeetingDTO> getAll() {

    List<MeetingDTO> collect = meetingsRepository.findAll()
        .stream()
        .map((meeting) -> modelMapper.map(meeting, MeetingDTO.class))
        .collect(Collectors.toList());

    return collect;
  }

  public MeetingEntity addNew(MeetingDTO meetingDTO) {

    return meetingsRepository.save(modelMapper.map(meetingDTO, MeetingEntity.class));
  }

  public boolean deleteOne(MeetingDTO meetingDTO) {
    long meetingId = modelMapper
        .map(meetingDTO, MeetingEntity.class)
        .getMeetingId();

    meetingsRepository
        .deleteById(meetingId);

    return !meetingsRepository.findById(meetingId).isPresent();
  }
}
