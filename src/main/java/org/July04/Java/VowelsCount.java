package org.July04.Java;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name =sc.nextLine();
        int vCount=0,cCount=0;
        for(int i=0;i<name.length();i++) {
            char ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vCount++;
            } else {
                cCount++;
            }
        }
        System.out.println("VowelsCount"+vCount);
        System.out.println("ConstantCount"+cCount);
    }
}
