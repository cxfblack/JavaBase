package com.day09code;

import java.util.ArrayList;

/*
    ArrayList���췽����
        public ArrayList?()������һ���յļ��϶���

    ArrayList��ӷ�����
        public boolean add(E e)����ָ����Ԫ��׷�ӵ��˼��ϵ�ĩβ
        public void add(int index,E element)���ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
 */
/*
public class ArrayListDemo01 {
    public static void main(String[] args) {
        //public ArrayList?()������һ���յļ��϶���
//        ArrayList<String> array = new ArrayList<>();

        ArrayList<String> array = new ArrayList<String>();

        //public boolean add(E e)����ָ����Ԫ��׷�ӵ��˼��ϵ�ĩβ
//        System.out.println(array.add("hello"));

        array.add("hello");
        array.add("world");
        array.add("java");

        //public void add(int index,E element)���ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
        array.add(1,"javase");
//        array.add(3,"javaee");

        //IndexOutOfBoundsException
//        array.add(4,"javaee");

        //�������
        System.out.println("array:" + array);

    }
}*/
public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add(3,"javaSE");
        System.out.println("arrayList:" + arrayList);
    }
}
