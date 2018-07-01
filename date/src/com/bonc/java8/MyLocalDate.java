package com.bonc.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * LocalDate
 * LocalDateTime
 * LocalTime
 * MonthDay
 */
public class MyLocalDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();// 取当前日期
        LocalDate localDate = LocalDate.of(2017, 6, 1);// 根据年月日取日期，12月就是12：
        LocalDate endOfFeb = LocalDate.parse("2014-02-28");
        int year = localDate.getYear();//年
        Month month = localDate.getMonth();//月
        int dayOfMonth = localDate.getDayOfMonth();//日
        int dayOfYear = localDate.getDayOfYear();//年中的第几天

        LocalDate date = LocalDate.now();// 取当前日期
        LocalDate localDate1 = date.plusDays(1);//时间加1天
        LocalDate localDate2 = date.minusDays(1);

        LocalDate localDate3 = date.plusWeeks(1);//加1个星期
        LocalDate localDate4 = date.minusWeeks(1);

        LocalDate localDate5 = date.plusMonths(1);
        LocalDate localDate6 = date.minusMonths(1);

        LocalDate localDate7 = date.plusYears(1);//加1年
        LocalDate localDate8 = date.minusYears(1);

        date.plus(1, ChronoUnit.DAYS);//等同于   date.plusDays(1);//时间加1天
        date.minus(1, ChronoUnit.DAYS);

        boolean leapYear = localDate.isLeapYear();//是否是闰年


        /**
         *判断日期是否相等  比如节假日、生日
         */
        MonthDay monthDay = MonthDay.of(7, 18);
        MonthDay day = MonthDay.from(localDate);
        if (monthDay.equals(day)) {
            System.out.println("Many Many happy returns of the day !!");
        } else {
            System.out.println("Sorry, today is not your birthday");
        }

        /**
         * 计算两个日期时间差
         */
        LocalDate begin = LocalDate.of(2017, 7, 19);
        LocalDate end = LocalDate.of(2018, 8, 1);
        Period between = Period.between(begin, end);
        int days = between.getDays();
        int months = between.getMonths();
        int years = between.getYears();
        System.out.println(between+"\n年-->"+years+";月-->"+months+";日-->"+days);
        /**
         * 处理不同的时区
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime1);

        /**
         *清除毫秒数
         * 13:42:01
         * 13:42:01.896
         */
        System.out.println(LocalTime.now().withNano(0)); // 11:09:09);
        System.out.println(LocalTime.now());

        /**
         * 日期转换格式化
         * 查看源代码可以看到字符代表含义
         */
        String dateStr = "2017-07-17";

        // 使用默认格式
        LocalDate parse = LocalDate.parse(dateStr);
        System.out.println(parse);
        // 使用自定义格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDateParse = LocalDate.parse(dateStr, dateTimeFormatter);
        System.out.println(localDateParse);

        LocalDateTime localDateToFormat = localDateTime.now();
        System.out.println(localDateToFormat);
        DateTimeFormatter dateTimeFormatterText = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = localDateToFormat.format(dateTimeFormatterText);
        System.out.println(format);
    }
}
