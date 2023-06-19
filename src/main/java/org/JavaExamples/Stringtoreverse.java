package org.JavaExamples;

import java.util.*;

public class Stringtoreverse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        String str = sc.next();
        String nstr="";
        char ch;
  /*      for(int i=0;i<str.length();i++) {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println(nstr);
        StringBuilder builder = new StringBuilder("santhoshkumar");
        System.out.println(builder.length());*/
        int cons=0,vowels=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
                vowels++;
            } else {
                cons++;
            }
        }
        Set<String> set = new HashSet<>();
        System.out.println(vowels +"+"+ cons);

        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"mango");
        map.put(1,"orange");
        map.put(2,"apple");
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getValue());
        }
    }
}
