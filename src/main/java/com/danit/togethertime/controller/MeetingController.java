package com.danit.togethertime.controller;

import com.danit.togethertime.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeetingController {

  @Autowired
  private MeetingService meetingService;

  @GetMapping("/")
  public String showAllMeetings(ModelMap model) {
    model.put("meetings", meetingService.getAll());
    return "idx";
  }
}
