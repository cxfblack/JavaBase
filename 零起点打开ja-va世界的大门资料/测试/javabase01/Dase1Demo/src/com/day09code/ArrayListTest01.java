package com.day09code;

import java.util.ArrayList;

/*
    ����
        ����һ���洢�ַ����ļ��ϣ��洢3���ַ���Ԫ�أ�ʹ�ó���ʵ���ڿ���̨�����ü���

    ˼·��
        1:�������϶���
        2:������������ַ�������
        3:�������ϣ�����Ҫ�ܹ���ȡ�������е�ÿһ��Ԫ�أ����ͨ��get(int index)����ʵ��
        4:�������ϣ����Ҫ�ܹ���ȡ�����ϵĳ��ȣ����ͨ��size()����ʵ��
        5:�������ϵ�ͨ�ø�ʽ
 */
/*
public class ArrayListTest01 {
    public static void main(String[] args) {
        //�������϶���
        ArrayList<String> array = new ArrayList<String>();

        //������������ַ�������
        array.add("������");
        array.add("������");
        array.add("������");

        //�������ϣ�����Ҫ�ܹ���ȡ�������е�ÿһ��Ԫ�أ����ͨ��get(int index)����ʵ��
//        System.out.println(array.get(0));
//        System.out.println(array.get(1));
//        System.out.println(array.get(2));

//        for(int i=0; i<3; i++) {
//            System.out.println(array.get(i));
//        }

        //�������ϣ����Ҫ�ܹ���ȡ�����ϵĳ��ȣ����ͨ��size()����ʵ��
//        System.out.println(array.size());

        //�������ϵ�ͨ�ø�ʽ
        for(int i=0; i<array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}*/
public class ArrayListTest01 {
    public static void main(String[] args) {
        //�������϶���
        ArrayList<String> array = new ArrayList<String>();

        //������������ַ�������
        array.add("������");
        array.add("������");
        array.add("������");
        
        for (int i = 0; i<array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}