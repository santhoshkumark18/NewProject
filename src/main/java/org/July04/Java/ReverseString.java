package org.July04.Java;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name =sc.nextLine();
        String nstr="";
        char ch;
        for(int i=0;i<name.length();i++) {
            ch=name.charAt(i);
            nstr = ch+ nstr;
        }
        System.out.println(nstr);
    }
}
