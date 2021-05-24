package com.day08code;
/*
    String���췽����
        public String()������һ���հ��ַ������󣬲������κ�����
        public String(char[] chs)�������ַ���������ݣ��������ַ�������
        public String(byte[] bys)�������ֽ���������ݣ��������ַ�������
        String s = ��abc��;	ֱ�Ӹ�ֵ�ķ�ʽ�����ַ����������ݾ���abc

        �Ƽ�ʹ��ֱ�Ӹ�ֵ�ķ�ʽ�õ��ַ�������
 */
public class StringDemo01 {
    public static void main(String[] args) {
        //public String()������һ���հ��ַ������󣬲������κ�����
        String s1 = new String();
        System.out.println("s1:" + s1);

        //public String(char[] chs)�������ַ���������ݣ��������ַ�������
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        //public String(byte[] bys)�������ֽ���������ݣ��������ַ�������
        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        //String s = ��abc��;	ֱ�Ӹ�ֵ�ķ�ʽ�����ַ����������ݾ���abc
        String s4 = "abc";
        System.out.println("s4:" + s4);
    }
}
