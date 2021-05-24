package com.day07code;

/*
    测试类
 */
public class StudentDemo08 {
    public static void main(String[] args) {
        //创建对象
        Student08 s1 = new Student08();
        s1.show();

        //public Student(String name)
        Student08 s2 = new Student08("林青霞");
        s2.show();

        //public Student(int age)
        Student08 s3 = new Student08(30);
        s3.show();

        //public Student(String name,int age)
        Student08 s4 = new Student08("林青霞",30);
        s4.show();
    }
}
