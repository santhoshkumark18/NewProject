package org.JavaExamples;
class name {
    int age=21,rollno=89;
    void display() {
        System.out.println(age);
        System.out.println(rollno);
    }
}
class  student extends name{
    @Override
    void display() {
        super.display();
        System.out.println("my name is santhoshkumar");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        student obj = new student();
        obj.display();
    }
}
