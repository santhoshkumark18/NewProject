package org.June18.Java;

public class VowelsCount {
    public static void main(String[] args) {
        int vCount=0;
        int cCount=0;
        String str = "santhoshkumar";
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vCount++;
            } else {
                cCount++;
            }
        }
        System.out.println(vCount +"+"+cCount);
    }
}
