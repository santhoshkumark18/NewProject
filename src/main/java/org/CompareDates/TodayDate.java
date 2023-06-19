package org.CompareDates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Locale.ENGLISH;

public class TodayDate {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        Date today=calendar.getTime();
        System.out.println(today);
        SimpleDateFormat format = new SimpleDateFormat("EE, dd MMM");
        String compateDate=format.format(today);
        System.out.println(format.format(today));
//second task
        SimpleDateFormat month = new SimpleDateFormat("MMMM");

        System.out.println(month.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.YEAR));
        String finalcomdate=month.format(calendar.getTime())+" "+calendar.get(Calendar.YEAR);
        System.out.println(finalcomdate);

        //last one
        Calendar calendar1 =Calendar.getInstance();
        calendar1.add(Calendar.DAY_OF_MONTH,-15);
        System.out.println(format.format(calendar1.getTime()));
    }
}
