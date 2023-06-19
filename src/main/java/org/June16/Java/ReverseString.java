package org.June16.Java;

public class ReverseString {
    public static void main(String[] args) {
        String str ="santhoshkumar";
        String nstr="";
/*        for(int i=str.length()-1;i>=0;i--) {
            nstr+=str.charAt(i);
        }
        System.out.println(nstr);*/
        char ch;
        for(int i=0;i<str.length();i++) {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println(nstr);
    }
}
