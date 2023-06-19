package org.June18.Java;

public class StringLower {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SANTHOSHKUMAR");
        for(int i=0;i<sb.length();i++) {
            if(sb.charAt(i)>=65 && sb.charAt(i)<=90) {
                int c=(char)sb.charAt(i)+32;
                sb.setCharAt(i,(char) c);
            }
        }
        System.out.println(sb);
    }
}
