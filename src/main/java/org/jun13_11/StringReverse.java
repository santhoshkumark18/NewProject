package org.jun13_11;

public class StringReverse {
    public static void main(String[] args) {
        String str ="santhoshkumarK";
        String nstr = "";
        char ch;
        for(int i=0;i<str.length();i++) {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println(nstr);
    }
}
