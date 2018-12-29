package com.danit.togethertime.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppUtils {
  public static Timestamp dateToTimestamp(Date inputDate) {
    return new Timestamp(inputDate.getTime());
  }
}
