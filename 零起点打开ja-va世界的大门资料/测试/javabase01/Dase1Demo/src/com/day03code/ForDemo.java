/*
	for���

    ��ʽ��
        for(��ʼ�����;�����ж����;�����������) {
			ѭ�������;
		}

    ִ�����̣�
        1:ִ�г�ʼ�����
		2:ִ�������ж���䣬��������true����false
            �����false��ѭ������
            �����true������ִ��
		3:ִ��ѭ�������
		4:ִ�������������
		5:�ص�2����
 */
/*
//for�ṹ
public class ForDemo {
    public static void main(String[] args) {
        //�����ڿ���̨���5��"HelloWorld"
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("--------");
		
		//��ѭ���Ľ�
		for(int i=1; i<=5; i++) {
			System.out.println("HelloWorld");
		}
		
    }
}
//�������
public class ForDemo {
	public static void main(String[] args) {
		//�����������1-5
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("----------");
		//�����������5-1
		for (int i=5; i>=1; i--) {
			System.out.println(i);
		}
	}

}
//���
public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=5; i++) {
			sum += i;
		}
		System.out.println("���һ����͵������ǣ�" + sum);
	}
}
//��ż����
public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("1-100֮���ż���ͣ�" + sum);
	}
}
//ˮ�ɻ�����Щ
public class ForDemo {
	public static void main(String[] args) {
		for (int i=100; i<1000; i++) {
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;

			if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				System.out.println(i);
			}
		}
	}
}*/

public class ForDemo {
	public static void main(String[] args) {
		int count = 0;

		for (int i=100; i<1000; i++) {
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;

			if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				count++;
			}
		}
		System.out.println("ˮ�ɻ��������ǣ�" + count + "��");
	}
}