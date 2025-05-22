package com.nagoriyuki.demo6collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionTraversalDemo5 {
    //目标：掌握Collection的第三种遍历方式Lambda
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("C#");
        list.add("Python");
//        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
//        list.forEach(s -> {
//            System.out.println(s);
//        });

    }
}
