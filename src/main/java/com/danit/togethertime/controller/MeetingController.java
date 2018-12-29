package com.danit.togethertime.controller;

import com.danit.togethertime.DTO.MeetingDTO;
import com.danit.togethertime.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MeetingController {

  @Autowired
  private MeetingService meetingService;

  @GetMapping("/")
  public String showAllMeetings(ModelMap model) {
    model.put("meetings", meetingService.getAll());
    return "idx";
  }

  @PostMapping(value = "/meetings/add")
  public String addMeeting(@ModelAttribute MeetingDTO meetingDTO) {
    meetingService.addNew(meetingDTO);
    return "redirect:/";
  }
}
