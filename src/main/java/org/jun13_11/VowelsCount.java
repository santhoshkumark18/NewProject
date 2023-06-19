package org.jun13_11;

public class VowelsCount {
    public static void main(String[] args) {
        String str = "santhoshkumar";
        int vowelsCount=0,ConsCount=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowelsCount++;
            }
            ConsCount++;
        }
        System.out.println("vowelsCount"+vowelsCount);
        System.out.println("ConsCount"+ConsCount);
    }
}
