package org.June14.JavaPractices;

public class vowelsandcons {
    public static void main(String[] args) {
        String name="santhoshkumar";
        char ch;
        int vowelsCount=0,consCount=0;
        for(int i=0;i<name.length();i++) {
            ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowelsCount++;
            }
            consCount++;
        }
        System.out.println("v"+vowelsCount);
        System.out.println("c"+consCount);
    }
}
