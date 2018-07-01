package com.bonc.date;

import java.util.Date;

public class UtliDate {
    public static void main(String[] args) {
        // 构造器
        Date date = new Date();

//        toString()
//        -->Sun Jul 01 09:51:12 CST 2018
//        把此 Date 对象转换为以下形式的 String：
//        dow mon dd hh:mm:ss zzz yyyy其中：
//        dow 是一周中的某一天 (Sun, Mon, Tue, Wed, Thu, Fri, Sat)。
//        mon 是月份 (Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec)。
//        dd 是一月中的某一天（01 至 31），显示为两位十进制数。
//        hh 是一天中的小时（00 至 23），显示为两位十进制数。
//        mm 是小时中的分钟（00 至 59），显示为两位十进制数。
//        ss 是分钟中的秒数（00 至 61），显示为两位十进制数。
//        zzz 是时区（并可以反映夏令时）。标准时区缩写包括方法 parse 识别的时区缩写。如果不提供时区信息，则 zzz 为空，即根本不包括任何字符。
//        yyyy 是年份，显示为 4 位十进制数。


        System.out.println(date);
//       toLocaleString() 2018-7-1 9:54:16
        System.out.println(date.toLocaleString());
        // 获取代表该时间的长整型毫秒数
        long time = date.getTime();
        System.out.println(time);

        Date date1 = new Date();
        // true 比较两个日期的相等性。 如果两个时间 new 的时间相近，返回结果是不确定的
        System.out.println(date.equals(date1));
        // 如果相等返回 0
        System.out.println(date.compareTo(date1));
        try {
            Thread.sleep(400);
            Date date2 = new Date();
            // date 早于 date2 返回true
            System.out.println(date.before(date2));
            // date 早于 date2 返回 -1
            System.out.println(date.compareTo(date2));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
