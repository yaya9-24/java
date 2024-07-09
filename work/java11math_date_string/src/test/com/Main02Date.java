package test.com;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main02Date {
    public static void main(String[] args) {
        System.out.println("hello");

        //날짜관련 객체
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(sdf.format(d));
        sdf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초(SSS)");
        System.out.println(sdf.format(d));

//        java.sql.Date sd = new java.sql.Date(0);
        java.sql.Date sd = new java.sql.Date(System.currentTimeMillis()); //반드시 외우기
        System.out.println(sd);

        Timestamp ts = new Timestamp(0);
        System.out.println(ts);
        ts = new Timestamp(System.currentTimeMillis());
        System.out.println(ts);


        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc);
        System.out.println(gc.get(Calendar.YEAR)); //2024
        System.out.println(gc.get(Calendar.MONTH)); //0-11
        System.out.println(gc.get(Calendar.DAY_OF_MONTH)); //
        System.out.println(gc.get(Calendar.HOUR));
        System.out.println(gc.get(Calendar.MINUTE));
        System.out.println(gc.get(Calendar.SECOND));
        System.out.println(gc.get(Calendar.MILLISECOND));
        System.out.println("===========================");
        gc = new GregorianCalendar(2222,12,22,2,2,2);
        System.out.println(gc);
        System.out.println(gc.get(Calendar.YEAR)); //2024
        System.out.println(gc.get(Calendar.MONTH)); //0-11
        System.out.println(gc.get(Calendar.DAY_OF_MONTH)); //
        System.out.println(gc.get(Calendar.HOUR));
        System.out.println(gc.get(Calendar.MINUTE));
        System.out.println(gc.get(Calendar.SECOND));
        System.out.println(gc.get(Calendar.MILLISECOND));
    } //end main
} //end class
