


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
        2:�������������жϣ������� switch ���ʵ��
        3:�ڶ�Ӧ���������������Ӧ�ļ��ʻ

    ������
        1:�ֶ�����  import java.util.Scanner;
        2:��ݼ����� Alt+Enter
        3:�Զ�����
 */

public class Test02 {
    public static void main(String[] args) {
        //����¼��һ������������һ����������
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ����������");
        int week = sc.nextInt();

        //�������������жϣ������� switch ���ʵ��
        switch (week) {
            case 1:
                System.out.println("�ܲ�");
                break;
            case 2:
                System.out.println("��Ӿ");
                break;
            case 3:
                System.out.println("����");
                break;
            case 4:
                System.out.println("���е���");
                break;
            case 5:
                System.out.println("ȭ��");
                break;
            case 6:
                System.out.println("��ɽ");
                break;
            case 7:
                System.out.println("�úó�һ��");
                break;
            default:
                System.out.println("�����������������");
        }

    }
}
/*
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("�����������������");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("�ܲ�");
                break;
            case 2:
                System.out.println("��Ӿ");
                break;
            case 3:
                System.out.println("����");
                break;
            case 4:
                System.out.println("���е���");
                break;
            case 5:
                System.out.println("ȭ��");
                break;
            case 6:
                System.out.println("��ɽ");
                break;
            case 7:
                System.out.println("�úó�һ��");
                break;
            default:
                System.out.println("���������������");


        }
    }
}*/