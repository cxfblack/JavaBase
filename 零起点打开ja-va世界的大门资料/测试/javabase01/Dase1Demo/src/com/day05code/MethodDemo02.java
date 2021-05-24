

/*
    带参数方法的定义和调用

    定义格式：
        public static void 方法名(参数) { … … }

	调用格式：
        方法名(参数);
 */
/*
public class MethodDemo02 {
    public static void main(String[] args) {
        //常量值的调用
        isEvenNumber(10);

        //变量的调用
        int number = 10;
        isEvenNumber(number);
    }

    //需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数
    public static void isEvenNumber(int number) {
        if(number%2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}*/
public class MethodDemo02 {
    public static void main(String[] args) {
        getMax(10, 20);

        int a = 10;
        int b = 20;
        getMax(a, b);
    }

    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}