package com.elite.cirworld.share.utils;

import org.joda.time.DateTime;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by wjc133
 * Date: 2015/12/30
 * Time: 11:51
 */
public class TimeUtils {
    public static String getShortTime(Date date) {
        String shortString;
        long now = Calendar.getInstance().getTimeInMillis();
        if (date == null) return null;
        long delTime = (now - date.getTime()) / 1000;
        if (delTime > 365 * 24 * 60 * 60) {
            shortString = (int) (delTime / (365 * 24 * 60 * 60)) + "年前";
        } else if (delTime > 24 * 60 * 60) {
            shortString = (int) (delTime / (24 * 60 * 60)) + "天前";
        } else if (delTime > 60 * 60) {
            shortString = (int) (delTime / (60 * 60)) + "小时前";
        } else if (delTime > 60) {
            shortString = (int) (delTime / (60)) + "分钟前";
        } else if (delTime > 1) {
            shortString = delTime + "秒前";
        } else {
            shortString = "1秒前";
        }
        return shortString;
    }

    public static boolean isAfterNow(Date date) {
        DateTime dateTime = new DateTime(date.getTime());
        return dateTime.isAfterNow();
    }
}