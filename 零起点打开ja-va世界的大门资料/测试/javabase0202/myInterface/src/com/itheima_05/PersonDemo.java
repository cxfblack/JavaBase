package com.itheima_05;
/*
    测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        System.out.println("运动员");
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(30);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();

        ppp = new PingPangPlayer("王浩",31);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("--------");

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();

        bp = new BasketballPlayer("姚明",36);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
        System.out.println("--------");

        System.out.println("教练");
        PingPangCoach ppc = new PingPangCoach();
        ppc.setName("大狗");
        ppc.setAge(36);
        System.out.println(ppc.getName()+","+ppc.getAge());
        ppc.eat();
        ppc.teach();
        ppc.speak();

        ppc = new PingPangCoach("大狗",37);
        System.out.println(ppc.getName()+","+ppc.getAge());
        ppc.eat();
        ppc.teach();
        ppc.speak();

        BasketballCoach bc  = new BasketballCoach();
        bc.setName("小猫");
        bc.setAge(36);
        System.out.println(bc.getName()+","+bc.getAge());
        bc.eat();
        bc.teach();
    }
}
