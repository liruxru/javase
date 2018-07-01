package com.bonc.date;

import java.sql.Timestamp;
import java.util.Date;

public class MyTimeStamp {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        System.out.println(timestamp);
    }
}
