package com.itheima_06;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("--------");

        a = new Dog();
        a.setName("大狗");
        a.setAge(12);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a= new Dog("大狗",14);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

    }
}
