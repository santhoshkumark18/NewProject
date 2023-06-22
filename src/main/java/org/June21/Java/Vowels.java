package org.June21.Java;

public class Vowels {
    public static void main(String[] args) {
        String str = "santhoshkumar";
        int cCount=0,vCount=0;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vCount++;
            } else {
                cCount++;
            }
        }
        System.out.println(vCount +" "+cCount);
    }
}
