package org.June14.JavaPractices;

public class reverseStirng {
    public static void main(String[] args) {
        String name="santhoshkumar";
        String nstr="";
        char ch;
        for(int i=0;i<name.length();i++) {
            ch=name.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println(nstr);
    }
}
