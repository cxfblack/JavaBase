

import java.util.Scanner;

/*
    ����
        �ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
        ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ��4����ίƽ��ֵ (������С������)��

    ˼·��
        1:����һ�����飬�ö�̬��ʼ���������Ԫ�صĳ�ʼ��������Ϊ6
        2:����¼����ί����
        3:������6����ί��֣����ԣ�������ί�����Ĳ�������ѭ���Ľ�
        4:���巽��ʵ�ֻ�ȡ�����е���߷�(�������ֵ)�����÷���
        5:���巽��ʵ�ֻ�ȡ�����е���ͷ�(������Сֵ) �����÷���
        6:���巽��ʵ�ֻ�ȡ�����е�����Ԫ�صĺ�(����Ԫ�����) �����÷���
        7:���ռ��������м���õ�ƽ����
        8:���ƽ����
 */
/*
public class Test10 {
    public static void main(String[] args) {
        //����һ�����飬�ö�̬��ʼ���������Ԫ�صĳ�ʼ��������Ϊ6
        int[] arr = new int[6];

        //����¼����ί����
        Scanner sc = new Scanner(System.in);

//        System.out.println("�������1����ί�Ĵ�֣�");
//        arr[0] = sc.nextInt();
//
//        System.out.println("�������2����ί�Ĵ�֣�");
//        arr[1] = sc.nextInt();

        //������6����ί��֣����ԣ�������ί�����Ĳ�������ѭ���Ľ�
        for(int x=0; x<arr.length; x++) {
            System.out.println("�������" + (x + 1) + "����ί�Ĵ�֣�");
            arr[x] = sc.nextInt();
        }

        //printArray(arr);

        //���巽��ʵ�ֻ�ȡ�����е���߷�(�������ֵ)�����÷���
        int max = getMax(arr);

        //���巽��ʵ�ֻ�ȡ�����е���ͷ�(������Сֵ) �����÷���
        int min = getMin(arr);

        //���巽��ʵ�ֻ�ȡ�����е�����Ԫ�صĺ�(����Ԫ�����) �����÷���
        int sum = getSum(arr);

        //���ռ��������м���õ�ƽ����
        int avg = (sum - max - min) / (arr.length - 2);

        //���ƽ����
        System.out.println("ѡ�ֵ����յ÷��ǣ�" + avg);

    }

    *//*
        ������ȷ��
            ����ֵ���ͣ�int
            ������int[] arr
     *//*
    public static int getSum(int[] arr) {
        int sum = 0;

        for(int x=0; x<arr.length; x++) {
            sum += arr[x];
        }

        return sum;
    }

    *//*
        ������ȷ��
            ����ֵ���ͣ�int
            ������int[] arr
     *//*
    public static int getMin(int[] arr) {
        int min = arr[0];

        for(int x=1; x<arr.length; x++) {
            if(arr[x] < min) {
                min = arr[x];
            }
        }

        return min;
    }

    *//*
        ������ȷ��
            ����ֵ���ͣ�int
            ������int[] arr
     *//*
    public static int getMax(int[] arr) {
        int max = arr[0];

        for(int x=1; x<arr.length; x++) {
            if(arr[x] > max) {
                max = arr[x];
            }
        }

        return max;
    }

    //��������
    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }

        System.out.println("]");
    }
}*/

public class Test10 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int x = 0; x < arr.length; x++) {
            System.out.println("�������" + (x + 1) + "������");
            arr[x] = sc.nextInt();
        }

        //����ĺ�
        int sum = getSum(arr);

        //��Сֵ
        int min = getMin(arr);
        //���ֵ
        int max = getMax(arr);

        //ƽ��ֵ
        int avg = (sum - max - min ) / (arr.length - 2 );

        System.out.println("ƽ��ֵ�ǣ�" + avg);

        //�������
        //printArray(arr);

    }

    //����Ԫ�����
    public static int getSum(int[] arr) {
        int sum =0;
        for (int x=0; x<arr.length; x++) {
           sum += arr[x];
        }
        return sum;
    }




    //��Сֵ
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }
    //���ֵ
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    //��������
    public static void printArray ( int[] arr){
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == arr.length - 1) {
                System.out.println(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        System.out.print("]");
    }
}