/*
	Random
	
	���ã�
		���ڲ���һ�������

	ʹ�ò��裺
		1:����
			import java.util.Random;
		2:��������
			Random r = new Random();
		3:��ȡ�����
			int number = r.nextInt(10);
			��ȡ���ݵķ�Χ��[0,10) ����0,������10
*/
/*
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		//��������
		Random r = new Random();
		
		//��ѭ����ȡ10�������
		for(int i=0; i<10; i++) {
			//��ȡ�����
			int number = r.nextInt(10);
			System.out.println("number:" + number);
		}
		
		//���󣺻�ȡһ��1-100֮��������
		int x = r.nextInt(100) + 1;
		System.out.println(x);
	}
}*/

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("��������Ҫ�µ����֣�");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("��µ�����" + guessNumber + "����");
            } else if (guessNumber < number) {
                System.out.println("��µ�����" + guessNumber + "С��");
            } else {
                System.out.println("��ϲ�������");
                break;
            }
        }

    }
}

