package org.JavaExamples;
class getter {
    int length,width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
public class GetterAndSetters {
    public static void main(String[] args) {
        getter obj = new getter();
        obj.setLength(10);
        obj.setWidth(30);
        System.out.println(obj.getLength());
        System.out.println(obj.getWidth());
    }
}
