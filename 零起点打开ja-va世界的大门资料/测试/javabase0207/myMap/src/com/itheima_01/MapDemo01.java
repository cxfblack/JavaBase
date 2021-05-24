package com.itheima_01;

import java.util.HashMap;
import java.util.Map;

/*
    Map���ϸ���
        Interface Map<K,V>	K���������ͣ�V��ֵ������
        ����ӳ�䵽ֵ�Ķ��󣻲��ܰ����ظ��ļ���ÿ��������ӳ�䵽���һ��ֵ
        ������ѧ����ѧ�ź�����
              itheima001	����ϼ
              itheima002	������
              itheima003	������

    ����Map���ϵĶ���
        ��̬�ķ�ʽ
        �����ʵ����HashMap
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //�������϶���
        Map<String,String> map = new HashMap<String,String>();

        //V put?(K key, V value) ��ָ����ֵ���ӳ���е�ָ���������
        map.put("itheima001","����ϼ");
        map.put("itheima002","������");
        map.put("itheima003","������");
        map.put("itheima003","����");

        //������϶���
        System.out.println(map);
    }
}
