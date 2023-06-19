package org.June17.Java;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("santhoshkumar");
        for(int i=0;i<stringBuilder.length();i++) {
            if(stringBuilder.charAt(i)>92 && stringBuilder.charAt(i)<122) {
                int c = (char)stringBuilder.charAt(i)-32;
                stringBuilder.setCharAt(i,(char)c);
            }
        }
        System.out.println(stringBuilder);
    }
}
