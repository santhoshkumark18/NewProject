package org.June17.Java;

public class ReverseStirng {
    public static void main(String[] args) {
        String str ="santhoshkumar";
        String nstr ="";
        char ch;
        /*for(int i=0;i<str.length();i++) {
            ch=str.charAt(i);
            nstr = ch+nstr;
        }*/
        for(int i=str.length()-1;i>=0;i--) {
            ch=str.charAt(i);
            nstr=ch+nstr;

        }
        System.out.println(nstr);
    }
}
