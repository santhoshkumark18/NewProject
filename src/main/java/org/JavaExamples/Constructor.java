package org.JavaExamples;
class rect {
    int length,width;
    rect() {
        length=4;
        width=5;
    }
    rect(int length,int width) {
        this.length=length;
        this.width= width;
    }
    public int area() {
        return length* width;
    }
}
public class Constructor {
    public static void main(String[] args) {
        rect obj = new rect(10,20);
        rect obj1 = new rect();
        System.out.println(obj1.area());
        rect[] arr = new rect[5];
        arr[0] = new rect(1,2);
        arr[1] = new rect(1,2);
        arr[2] = new rect(1,2);
        arr[3] = new rect(1,2);
        arr[4] = new rect(1,2);
        for(int i=0;i< arr.length;i++) {
            System.out.println(arr[i].area());
        }
    }
}
