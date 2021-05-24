package com.student;

import java.util.ArrayList;
import java.util.Scanner;

/*
    ѧ������ϵͳ
 */
public class StudentManager {

    public static void main(String[] args) {
        //�������϶������ڴ洢ѧ������
        ArrayList<Student> array = new ArrayList<Student>();

        //��ѭ������ٴλص�������
        while (true) {
            //�����������������ı�д
            System.out.println("--------��ӭ����ѧ������ϵͳ--------");
            System.out.println("1 ���ѧ��");
            System.out.println("2 ɾ��ѧ��");
            System.out.println("3 �޸�ѧ��");
            System.out.println("4 �鿴����ѧ��");
            System.out.println("5 �˳�");
            System.out.println("���������ѡ��");

            //��Scannerʵ�ּ���¼������
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //��switch�����ɲ�����ѡ��
            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("�޸�ѧ��");
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("ллʹ��");
                    System.exit(0); //JVM�˳�
            }
        }
    }

    //����һ���������������ѧ����Ϣ
    /*
    public static void addStudent(ArrayList<Student> array) {
        //����¼��ѧ����������Ҫ������,��ʾ��ʾ��Ϣ����ʾҪ���������Ϣ
        Scanner sc = new Scanner(System.in);

        System.out.println("������ѧ��ѧ�ţ�");
        String sid = sc.nextLine();
        System.out.println("������ѧ��������");
        String name = sc.nextLine();
        System.out.println("������ѧ�����䣺");
        String age = sc.nextLine();
        System.out.println("������ѧ����ס�أ�");
        String address = sc.nextLine();

        //����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //��ѧ��������ӵ�������
        array.add(s);

        //������ӳɹ���ʾ
        System.out.println("���ѧ���ɹ�");
    }
    */
    public static void addStudent(ArrayList<Student> array) {
        //����¼��ѧ����������Ҫ������,��ʾ��ʾ��Ϣ����ʾҪ���������Ϣ
        Scanner sc = new Scanner(System.in);

        //Ϊ����sid��whileѭ�����汻���ʵ������ǾͰ�����������ѭ����
        String sid;

        //Ϊ���ó����ܹ��ص��������ʹ��ѭ��ʵ��
        while (true) {
            System.out.println("������ѧ��ѧ�ţ�");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("�������ѧ���Ѿ���ʹ�ã�����������");
            } else {
                break;
            }
        }

        System.out.println("������ѧ��������");
        String name = sc.nextLine();
        System.out.println("������ѧ�����䣺");
        String age = sc.nextLine();
        System.out.println("������ѧ����ס�أ�");
        String address = sc.nextLine();

        //����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //��ѧ��������ӵ�������
        array.add(s);

        //������ӳɹ���ʾ
        System.out.println("���ѧ���ɹ�");
    }

    //����һ���������ж�ѧ���Ƿ�ʹ��
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        //����뼯���е�ĳһ��ѧ��ѧ����ͬ������true;���������ͬ������false
        boolean flag = false;

        for(int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            if(s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    //����һ�����������ڲ鿴ѧ����Ϣ
    /*
    public static void findAllStudent(ArrayList<Student> array) {
        //��ʾ��ͷ��Ϣ
        //\t ��ʵ����tab����λ��
        System.out.println("ѧ��\t\t\t����\t\t����\t\t��ס��");

        //������������ȡ�����ն�Ӧ��ʽ��ʾѧ����Ϣ��������ʾ���䡰�ꡱ
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "��\t\t" + s.getAddress());
        }
    }
    */
    public static void findAllStudent(ArrayList<Student> array) {
        //�жϼ������Ƿ������ݣ����û����ʾ��ʾ��Ϣ
        if (array.size() == 0) {
            System.out.println("����Ϣ�����������Ϣ�ٲ�ѯ");
            //Ϊ���ó���������ִ�У�����return;
            return;
        }


        //��ʾ��ͷ��Ϣ
        //\t ��ʵ����tab����λ��
        System.out.println("ѧ��\t\t\t����\t\t����\t\t��ס��");

        //������������ȡ�����ն�Ӧ��ʽ��ʾѧ����Ϣ��������ʾ���䡰�ꡱ
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "��\t\t" + s.getAddress());
        }
    }

    //����һ������������ɾ��ѧ����Ϣ
    /*
    public static void deleteStudent(ArrayList<Student> array) {
        //����¼��Ҫɾ����ѧ��ѧ��,��ʾ��ʾ��Ϣ
        Scanner sc = new Scanner(System.in);

        System.out.println("��������Ҫɾ����ѧ����ѧ�ţ�");
        String sid = sc.nextLine();

        //�������Ͻ���Ӧѧ������Ӽ�����ɾ��
        for(int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            if(s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
        }

        //����ɾ���ɹ���ʾ
        System.out.println("ɾ��ѧ���ɹ�");
    }
    */
    public static void deleteStudent(ArrayList<Student> array) {
        //����¼��Ҫɾ����ѧ��ѧ��,��ʾ��ʾ��Ϣ
        Scanner sc = new Scanner(System.in);

        System.out.println("��������Ҫɾ����ѧ����ѧ�ţ�");
        String sid = sc.nextLine();

        //��ɾ��/�޸�ѧ������ǰ����ѧ���Ƿ���ڽ����ж�
        //��������ڣ���ʾ��ʾ��Ϣ
        //������ڣ�ִ��ɾ��/�޸Ĳ���
        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
//                int index = i;
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("����Ϣ�����ڣ�����������");
        } else {
            array.remove(index);
            //����ɾ���ɹ���ʾ
            System.out.println("ɾ��ѧ���ɹ�");
        }
    }

    //����һ�������������޸�ѧ����Ϣ
    /*public static void updateStudent(ArrayList<Student> array) {
        //����¼��Ҫ�޸ĵ�ѧ��ѧ�ţ���ʾ��ʾ��Ϣ
        Scanner sc = new Scanner(System.in);

        System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
        String sid = sc.nextLine();

        //����¼��Ҫ�޸ĵ�ѧ����Ϣ
        System.out.println("������ѧ����������");
        String name = sc.nextLine();
        System.out.println("������ѧ�������䣺");
        String age = sc.nextLine();
        System.out.println("������ѧ���¾�ס�أ�");
        String address = sc.nextLine();

        //����ѧ������
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //���������޸Ķ�Ӧ��ѧ����Ϣ
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }

        //�����޸ĳɹ���ʾ
        System.out.println("�޸�ѧ���ɹ�");
    }*/
    public static void updateStudent(ArrayList<Student> array) {
        //����¼��Ҫ�޸ĵ�ѧ��ѧ�ţ���ʾ��ʾ��Ϣ
        Scanner sc = new Scanner(System.in);

        //Ϊ����sid��whileѭ�����汻���ʵ������ǾͰ�����������ѭ����
        String sid;

        //Ϊ���ó����ܹ��ص��������ʹ��ѭ��ʵ��
        while (true) {
            System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
            sid = sc.nextLine();

            boolean flag = setUsed(array, sid);
            if (flag) {
                System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�Ų����ڣ�����������");
            } else {
                break;
            }
        }

        //����¼��Ҫ�޸ĵ�ѧ����Ϣ
        System.out.println("������ѧ����������");
        String name = sc.nextLine();
        System.out.println("������ѧ�������䣺");
        String age = sc.nextLine();
        System.out.println("������ѧ���¾�ס�أ�");
        String address = sc.nextLine();

        //����ѧ������
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //���������޸Ķ�Ӧ��ѧ����Ϣ
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }

        //�����޸ĳɹ���ʾ
        System.out.println("�޸�ѧ���ɹ�");
    }
    //����һ���������ж�ѧ���Ƿ�ʹ��
    public static boolean setUsed(ArrayList<Student> array, String sid) {
        //����뼯���е�ĳһ��ѧ��ѧ����ͬ������true;���������ͬ������false
        boolean flag = true;

        for(int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            if(s.getSid().equals(sid)) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
