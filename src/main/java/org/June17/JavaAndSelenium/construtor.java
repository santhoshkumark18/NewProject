package org.June17.JavaAndSelenium;
class sum {
    private int a,b;
    sum(int a,int b) {
        this.a=a;
        this.b=b;
    }
    void display() {
        System.out.println(a+b);
    }
    sum(sum obj) {
        this.a=obj.a;
        this.b=obj.b;
    }
}
public class construtor {
    public static void main(String[] args) {
        sum obj = new sum(10,20);
        obj.display();
    }
}
//id,name,class,linktext,partiallinktext,css,xpath,tagname;