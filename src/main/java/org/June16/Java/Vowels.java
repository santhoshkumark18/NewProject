package org.June16.Java;



public class Vowels {
    public static void main(String[] args) {
        String str ="santhoshkumar";
        char[] vch = new char[str.length()];
        char[]cch=new char[str.length()];
        int vowelsCount=0,consCount=0;
        for(int i=0;i<str.length();i++) {
            char ch= str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowelsCount++;
                vch[i]=ch;
            }else  {
                consCount++;
                cch[i]=ch;
            }

        }
        System.out.println(vowelsCount+"+"+consCount);
        System.out.println(vch);
        System.out.println(cch);
    }
}
