

import java.util.Scanner;

/*
    ������������������ʾ����ļ��ʻ
            ��һ���ܲ�
            �ܶ�����Ӿ
            ����������
            ���ģ����е���
            ���壺ȭ��
            ��������ɽ
            ���գ��úó�һ��

    ˼·��
        1:����¼��һ������������һ����������
        2:�������������жϣ������� if ���ʵ��
        3:�ڶ�Ӧ���������������Ӧ�ļ��ʻ
 */
public class Test01 {
    public static void main(String[] args) {
        //����¼��һ������������һ����������
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ����������");
        int week = sc.nextInt();

        //�������������жϣ������� if ���ʵ��
        if (week < 1 || week > 7) {
            System.out.println("�����������������");
        } else if (week == 1) {
            System.out.println("�ܲ�");
        } else if (week == 2) {
            System.out.println("��Ӿ");
        } else if (week == 3) {
            System.out.println("����");
        } else if (week == 4) {
            System.out.println("���е���");
        } else if (week == 5) {
            System.out.println("ȭ��");
        } else if (week == 6) {
            System.out.println("��ɽ");
        } else {
            System.out.println("�úó�һ��");
        }
    }
}
