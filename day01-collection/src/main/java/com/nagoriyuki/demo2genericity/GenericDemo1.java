package com.nagoriyuki.demo2genericity;

import java.util.ArrayList;

public class GenericDemo1 {
    public static void main(String[] args) {
        // 创建一个泛型为String的ArrayList
        ArrayList<String> list = new ArrayList<String>();
        // 添加元素
        list.add("hello");
        list.add("world");
        // 获取元素
        String s1 = list.get(0);
        String s2 = list.get(1);
        System.out.println(s1);
        System.out.println(s2);
        //获取数组
        for(int i=0;i<list.size();i++){
            Object rs  = list.get(i);
            //把数据转型处理
            String rs1 = (String)rs;
            System.out.println(rs1);
        }
    }
}
