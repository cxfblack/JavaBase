package com.day07code;

/*
    学生测试类
 */
public class StudentDemo05 {
    public static void main(String[] args) {
        //创建对象
        Student05 s = new Student05();

        //使用set方法给成员变量赋值
        s.setName("林青霞");
        s.setAge(30);

        s.show();

        //使用get方法获取成员变量的值
        System.out.println(s.getName() + "---" + s.getAge());
        System.out.println(s.getName() + "," + s.getAge());

    }
}
