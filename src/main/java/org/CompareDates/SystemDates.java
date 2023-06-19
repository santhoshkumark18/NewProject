package org.CompareDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class date {
    public void getDaysFromLocalSys() throws ParseException {  // method to get days of the week locally
        // initialize calendar
        Calendar calendar = Calendar.getInstance();
        // date format

       SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

        // array to store days of the week
        String[] days = new String[7];
        // start week from sunday
        int delta = -calendar.get(GregorianCalendar.DAY_OF_WEEK) + 1;
        System.out.println("delta"+calendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("minus delta"+delta);
        System.out.println("day of month "+Calendar.DAY_OF_MONTH);

        calendar.add(Calendar.DAY_OF_MONTH, delta);
        System.out.println("day of month1 "+Calendar.DAY_OF_MONTH);
        System.out.println("now "+calendar.getTime());
        for (int i = 0; i < 7; i++) {
            days[i] = format.format(calendar.getTime());
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        List<String>localDateList= new ArrayList<>();
        // store dates in arraylist
        ArrayList<String> tempLocalDateList = new ArrayList<String>(Arrays.asList(days));
        System.out.println(tempLocalDateList);
        for(int i = 0; i<tempLocalDateList.size(); i++) {
            LocalDate tempDate = LocalDate.parse(tempLocalDateList.get(i), DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            String finalDate = tempDate.toString();
            SimpleDateFormat dateMonth = new SimpleDateFormat("EE, dd MMM", Locale.ENGLISH);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(finalDate);
            String localBackDate = dateMonth.format(date);
            localDateList.add(localBackDate);
        }

        System.out.println("The current week on the local system consists of the following dates: \n" + localDateList);
    }
}

public class SystemDates {
    public static void main(String[] args) throws ParseException {
        date obj = new date();
        obj.getDaysFromLocalSys();
    }
}
