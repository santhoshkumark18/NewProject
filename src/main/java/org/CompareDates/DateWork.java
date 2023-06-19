package org.CompareDates;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

interface  name {
     default void dis() {
        System.out.println("hi");
    }
    private  void gun() {
        System.out.println("gun");
    }
    void nam();
}
public class DateWork {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = -calendar.get(Calendar.DAY_OF_WEEK) + 1;
        /*System.out.println(calendar.get(Calendar.DAY_OF_MONTH));*/
        System.out.println(dayOfMonth);
        System.out.println(-dayOfWeek + 1);
        calendar.add(Calendar.DAY_OF_MONTH, dayOfWeek);
        System.out.println("added " + calendar.getTime());
        SimpleDateFormat format = new SimpleDateFormat("EE, dd MMM");
        String[] tempdate= new String[7];
        LinkedList<String> lst = new LinkedList<>();

        for(int i=0;i<tempdate.length;i++) {
            lst.add(i,format.format(calendar.getTime()));
            calendar.add(Calendar.DAY_OF_MONTH,1);
        }
        System.out.println(lst);
        //System.out.println(Arrays.toString(tempdate));
        ChromeDriver driver = new ChromeDriver();
        driver.findElement(By.id(""));
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
    }
}
