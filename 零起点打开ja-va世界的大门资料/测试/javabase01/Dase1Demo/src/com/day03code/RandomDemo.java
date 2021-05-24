/*
	Random
	
	作用：
		用于产生一个随机数

	使用步骤：
		1:导包
			import java.util.Random;
		2:创建对象
			Random r = new Random();
		3:获取随机数
			int number = r.nextInt(10);
			获取数据的范围：[0,10) 包括0,不包括10
*/
/*
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		//创建对象
		Random r = new Random();
		
		//用循环获取10个随机数
		for(int i=0; i<10; i++) {
			//获取随机数
			int number = r.nextInt(10);
			System.out.println("number:" + number);
		}
		
		//需求：获取一个1-100之间的随机数
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
            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }

    }
}

