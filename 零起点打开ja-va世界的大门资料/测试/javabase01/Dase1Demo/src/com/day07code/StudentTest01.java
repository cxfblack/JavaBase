package com.day07code;

/*
    ��������
 */
public class StudentTest01 {
    public static void main(String[] args) {
        //��������
        Student s = new Student();

        System.out.println(s);

        //ʹ�ó�Ա����
        System.out.println(s.name + "," + s.age);

        s.name = "������";
        s.age = 28;

        System.out.println(s.name + "," + s.age);

        //ʹ�ó�Ա����
        s.study();
        s.doHomework();
    }
}
