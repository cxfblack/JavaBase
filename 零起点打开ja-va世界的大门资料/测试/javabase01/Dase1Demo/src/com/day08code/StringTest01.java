package com.day08code;

import java.util.Scanner;

/*
    ����
        ��֪�û��������룬���ó���ʵ��ģ���û���¼���ܹ������λ��ᣬ��¼֮�󣬸�����Ӧ����ʾ

    ˼·��
        1:��֪�û��������룬���������ַ�����ʾ����
        2:����¼��Ҫ��¼���û��������룬�� Scanner ʵ��
        3:�ü���¼����û������������֪���û�����������бȽϣ�������Ӧ����ʾ���ַ��������ݱȽϣ���equals() ����ʵ��
        4:��ѭ��ʵ�ֶ�λ��ᣬ����Ĵ�����ȷ������forѭ��ʵ�֣����ڵ�¼�ɹ���ʱ��ʹ��break����ѭ��
 */
/*
public class StringTest01 {
    public static void main(String[] args) {
        //��֪�û��������룬���������ַ�����ʾ����
        String username = "itheima";
        String password = "czbk";

        //��ѭ��ʵ�ֶ�λ��ᣬ����Ĵ�����ȷ������forѭ��ʵ�֣����ڵ�¼�ɹ���ʱ��ʹ��break����ѭ��
        for(int i=0; i<3; i++) {

            //����¼��Ҫ��¼���û��������룬�� Scanner ʵ��
            Scanner sc = new Scanner(System.in);

            System.out.println("�������û�����");
            String name = sc.nextLine();

            System.out.println("���������룺");
            String pwd = sc.nextLine();

            //�ü���¼����û������������֪���û�����������бȽϣ�������Ӧ����ʾ���ַ��������ݱȽϣ���equals() ����ʵ��
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("��¼�ɹ�");
                break;
            } else {
                if(2-i == 0) {
                    System.out.println("����˻����������������Ա��ϵ");
                } else {
                    //2,1,0
                    //i,0,1,2
                    System.out.println("��¼ʧ�ܣ��㻹��" + (2 - i) + "�λ���");
                }
            }
        }
    }
}*/
public class StringTest01 {
    public static void main(String[] args) {
        String username ="itheima";
        String passward ="czbk";

        for (int i = 0; i<3; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("�������û���");
            String name = sc.nextLine();

            System.out.println("����������");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(passward)) {
                System.out.println("��¼�ɹ�");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("�û����������������Ա��ϵ");
                } else {
                    System.out.println("��¼ʧ�ܣ��㻹��" + (2 - i) + "�λ���");
                }
            }
        }
    }
}
