package com.danit.togethertime.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppUtils {
  public static Timestamp stringToTimestamp(String inputDate) {
    Timestamp res = null;

    try {

      res = new Timestamp(stringToDate("yyyy-MM-dd'T'hh:mm", inputDate).getTime());

    } catch (ParseException e) {
      try {

        res = new Timestamp(stringToDate("yyyy-MM-dd hh:mm", inputDate).getTime());

      } catch (ParseException ex) {
        ex.printStackTrace();
      }
    }
    return res;
  }

  private static Date stringToDate(String patern, String inputDate) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat(patern);

    return dateFormat.parse(inputDate);
  }
}
