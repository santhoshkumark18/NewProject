package org.June20.Java;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int countOfWords= arr.length;
        int vCount=0,cCount=0;
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                vCount++;
            } else {
                cCount++;
            }
        }
        String a="apple";
        String b="APPLE";
        System.out.println(a.equals(b));
        System.out.println("vCount "+vCount);
        System.out.println("cCount "+cCount);
        System.out.println("countOfWords "+countOfWords);
    }
}
