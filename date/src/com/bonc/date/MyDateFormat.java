package com.bonc.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 具体可参考
 * http://www.runoob.com/java/java-date-time.html
 */
public class MyDateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//        18-7-1 上午9:59
        System.out.println(simpleDateFormat.format(date));

//      星期日 2018-07-182 10:00:24
//      其中 yyyy 是完整的公元年，MM 是月份，dd 是日期，HH:mm:ss 是时、分、秒。
//      注意:有的格式大写，有的格式小写，
//      例如 MM 是月份，mm 是分；HH 是 24 小时制，而 hh 是 12 小时制。
//      SS 是毫秒 ss 是秒
//      E 是星期几
        simpleDateFormat = new SimpleDateFormat("E yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(date));
    }
}
