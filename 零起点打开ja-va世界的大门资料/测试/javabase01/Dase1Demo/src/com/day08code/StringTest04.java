package com.day08code;

/*
    ����
        ����һ���������� int �����е����ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ������أ����ø÷��������ڿ���̨��������
        ���磬����Ϊ int[] arr = {1,2,3}; ��ִ�з������������Ϊ��[1, 2, 3]

    ˼·��
        1:����һ�� int ���͵����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
        2:����һ�����������ڰ� int �����е����ݰ���ָ����ʽƴ�ӳ�һ���ַ������ء�
          ����ֵ���� String�������б� int[] arr
        3:�ڷ����б������飬����Ҫ�����ƴ��
        4:���÷�������һ���������ս��
        5:������
 */
/*
public class StringTest04 {
    public static void main(String[] args) {
        //����һ�� int ���͵����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
        int[] arr = {1, 2, 3};

        //���÷�������һ���������ս��
        String s = arrayToString(arr);

        //������
        System.out.println("s:" + s);
    }

    //����һ�����������ڰ� int �����е����ݰ���ָ����ʽƴ�ӳ�һ���ַ�������
    *//*
        ������ȷ��
            ����ֵ���ͣ�String
            ������int[] arr
     *//*
    public static String arrayToString(int[] arr) {
        //�ڷ����б������飬����Ҫ�����ƴ��
        String s = "";

        s += "[";

        for(int i=0; i<arr.length; i++) {
            if(i==arr.length-1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }

        s += "]";

        return s;
    }
}*/
public class StringTest04 {
    public static void main(String[] args) {
        //����һ�� int ���͵����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
        int[] arr = {1, 2, 3};

        String s = arrayToString(arr);
        System.out.println("s:" + s );
    }
    public static String arrayToString(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i<arr.length; i++) {
            if(i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";

        return s;

    }
}