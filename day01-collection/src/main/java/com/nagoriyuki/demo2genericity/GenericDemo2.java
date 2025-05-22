package com.nagoriyuki.demo2genericity;

public class GenericDemo2 {
    //学会创建一个泛型类
    //需求：请你模拟一个ArrayList集合自定义一个集合ArrayList
    //MyArrayList<String> list =new MyArrayList<String>();
    public static void main(String[] args) {
        MyArrayList<String> list =new MyArrayList<>();
        list.add("hello");
        list.add("world");
//        list.add(555);//报错
        list.add("java");

    }
}
