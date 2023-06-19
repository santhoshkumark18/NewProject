package org.June16.Java;

public class UpperCase {
    public static void main(String[] args) {

        StringBuilder stringBuilde = new StringBuilder("SANTHOSHKUMAR");
        for(int i=0;i<stringBuilde.length();i++) {

            if(stringBuilde.charAt(i)>=97 && stringBuilde.charAt(i)<=122) {
                int c=(char)stringBuilde.charAt(i)+32;
                stringBuilde.setCharAt(i,(char)c);
            }
        }
        System.out.println(stringBuilde);

    }
}
