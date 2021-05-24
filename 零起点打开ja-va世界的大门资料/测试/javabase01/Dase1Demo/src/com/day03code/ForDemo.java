/*
	for语句

    格式：
        for(初始化语句;条件判断语句;条件控制语句) {
			循环体语句;
		}

    执行流程：
        1:执行初始化语句
		2:执行条件判断语句，看其结果是true还是false
            如果是false，循环结束
            如果是true，继续执行
		3:执行循环体语句
		4:执行条件控制语句
		5:回到2继续
 */
/*
//for结构
public class ForDemo {
    public static void main(String[] args) {
        //需求：在控制台输出5次"HelloWorld"
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("--------");
		
		//用循环改进
		for(int i=1; i<=5; i++) {
			System.out.println("HelloWorld");
		}
		
    }
}
//输出数据
public class ForDemo {
	public static void main(String[] args) {
		//需求：输出数据1-5
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("----------");
		//需求：输出数据5-1
		for (int i=5; i>=1; i--) {
			System.out.println(i);
		}
	}

}
//求和
public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=5; i++) {
			sum += i;
		}
		System.out.println("最后一次求和的总数是：" + sum);
	}
}
//求偶数和
public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("1-100之间的偶数和：" + sum);
	}
}
//水仙花有哪些
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
		System.out.println("水仙花的数量是：" + count + "个");
	}
}