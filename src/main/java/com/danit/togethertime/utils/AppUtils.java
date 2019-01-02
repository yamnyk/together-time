package com.danit.togethertime.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppUtils {
  public static Timestamp stringToTimestamp(String inputDate) {
    try {
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
      Date parsedDate= dateFormat.parse(inputDate);
      Timestamp timestamp = new Timestamp(parsedDate.getTime());
      return timestamp;
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return new Timestamp(new Date().getTime());
  }
}
