package com.nagoriyuki.demo6collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTraversalDemo3 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("元素1");
        collection.add("元素2");
        collection.add("元素3");

        for (String element : collection) {
            System.out.println(element);
            // 注意：不能在这里安全地删除元素
            // 如果尝试删除，可能会抛出 ConcurrentModificationException
        }
    }
}
