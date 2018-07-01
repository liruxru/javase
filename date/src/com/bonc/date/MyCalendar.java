package com.bonc.date;

import java.util.Calendar;

public class MyCalendar {
    public static void main(String[] args) {
//      Calendar类是一个抽象类，在实际使用时实现特定的子类的对象，
//      创建对象的过程对程序员来说是透明的，只需要使用getInstance方法创建即可。
        Calendar c1 = Calendar.getInstance();//默认是当前日期
        // 获得年份
        int year = c1.get(Calendar.YEAR);
//      获得月份
        int month = c1.get(Calendar.MONTH) + 1;
//      获得日期
        int date = c1.get(Calendar.DATE);
//      获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = c1.get(Calendar.DAY_OF_WEEK);
//      获得小时
        int hour = c1.get(Calendar.HOUR_OF_DAY);
//      获得分钟
        int minute = c1.get(Calendar.MINUTE);
//      获得秒
        int second = c1.get(Calendar.SECOND);

        c1.add(Calendar.DATE, 10);
//      把c1对象的日期减去10，也就是c1也就表示为10天前的日期，其它所有的数值会被重新计算
        System.out.println(c1.get(Calendar.DATE));
        c1.add(Calendar.DATE, -10);

    }
}
