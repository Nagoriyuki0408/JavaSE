package com.nagoriyuki.demo7list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //目标：掌握List集合特有的功能
        List<String> list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("java");
        System.out.println(list);

        //给第三个位置插入一个数据：c++
        list.add(2, "c++");
        System.out.println(list);

        //删除Java
        list.remove("java");
        System.out.println(list.remove("java"));

        //把world改成golang
        list.set(1, "golang");//根据下标进行修改
        System.out.println(list);

        //获取hello
        System.out.println(list.get(0));

        //1. for循环
        for(int i=0;i<list.size();i++){
            String rs = list.get(i);
            System.out.println(rs);
        }
        //2. 增强for循环
        for(String rs:list){
            System.out.println(rs);
        }
        //3. 迭代器
        list.iterator();
        while(list.iterator().hasNext()){
            String rs = list.iterator().next();
            System.out.println(rs);
        }
        //4. lambda表达式
        list.forEach(rs->{
            System.out.println(rs);
        });

    }
}
