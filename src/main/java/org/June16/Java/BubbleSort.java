package org.June16.Java;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,2,5,72,7,4,7,4};
        int temp=0;
        for(int i=1;i<arr.length;i++) {
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i :arr) {
            System.out.println(i);
        }
    }
}
