package org.JavaExamples;

public class palindrome {
    public static void main(String[] args) {
        String str ="nibin";
        String nstr="";
        char ch;
        for(int i=0;i<str.length();i++) {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println(nstr);
        if(str.equals(nstr)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
