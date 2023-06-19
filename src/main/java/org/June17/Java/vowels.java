package org.June17.Java;

public class vowels {
    public static void main(String[] args) {
        String str ="santhoshkumar";
        int vCount=0,cCount=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') {
                vCount++;
            } else {
                cCount++;
            }

        }
        System.out.println(vCount);
        System.out.println(cCount);
    }
}
