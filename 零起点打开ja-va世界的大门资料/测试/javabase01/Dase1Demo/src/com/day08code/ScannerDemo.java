package com.day08code;

import java.util.Scanner;

/*
    Scanner:
        ���ڻ�ȡ����¼�����ݡ�(�����������ͣ��ַ�������)

    public String nextLine()��
        ��ȡ����¼���ַ�������
 */
public class ScannerDemo {
    public static void main(String[] args) {
        //��������
        Scanner sc = new Scanner(System.in);

        //��������
        System.out.println("������һ���ַ������ݣ�");
//        String line = sc.nextLine();
        //Ctrl+Alt+V
        String line = sc.nextLine();

        //������
        System.out.println("������������ǣ�" + line);
    }
}
