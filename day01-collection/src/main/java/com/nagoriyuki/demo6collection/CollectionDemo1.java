package com.nagoriyuki.demo6collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) { // 添加 main 方法
        //目标：搞清楚Collection的整体特点
        //1. List家族的集合，有序、可重复，有索引/
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("C++");
        list.add("C#");
        System.out.println(list);
        String  s = list.get(0);
        System.out.println(s);

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java");
        set.add("C++");
        set.add("C#");
        System.out.println(set);
    }
}