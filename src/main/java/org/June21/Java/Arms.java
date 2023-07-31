package org.June21.Java;

import java.util.Calendar;
import java.util.Scanner;

public class Arms {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rem = 0, res = 0, temp = num;
        while (temp != 0) {
            rem = temp % 10;
            res += rem * rem * rem;
            temp /= 10;
        }
        if (num == res) {
            System.out.println(res + "is armstrong number");
        } else {
            System.out.println(res + " is not arms number");
        }*/
        Calendar calendar = Calendar.getInstance();
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.printf("dayofMonth"+dayOfMonth);
        calendar.add(Calendar.DAY_OF_MONTH,10);
        System.out.printf(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
    }
}

