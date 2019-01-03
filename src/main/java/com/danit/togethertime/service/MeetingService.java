package com.danit.togethertime.service;

import com.danit.togethertime.DTO.MeetingDTO;
import com.danit.togethertime.entity.MeetingEntity;
import com.danit.togethertime.repository.MeetingsRepository;
import com.danit.togethertime.utils.AppUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {
  @Autowired
  private MeetingsRepository meetingsRepository;

  @Autowired
  private ModelMapper modelMapper;

  public List<MeetingEntity> getAll() {
    List<MeetingEntity> all = meetingsRepository.findAll();
    int a = 0;
    return all;
  }

  public MeetingEntity addNew(MeetingDTO meetingDTO) {
    MeetingEntity meetingEntity = new MeetingEntity();

    meetingEntity.setDateStart(AppUtils.stringToTimestamp(meetingDTO.getDateStart()));
    meetingEntity.setDateEnd(AppUtils.stringToTimestamp(meetingDTO.getDateEnd()));

    return meetingsRepository.save(meetingEntity);
  }

  public void deleteOne(MeetingDTO meetingDTO) {
    try {

      MeetingEntity meetingEntity = new MeetingEntity();

      meetingEntity.setMeetingId(meetingDTO.getId());
      meetingEntity.setDateStart(AppUtils.stringToTimestamp(meetingDTO.getDateStart()));
      meetingEntity.setDateEnd(AppUtils.stringToTimestamp(meetingDTO.getDateEnd()));

      meetingsRepository.delete(meetingEntity);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
