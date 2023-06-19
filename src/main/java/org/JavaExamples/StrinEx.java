package org.JavaExamples;

public class StrinEx {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("SANTHOSHKUMAR");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<buffer.length();i++) {
            if(buffer.charAt(i)>=65 && buffer.charAt(i)<=90) {
                int c=(int)buffer.charAt(i)+32;
                stringBuilder.append((char)c);
            }
        }
        System.out.println(stringBuilder);
    }
}
