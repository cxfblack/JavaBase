package com.day08code;

import java.util.Scanner;

/*
    ����
        ����¼��һ���ַ�����ͳ�Ƹ��ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���(�����������ַ�)

    ˼·��
        1:����¼��һ���ַ������� Scanner ʵ��
        2:Ҫͳ���������͵��ַ��������趨������ͳ�Ʊ�������ʼֵ��Ϊ0
        3:�����ַ������õ�ÿһ���ַ�
        4:�жϸ��ַ������������ͣ�Ȼ���Ӧ���͵�ͳ�Ʊ���+1
            ����ch��һ���ַ�����Ҫ�ж������ڴ�д��ĸ��Сд��ĸ���������֣�ֱ���жϸ��ַ��Ƿ��ڶ�Ӧ�ķ�Χ����
            ��д��ĸ��ch>='A' && ch<='Z'
            Сд��ĸ�� ch>='a' && ch<='z'
            ���֣� ch>='0' && ch<='9'
        5:����������͵��ַ�����
 */
/*
public class StringTest03 {
    public static void main(String[] args) {
        //����¼��һ���ַ������� Scanner ʵ��
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ���ַ�����");
        String line = sc.nextLine();

        //Ҫͳ���������͵��ַ��������趨������ͳ�Ʊ�������ʼֵ��Ϊ0
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        //�����ַ������õ�ÿһ���ַ�
        for(int i=0; i<line.length(); i++) {
            char ch = line.charAt(i);

            //�жϸ��ַ������������ͣ�Ȼ���Ӧ���͵�ͳ�Ʊ���+1
            if(ch>='A' && ch<='Z') {
                bigCount++;
            } else if(ch>='a' && ch<='z') {
                smallCount++;
            } else if(ch>='0' && ch<='9') {
                numberCount++;
            }
        }

        //����������͵��ַ�����
        System.out.println("��д��ĸ��" + bigCount + "��");
        System.out.println("Сд��ĸ��" + smallCount + "��");
        System.out.println("���֣�" + numberCount + "��");

    }
}*/
public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ���ַ���");
        String line = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i<line.length(); i++) {
            char ch = line.charAt(i);
            if (ch>= 'A' && ch <='Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("��д��ĸ��" + bigCount + "��");
        System.out.println("Сд��ĸ��" + smallCount + "��");
        System.out.println("���֣�" + numberCount + "��");
    }
}
