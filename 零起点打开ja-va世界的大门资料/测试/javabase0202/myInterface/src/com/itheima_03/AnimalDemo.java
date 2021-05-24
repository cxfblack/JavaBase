package com.itheima_03;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("--------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
//        a.jump();

        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();

        System.out.println("--------");

        j = new Dog();
        j.jump();

        a = new Dog();
        a.setName("大狗");
        a.setAge(7);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Dog("大狗",8);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        Dog d = new Dog();
        d.setName("大狗");
        d.setAge(7);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        d.jump();

        d = new Dog("大狗",8);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        d.jump();
    }
}
