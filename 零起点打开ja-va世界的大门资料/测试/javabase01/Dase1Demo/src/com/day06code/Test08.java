

import java.util.Scanner;

/*
    ����
        ��֪һ������ arr = {19, 28, 37, 46, 50}; ����¼��һ�����ݣ����Ҹ������������е����������ڿ���̨����ҵ�������ֵ��

    ˼·��
        1:����һ�����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
        2:����¼��Ҫ���ҵ����ݣ���һ����������
        3:����һ��������������ʼֵΪ-1
        4:�������飬��ȡ�������е�ÿһ��Ԫ��
        5:�ü���¼������ݺ������е�ÿһ��Ԫ�ؽ��бȽϣ����ֵ��ͬ���ͰѸ�ֵ��Ӧ��������ֵ����������,������ѭ��
        6:�����������
 */
/*
public class Test08 {
    public static void main(String[] args) {
        //����һ�����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
        int[] arr = {19, 28, 37, 46, 50};

        //����¼��Ҫ���ҵ����ݣ���һ����������
        Scanner sc = new Scanner(System.in);

        System.out.println("������Ҫ���ҵ����ݣ�");
        int number = sc.nextInt();

        *//*
        //����һ��������������ʼֵΪ-1
        int index = -1;

        //�������飬��ȡ�������е�ÿһ��Ԫ��
        for(int x=0; x<arr.length; x++) {
            //�ü���¼������ݺ������е�ÿһ��Ԫ�ؽ��бȽϣ����ֵ��ͬ���ͰѸ�ֵ��Ӧ��������ֵ����������,������ѭ��
            if(arr[x] == number) {
                index = x;
                break;
            }
        }
        *//*

        //���÷���
        int index = getIndex(arr, number);

        //�����������
        System.out.println("index: " + index);


    }

    //����ָ���������������е�����
    *//*
        ������ȷ��
            ����ֵ���ͣ�int
            ������int[] arr, int number
     *//*
    public static int getIndex(int[] arr, int number) {
        //����һ��������������ʼֵΪ-1
        int index = -1;

        //�������飬��ȡ�������е�ÿһ��Ԫ��
        for(int x=0; x<arr.length; x++) {
            //�ü���¼������ݺ������е�ÿһ��Ԫ�ؽ��бȽϣ����ֵ��ͬ���ͰѸ�ֵ��Ӧ��������ֵ����������,������ѭ��
            if(arr[x] == number) {
                index = x;
                break;
            }
        }

        //��������
        return index;
    }
}*/
public class Test08 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ���ҵ����ݣ�");
        int number = sc.nextInt();

        int index = getIndex(arr,number);

/*
        int index = -1;
        for (int x=0; x<arr.length; x++ ) {
            if (arr[x] == number) {
                index = x;
                break;
            }
        }*/

        System.out.println("index: " + index);
    }
    public static int getIndex(int[] arr,int number) {
        int index = -1;
        for (int x=0; x<arr.length; x++ ) {
            if (arr[x] == number) {
                index = x;
                break;
            }
        }
        return index;
    }
}