package com.day08code;

/*
    ʹ�� == ���Ƚϣ�
        �������ͣ��Ƚϵ�������ֵ�Ƿ���ͬ
        �������ͣ��Ƚϵ��ǵ�ֵַ�Ƿ���ͬ

     public boolean equals?(Object anObject)��
        �����ַ�����ָ��������бȽϡ��������ǱȽϵ����ַ����������Բ���ֱ�Ӵ���һ���ַ���
 */
public class StringDemo02 {
    public static void main(String[] args) {
        //���췽���ķ�ʽ�õ�����
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        //ֱ�Ӹ�ֵ�ķ�ʽ�õ�����
        String s3 = "abc";
        String s4 = "abc";

        //�Ƚ��ַ��������ַ�Ƿ���ͬ
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("--------");

        //�Ƚ��ַ��������Ƿ���ͬ
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
