package com.danit.togethertime.controller;

import com.danit.togethertime.DTO.MeetingDTO;
import com.danit.togethertime.entity.MeetingEntity;
import com.danit.togethertime.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MeetingController {
  @Autowired
  private MeetingService meetingService;

  @GetMapping("/")
  public String showAllMeetings(ModelMap model) {
    List<MeetingDTO> allMeetingsDTO = new ArrayList<>();

    List<MeetingEntity> allMeetingEntities = meetingService.getAll();
    allMeetingEntities.forEach((meeting) -> allMeetingsDTO.add(new MeetingDTO(meeting)));

    model.put("meetings", allMeetingsDTO);
    return "idx";
  }

  @PostMapping(value = "/meetings/add")
  public String addMeeting(@ModelAttribute MeetingDTO meetingDTO) {
    meetingService.addNew(meetingDTO);
    return "redirect:/";
  }

  @PostMapping("meetings/delete")
  public String deleteMeeting(@ModelAttribute MeetingDTO meetingDTO) {
    meetingService.deleteOne(meetingDTO);
    return "redirect:/";
  }
}
