package com.nagoriyuki.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> myCollection = new ArrayList<>();

        // 添加元素
        myCollection.add("Java");
        myCollection.add("Python");
        myCollection.add("C++");

        // 集合大小
        System.out.println("Size: " + myCollection.size()); // 输出: Size: 3

        // 是否包含元素
        System.out.println("Contains Java: " + myCollection.contains("Java")); // 输出: Contains Java: true

        // 迭代器
        Iterator<String> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // 移除元素
        myCollection.remove("Python");
        System.out.println("After removing Python: " + myCollection); // 输出: After removing Python: [Java, C++]

        // 清空集合
        myCollection.clear();
        System.out.println("Is empty: " + myCollection.isEmpty()); // 输出: Is empty: true
    }
}
