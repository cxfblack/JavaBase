package com.day07code;

/*
    �������ָ����ͬ
 */
public class StudentTest03 {
    public static void main(String[] args) {
        //������һ������ʹ��
        Student s1 = new Student();

        s1.name = "����ϼ";
        s1.age = 30;
        System.out.println(s1.name + "," + s1.age);

        //�ѵ�һ������ĵ�ַ��ֵ���ڶ�������
        Student s2 = s1;

        s2.name = "������";
        s2.age = 28;
        System.out.println(s1.name + "," + s1.age);
        System.out.println(s2.name + "," + s2.age);
    }
}
