package com.day07code;

/*
    创建对象并为其成员变量赋值的两种方式
        1:无参构造方法创建对象后使用setXxx()赋值
        2:使用带参构造方法直接创建带有属性值的对象
*//*
public class StudentDemo {
    public static void main(String[] args) {
        //无参构造方法创建对象后使用setXxx()赋值
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(30);
        s1.show();

        //使用带参构造方法直接创建带有属性值的对象
        Student s2 = new Student("林青霞",30);
        s2.show();
    }
}*/



public class StudentDemo09 {
    public static void main(String[] args) {
        Student09 s1 = new Student09();
        s1.setName("林青霞");
        s1.setAge(36);
        s1.show();

        Student09 s2 = new Student09("林青霞",36);
        s2.show();
    }
}
