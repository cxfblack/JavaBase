package com.day07code;
/*
    ��������
        ��ʽ������ ������ = new ����();
        ������Phone p = new Phone();

    ʹ�ö���
        1��ʹ�ó�Ա����
            ��ʽ��������.������
            ������p.brand
        2��ʹ�ó�Ա����
            ��ʽ��������.������()
            ������p.call()
 */
public class PhoneDemo {
    public static void main(String[] args) {
        //��������
        Phone p = new Phone();

        //ʹ�ó�Ա����
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "С��";
        p.price = 2999;

        System.out.println(p.brand);
        System.out.println(p.price);

        //ʹ�ó�Ա����
        p.call();
        p.sendMessage();
    }
}
