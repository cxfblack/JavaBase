package com.day07code;

/*
    �������
 */
public class StudentTest02 {
    public static void main(String[] args) {
        //������һ������ʹ��
        Student s1 = new Student();

        s1.name = "����ϼ";
        s1.age = 30;
        System.out.println(s1.name + "," + s1.age);

        s1.study();
        s1.doHomework();

        //�����ڶ�������ʹ��
        Student s2 = new Student();

        s2.name = "������";
        s2.age = 28;
        System.out.println(s2.name + "," + s2.age);

        s2.study();
        s2.doHomework();
    }
}
