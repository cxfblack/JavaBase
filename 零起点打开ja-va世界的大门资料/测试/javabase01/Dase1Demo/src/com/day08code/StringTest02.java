package com.day08code;

import java.util.Scanner;

/*
    ����
        ����¼��һ���ַ�����ʹ�ó���ʵ���ڿ���̨�������ַ���

    ˼·��
        1:����¼��һ���ַ������� Scanner ʵ��
        2:�����ַ���������Ҫ�ܹ���ȡ���ַ����е�ÿһ���ַ�
            public char charAt?(int index)������ָ����������charֵ���ַ���������Ҳ�Ǵ�0��ʼ��
        3:�����ַ��������Ҫ�ܹ���ȡ���ַ����ĳ���
            public int length?()�����ش��ַ����ĳ���
            ����ĳ��ȣ�������.length
            �ַ����ĳ��ȣ��ַ�������.length()
        4:�����ַ�����ͨ�ø�ʽ
 */
/*
public class StringTest02 {
    public static void main(String[] args) {
        //����¼��һ���ַ������� Scanner ʵ��
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ���ַ�����");
        String line = sc.nextLine();

        //�����ַ���������Ҫ�ܹ���ȡ���ַ����е�ÿһ���ַ�
//        System.out.println(line.charAt(0));
//        System.out.println(line.charAt(1));
//        System.out.println(line.charAt(2));

//        for(int i=0; i<3; i++) {
//            System.out.println(line.charAt(i));
//        }

        //�����ַ��������Ҫ�ܹ���ȡ���ַ����ĳ���
//        System.out.println(line.length());

        for(int i=0; i<line.length(); i++) {
            System.out.println(line.charAt(i));
        }

    }
}*/
public class StringTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ���ַ���");
        String line = sc.nextLine();

        for (int i = 0; i<line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
