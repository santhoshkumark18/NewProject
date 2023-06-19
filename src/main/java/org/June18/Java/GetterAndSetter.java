package org.June18.Java;
class sum {
    private int a;
    void setData(int a) {
        this.a=a;
    }
    int getData() {
        return  a;
    }
    public void dis() {
        System.out.println(a);
    }
}
public class GetterAndSetter {
    public static void main(String[] args) {
        sum obj = new sum();
        obj.setData(10);
        System.out.println(obj.getData());
        obj.dis();
    }
}
