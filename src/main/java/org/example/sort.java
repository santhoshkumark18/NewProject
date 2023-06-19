package org.example;

public class sort {
    public static void main(String[] args) {

       int[] arr= {5, 2, 8, 4, 9, 6};
       int temp=0;
       for(int i=0;i<arr.length -1;i++) {
           for (int j=1;j<arr.length -i;j++) {
               if(arr[j-1]>arr[j]) {
                   temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
               }
           }
       }
        for( int i :arr) {
            System.out.println(i);
        }
    }
}
