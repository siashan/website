package com.web.site.common.util;

import jodd.datetime.JDateTime;
import jodd.datetime.Period;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 1、string转换成date 2、date转换成string 3、日期增减 4、判断是否工作日 5、计算两个日期间隔天数 6、比较两个日期大小
 * <p/>
 * Created by kfc on 2016/10/12.
 */
public class DateUtil {
    public static final String DEFAULT_FORMAT = "YYYY-MM-DD hh:mm:ss.mss";
    public static final String FMT_YYYYMMDDhhmmssmss = "YYYYMMDDhhmmssmss";
    public static final String FMT_DATETIME = "YYYY-MM-DD hh:mm:ss";

    /**
     * 将String转换成Date
     *
     * @param str    时间串 2016-01-02 2016-02-02 12:09:09
     * @param format 格式化串 YYYY-MM-DD hh:mm:ss.mss
     * @return
     * @throws ParseException
     */
    public static Date string2Date(String str, String format) {
        return new JDateTime(str, format).convertToDate();
    }

    /**
     * 将Date格式化成String
     *
     * @param date   日期
     * @param format 格式化
     * @return
     */
    public static String date2String(Date date, String format) {
        return new JDateTime(date.getTime()).toString(format);
    }

    /**
     * 增加天数
     *
     * @param date 日期
     * @param day  要增加的天数 正数（n） ：增加n天；负数（n）：减少n天；0 ：日期不变
     * @return
     */
    public static Date addDay(Date date, int day) {
        return date2JDateTime(date).addDay(day).convertToDate();
    }

    /**
     * 减少天数
     *
     * @param date 日期
     * @param day  要减少的天数 正数（n） ：减少n天；负数（n）：增加n天；0 ：日期不变
     * @return
     */
    public static Date subDay(Date date, int day) {
        return date2JDateTime(date).subDay(day).convertToDate();
    }

    /**
     * 增加月份
     *
     * @param date
     * @param month
     * @return
     */
    public static Date addMonth(Date date, int month) {
        return date2JDateTime(date).addMonth(month).convertToDate();
    }

    /**
     * 减少月份
     *
     * @param date
     * @param month
     * @return
     */
    public static Date subMonth(Date date, int month) {
        return date2JDateTime(date).subMonth(month).convertToDate();
    }

    /**
     * 增加年份
     *
     * @param date
     * @param year
     * @return
     */
    public static Date addYear(Date date, int year) {
        return date2JDateTime(date).addYear(year).convertToDate();
    }

    /**
     * 减少年份
     *
     * @param date
     * @param year
     * @return
     */
    public static Date subYear(Date date, int year) {
        return date2JDateTime(date).subYear(year).convertToDate();
    }

    /**
     * 增加小时
     *
     * @param date
     * @param hour
     * @return
     */
    public static Date addHour(Date date, int hour) {
        return date2JDateTime(date).addHour(hour).convertToDate();
    }

    /**
     * 减少小时
     *
     * @param date
     * @param hour
     * @return
     */
    public static Date subHour(Date date, int hour) {
        return date2JDateTime(date).subHour(hour).convertToDate();
    }

    /**
     * 增加分钟
     *
     * @param date
     * @param minute
     * @return
     */
    public static Date addMinute(Date date, int minute) {
        return date2JDateTime(date).addMinute(minute).convertToDate();
    }

    /**
     * 减少分钟数
     *
     * @param date
     * @param minute
     * @return
     */
    public static Date subMinute(Date date, int minute) {
        return date2JDateTime(date).subMinute(minute).convertToDate();
    }

    /**
     * 增加秒数
     *
     * @param date
     * @param second
     * @return
     */
    public static Date addMinuteSecond(Date date, int second) {
        return date2JDateTime(date).addMillisecond(second).convertToDate();
    }

    /**
     * 减少秒数
     *
     * @param date
     * @param second
     * @return
     */
    public static Date subMinuteSecond(Date date, int second) {
        return date2JDateTime(date).subMillisecond(second).convertToDate();
    }

    /**
     * 加
     *
     * @param date
     * @param year
     * @param month
     * @param day
     * @param hour
     * @param minute
     * @param minuteSecond
     * @param millisecond
     * @return
     */
    public static Date add(Date date, int year, int month, int day, int hour, int minute, int minuteSecond,
                           int millisecond) {
        return date2JDateTime(date).add(year, month, day, hour, minute, minuteSecond, millisecond).convertToDate();
    }

    /**
     * 减
     *
     * @param date
     * @param year
     * @param month
     * @param day
     * @param hour
     * @param minute
     * @param minuteSecond
     * @param millisecond
     * @return
     */
    public static Date sub(Date date, int year, int month, int day, int hour, int minute, int minuteSecond,
                           int millisecond) {
        return date2JDateTime(date).sub(year, month, day, hour, minute, minuteSecond, millisecond).convertToDate();
    }

    // /**
    // * 两个日期相差的天数
    // *
    // * @param date1
    // * @param date2
    // * @return
    // */
    // public static long getPeriodOfDay(Date date1,Date date2){
    // return getPeriod(date1, date2).getDays();
    // }
    //
    // /**
    // * 两个日期之间相差的小时数
    // *
    // * @param date1
    // * @param date2
    // * @return
    // */
    // public static long getPeriodOfHour(Date date1,Date date2){
    //
    // return Math.abs(date1.getTime() - date2.getTime()) / 1000 / 60 / 60;
    //
    // }

    public static Period getPeriod(Date date1, Date date2) {
        return new Period(date2JDateTime(date1), date2JDateTime(date2));
    }

    /**
     * java Date 转换成 JDateTime
     *
     * @param date
     * @return
     */
    public static JDateTime date2JDateTime(Date date) {
        return new JDateTime(date.getTime());
    }

    /**
     * 字符串转jDatetime
     *
     * @param date
     * @param fmt
     * @return
     * @Author kfc
     * @Date 2017/12/15 14:37
     */
    public static JDateTime string2JDateTime(String date, String fmt) {
        return new JDateTime(date, fmt);
    }

    /**
     * 比较要比较的日期是否比被比较的日期大（日期格式不同）
     *
     * @param origDate   要比较的日期字符串
     * @param origFormat 要比较的日期字符串格式
     * @param desDate    被比较的日期字符串
     * @param desFormat  被比较的日期字符串格式
     * @return
     */
    public static boolean isAfter(String origDate, String origFormat, String desDate, String desFormat) {
        JDateTime origDateTime = new JDateTime(origDate, origFormat);
        JDateTime desDateTime = new JDateTime(desDate, desFormat);
        return origDateTime.isAfter(desDateTime);
    }

    /**
     * 比较要比较的日期是否比被比较的日期大（日期格式相同）
     *
     * @param origDate 要比较的日期字符串
     * @param format   日期字符串格式
     * @param desDate  被比较的日期字符串
     * @return
     */
    public static boolean isAfter(String origDate, String desDate, String format) {
        JDateTime origDateTime = new JDateTime(origDate, format);
        JDateTime desDateTime = new JDateTime(desDate, format);
        return origDateTime.isAfter(desDateTime);
    }

    /**
     * 日期比较（日期格式不同）
     *
     * @param origDate   要比较的日期字符串
     * @param origFormat 要比较的日期字符串格式
     * @param desDate    被比较的日期字符串
     * @param desFormat  被比较的日期字符串格式
     * @return 大于返回 1，等于返回 0，小于返回 -1
     */
    public static int compareTo(String origDate, String origFormat, String desDate, String desFormat) {
        JDateTime origDateTime = new JDateTime(origDate, origFormat);
        JDateTime desDateTime = new JDateTime(desDate, desFormat);
        return origDateTime.compareTo(desDateTime);
    }

    /**
     * 日期比较(日期格式相同)
     *
     * @param origDate 要比较的日期字符串
     * @param desDate  被比较的日期字符串
     * @param format   日期字符串格式
     * @return 大于返回 1，等于返回 0，小于返回 -1
     */
    public static int compareTo(String origDate, String desDate, String format) {
        JDateTime origDateTime = new JDateTime(origDate, format);
        JDateTime desDateTime = new JDateTime(desDate, format);
        return origDateTime.compareTo(desDateTime);
    }

    /**
     * 获取指定日期是周几
     *
     * @param date
     * @return
     * @Author kfc
     * @Date 2017/8/16 11:37
     */
    public static String getWeekOfDate(Date date) {
        JDateTime jDate = date2JDateTime(date);
        // String[] weekDays = {"7", "1", "2", "3", "4", "5", "6"};
        String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        int w = jDate.getDayOfWeek();
        if (w < 0 || w == 7) {

            w = 0;
        }
        return weekDays[w];
    }

    /**
     * 秒转化为时长
     *
     * @param mss
     * @return
     */
    public static String formatSsToTime(long mss) {
        String DateTimes = null;

        long days = mss / (60 * 60 * 24);
        long hours = (mss % (60 * 60 * 24)) / (60 * 60);
        long minutes = (mss % (60 * 60)) / 60;
        if (days > 0) {
            DateTimes = days + "天" + hours + "小时" + minutes + "分钟";

        } else if (hours > 0) {
            DateTimes = hours + "小时" + minutes + "分钟";

        } else if (minutes > 0) {
            DateTimes = minutes + "分钟";

        }
        if (null == DateTimes) {
            DateTimes = "1";
        }
        return DateTimes;
    }

    /**
     * 分转化为时长
     *
     * @param
     * @return
     */
    public static Map<String, Long> formatminToTime(long min) {
        Map<String, Long> result = new HashMap<String, Long>();
        long days = min / (60 * 24);
        long hours = (min % (60 * 24)) / (60);
        long minutes = min % 60;
        result.put("days", days);
        result.put("hours", hours);
        result.put("minutes", minutes);
        return result;
    }

    /**
     * 获取当前日期所在周的第一天
     *
     * @param date
     * @return
     * @Author kfc
     * @Date 2017/12/13 17:02
     */
    public static Date getFirstDayOfWeek(Date date) {
        JDateTime jDateTime = date2JDateTime(date);
        return jDateTime.subDay(jDateTime.getDayOfWeek() - 1).convertToDate();
    }

    /**
     * 获取当前日期所在周的第一天
     *
     * @param date 日期字符串
     * @param fmt  格式化字符串
     * @return
     * @Author kfc
     * @Date 2017/12/13 17:03\
     */
    public static Date getFirstDayOfWeek(String date, String fmt) {
        JDateTime jDateTime = string2JDateTime(date, fmt);
        return jDateTime.subDay(jDateTime.getDayOfWeek() - 1).convertToDate();
    }

    /**
     * 获取当前月的第一天
     *
     * @param date
     * @return
     * @Author kfc
     * @Date 2017/12/15 14:27
     */
    public static Date getFirstDayOfMonth(Date date) {
        JDateTime jDateTime = date2JDateTime(date);
        return jDateTime.subDay(jDateTime.getDayOfMonth() - 1).convertToDate();
    }

    /**
     * 是否是闰年
     *
     * @param year
     * @return
     * @Author kfc
     * @Date 2017/12/15 15:21
     */
    public static boolean isLeepNear(int year) {
        return string2JDateTime(year + "", "YYYY").isLeapYear();
    }

    /**
     * 获取当前月的第一天
     *
     * @param date 日期字符串
     * @param fmt  格式化字符串
     * @return
     * @Author kfc
     * @Date 2017/12/15 14:27
     */
    public static Date getFirstDayOfMonth(String date, String fmt) {
        JDateTime jDateTime = string2JDateTime(date, fmt);
        return jDateTime.subDay(jDateTime.getDayOfMonth() - 1).convertToDate();
    }

    /**
     * 获取当前月份
     *
     * @param date
     * @return
     * @Author kfc
     * @Date 2017/12/15 14:33
     */
    public static int getCurrentMonth(Date date) {
        return date2JDateTime(date).getMonth();
    }

    /**
     * 获取当前月份
     *
     * @param date
     * @param fmt
     * @return
     * @Author kfc
     * @Date 2017/12/15 14:36
     */
    public static int getCurrentMonth(String date, String fmt) {
        return string2JDateTime(date, fmt).getMonth();
    }

    /**
     * 获取当前年份
     *
     * @param date
     * @return
     * @Author kfc
     * @Date 2017/12/15 15:06
     */
    public static int getCurrentYear(Date date) {
        return date2JDateTime(date).getYear();
    }

    /**
     * 是否大月
     *
     * @param month
     * @return
     * @Author kfc
     * @Date 2017/12/15 15:31
     */
    public static boolean isBigMonth(int month) {
        return month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
    }

    /**
     * 获取指定月份的最后一天是几号
     *
     * @param year
     * @param month
     * @return
     * @Author kfc
     * @Date 2017/12/15 15:36
     */
    public static int getLastDayOfMonth(int year, int month) {
        int lastDay = 30;
        if (month == 2) {
            lastDay = isLeepNear(year) ? 29 : 28;
        } else {
            lastDay = isBigMonth(month) ? 31 : 30;
        }
        return lastDay;
    }

    // 根据String日期转换为date类型
    public static Date setDateFormat(String strDate, String fmt) {
        Date date = new Date();
        try {
            date = new SimpleDateFormat(fmt).parse(strDate);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return date;
    }

    // 根据String日期转换为date类型
    public static Date setDateFormat(String strDate) {
        Date date = new Date();
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return date;
    }

    // 根据Date日期转换为String类型
    public static String parseDateFormat(Date strDate) {
        String date = "";
        date = new SimpleDateFormat("yyyy-MM-dd").format(strDate);
        return date;
    }

    // 根据Date日期转换为String类型
    public static String parseDateFormat(Date strDate, String fmt) {
        try {
            String date = "";
            date = new SimpleDateFormat(fmt).format(strDate);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 获取一天的开始时间
    public static Date getDayStartTime(Date day) {
        String date = "";
        date = new SimpleDateFormat("yyyy-MM-dd").format(day) + " " + "00:00:00";
        return setDateFormat(date, "yyyy-MM-dd hh:mm:ss");

    }
    // 获取一天的结束时间

    public static Date getDayEndTime(Date day) {
        String date = "";
        date = new SimpleDateFormat("yyyy-MM-dd").format(day) + " " + "23:59:59";
        return setDateFormat(date, "yyyy-MM-dd hh:mm:ss");
    }

    /**
     * 得到当前日期几天前或者几天后的时间，如果是是前几天，num为负数，如果为后几天，num为正数
     *
     * @param num
     * @return
     */
    public static String getAfterOrBeforeDay(int num) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
        calendar.add(Calendar.DATE, num);
        String days_afterOrBefore = sdf.format(calendar.getTime());

        return days_afterOrBefore;

    }

    /**
     * 根据日期返回前几天或者后几天的日期，num为负值，为前几天，num为正值，为后几天
     *
     * @param date
     * @param num
     * @return
     */
    public static String getAfterOrBeforeDay(Date date, int num, String format) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, num);// 把日期往后增加一天.整数往后推,负数往前移动
        date = calendar.getTime(); // 这个时间就是日期往后推一天的结果
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static String TimeStamp2Date(long timestamp) {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date(timestamp));
        return date;
    }

    /**
     * 返回传入日期后几天的描述，返回结果为：今天 明天 后天
     *
     * @param date 格式为
     * @return
     */
    public static String getAfterDayDescribe(String date) {
        System.out.println(date.length());
        String checkDate = "";
        String time = "";
        if (date.length() > 10) {
            checkDate = date.substring(0, 10);
            time = date.substring(11, date.length());
        } else {
            checkDate = date;
        }
        String[] tmp = new String[3];
        for (int i = 0; i < tmp.length; i++) {
            Date date2 = new Date();// 取时间
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(new Date());
            calendar.add(Calendar.DATE, i);// 把日期往后增加一天.整数往后推,负数往前移动
            date2 = calendar.getTime(); // 这个时间就是日期往后推一天的结果
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            tmp[i] = formatter.format(date2);
        }
        if (checkDate.equals(tmp[0])) {
            return "今天  " + time;
        } else if (checkDate.equals(tmp[1])) {
            return "明天  " + time;
        } else if (checkDate.equals(tmp[2])) {
            return "后天  " + time;
        } else {
            return date;
        }

    }

    /**
     * 返回当前时间与制定时间的时间差，单位毫秒
     *
     * @param dataString 格式为：yyyy-MM-dd HH:mm:ss
     * @return
     * @throws ParseException
     */
    public static long dateGap(String dataString) throws ParseException {
        Date begin = new Date();
        Date end = setDateFormat(dataString);
        long between = (end.getTime() - begin.getTime()) / 1000;// 除以1000是为了转换成秒
        return between;
    }

    /**
     * 根据日期返回前一天，今天，后一天为周几 第一个位置为前一天，第二个位置为今天，第三个位置为后一天
     *
     * @param dt
     * @return
     */
    public static String[] getWeekOfDate1(Date dt) {
        String[] week = new String[3];
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(dt);
        cal1.add(Calendar.DATE, -1);// 把日期往后增加一天.整数往后推,负数往前移动
        int w1 = cal1.get(Calendar.DAY_OF_WEEK) - 1;
        if (w1 < 0) {
            w1 = 0;
        }

        week[0] = weekDays[w1];
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(dt);
        cal2.add(Calendar.DATE, -1);// 把日期往后增加一天.整数往后推,负数往前移动
        int w2 = cal2.get(Calendar.DAY_OF_WEEK) - 1;
        if (w2 < 0) {
            w2 = 0;
        }

        week[1] = weekDays[w2];
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(dt);
        cal3.add(Calendar.DATE, -1);// 把日期往后增加一天.整数往后推,负数往前移动
        int w3 = cal3.get(Calendar.DAY_OF_WEEK) - 1;
        if (w3 < 0) {
            w3 = 0;
        }

        week[2] = weekDays[w3];
        return week;
    }

    /**
     * 根据日期返回前一天，今天，后一天为周几 第一个位置为前一天，第二个位置为今天，第三个位置为后一天
     *
     * @param dt
     * @return
     */
    public static String getWeekOfDate(Date dt, int flag) {

        String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(dt);
        cal1.add(Calendar.DATE, flag);// 把日期往后增加一天.整数往后推,负数往前移动
        int w1 = cal1.get(Calendar.DAY_OF_WEEK) - 1;
        if (w1 < 0) {
            w1 = 0;
        }

        return weekDays[w1];
    }

    /**
     * 获取制定时间的时间戳
     * <p>
     * Title: getLongtime
     * <p>
     * author:孙山伟
     *
     * @param date
     * @return
     */
    public static Long getLongtime(Date date) {
        return date.getTime();
    }

    /**
     * 根据季度值获取该季度的开始时间和结束时间，结束时间
     * <p>
     * Title: getCurrentQuarterStartTime
     * <p>
     * author:孙山伟
     *
     * @return 返回字符串数据，第一个为开始时间格式为yyyy-MM-dd ,第二个是为结束时间格式为yyyy-MM-dd
     */
    public static String[] getCurrentQuarterTime(int quarter) {
        Calendar c = Calendar.getInstance();
        Calendar c1 = Calendar.getInstance();
        String[] result = new String[2];
        String start = "";
        String end = "";
        try {
            if (quarter == 1) {
                c.set(Calendar.MONTH, 0);
                c1.set(Calendar.MONTH, 2);
                c1.set(Calendar.DATE, 31);
            } else if (quarter == 2) {
                c.set(Calendar.MONTH, 3);
                c1.set(Calendar.MONTH, 5);
                c1.set(Calendar.DATE, 30);

            } else if (quarter == 3) {
                c.set(Calendar.MONTH, 6);
                c1.set(Calendar.MONTH, 8);
                c1.set(Calendar.DATE, 30);
            } else if (quarter == 4) {
                c.set(Calendar.MONTH, 9);
                c1.set(Calendar.MONTH, 11);
                c1.set(Calendar.DATE, 31);
            }
            c.set(Calendar.DATE, 1);

            ;
            start = parseDateFormat(c.getTime(), "yyyy-MM-dd");
            end = parseDateFormat(c1.getTime(), "yyyy-MM-dd");

        } catch (Exception e) {
            e.printStackTrace();
        }
        result[0] = start;
        result[1] = end;
        return result;
    }

    /**
     * 根据时间获取属于哪个季度，以数字表示
     * <p>
     * Title: getCurrentQuarter
     * <p>
     * author:孙山伟
     *
     * @param date
     * @return
     */
    public static int getCurrentQuarter(Date date) {
        int result = 0;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(Calendar.MONTH) + 1;
        if (month >= 1 && month <= 3)
            result = 1;
        else if (month >= 4 && month <= 6)
            result = 2;
        else if (month >= 7 && month <= 9)
            result = 3;
        else if (month >= 10 && month <= 12)
            result = 4;
        return result;

    }

    /**
     * 获取年份的开始时间和结束时间，num为0是当前，负数为前几年，num为正数为后几年
     * <p>
     * Title: getCurrentYearTime
     * <p>
     * author:孙山伟
     *
     * @param num
     * @return
     */
    public static String[] getCurrentYearTime(int num) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, 0);
        c.set(Calendar.DATE, 1);
        c.set(Calendar.YEAR, c.get(Calendar.YEAR) + num);
        String start = parseDateFormat(c.getTime(), "yyyy-MM-dd");
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DATE, 31);
        String end = parseDateFormat(c.getTime(), "yyyy-MM-dd");
        return new String[]{start, end};
    }

    /**
     * 获取季度和对应的value值，用于统计页面季度信息初始化操作
     * <p>
     * Title: querter
     * <p>
     * author:孙山伟
     *
     * @return
     */
    public static List<Map<String, String>> querter() {
        List<Map<String, String>> result = new LinkedList<Map<String, String>>();
        String[] tmp = {"第一季度", "第二季度", "第三季度", "第四季度"};
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH) + 1;
        int length = 0;
        if (month >= 10 && month <= 12) {
            length = 4;
        } else if (month >= 7 && month <= 9) {
            length = 3;
        } else if (month >= 4 && month <= 6) {
            length = 2;
        } else {
            length = 1;
        }
        for (int i = 0; i < length; i++) {
            Map<String, String> tt = new HashMap<String, String>();
            tt.put("querterName", tmp[i]);
            tt.put("value", i + 1 + "");
            result.add(tt);
        }
        return result;
    }

    /**
     * 获取当前季度的num值，
     * <p>
     * Title: getQuerterNum
     * <p>
     * author:孙山伟
     *
     * @return
     */
    public static int getQuerterNum() {
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH) + 1;
        int length = 0;
        if (month >= 10 && month <= 12) {
            length = 4;
        } else if (month >= 7 && month <= 9) {
            length = 3;
        } else if (month >= 4 && month <= 6) {
            length = 2;
        } else {
            length = 1;
        }
        return length;

    }

    public static String getFirstDayOfMonth() {
        //获取前月的第一天
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();//获取当前日期
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
        String firstDay = format.format(calendar.getTime());
        return firstDay;
    }

    public static String getLastDayOfMonth(){
        //获取前月的最后一天
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天
        String lastDay = format.format(cale.getTime());
        return lastDay;
    }

    public static String setFirstDayOfMonth(int year, int month){
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calstar= Calendar.getInstance();
        calstar.set(Calendar.YEAR, year);
        calstar.set(Calendar.MONTH, month-1);
        calstar.set(Calendar.DAY_OF_MONTH, 1);
        String star =sm.format(calstar.getTime());
        return star;
    }

    public static String setLastDayOfMonth(int year, int month){
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calstar= Calendar.getInstance();
        calstar.set(Calendar.YEAR, year);
        calstar.set(Calendar.MONTH, month-0);
        calstar.set(Calendar.DAY_OF_MONTH, 0);
        String end =sm.format(calstar.getTime());
        return end;
    }

    public static void main(String[] args) throws ParseException {
        Date date1 = new JDateTime("2015-10-11", "YYYY-MM-DD").convertToDate();
        // Date date2 = new JDateTime("2015-10-11 01:12:12", "YYYY-MM-DD
        // hh:mm:ss").convertToDate();
        //// System.out.println(getPeriodOfHour(date1,date2));
        // System.out.println(isAfter("2015-10-11 01:13:12", "YYYY-MM-DD
        // hh:mm:ss", "2015-10-11 01:12:12", "YYYY-MM-DD hh:mm:ss"));
        // System.out.println(compareTo("2015-10-11 01:11:12", "YYYY-MM-DD
        // hh:mm:ss", "2015-10-11 01:12:12", "YYYY-MM-DD hh:mm:ss"));
        // System.out.println(getCurrentYear(new Date()));
        // System.out.println(isLeepNear(2016));

//		int i = 2017;
//		i -= 1;
//		System.out.println(querter());
//        System.out.println(getFirstDayOfMonth(new Date()));
//        System.out.println(getLastDayOfMonth(getCurrentYear(new Date()),getCurrentMonth(new Date())));
//        System.out.println(getFirstDayOfMonth());
        //System.out.println(getLastDayOfMonth());
        //System.out.println(getCurrentMonth(setDateFormat("2018-05")));
        //String date = parseDateFormat(subHour(new Date(),9));
        System.out.println(setDateFormat(parseDateFormat(subHour(new Date(),9),"yyyy-MM-dd HH:00:00"),"yyyy-MM-dd HH:00:00"));
        System.out.println(setDateFormat(parseDateFormat(subHour(new Date(),9),"yyyy-MM-dd HH:00:00")));
    }
}
