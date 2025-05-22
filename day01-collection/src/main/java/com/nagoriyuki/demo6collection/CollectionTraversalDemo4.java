package com.nagoriyuki.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo4 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("元素1");
        collection.add("元素2");
        collection.add("元素3");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            // 如果需要，可以安全地删除元素
            if (element.equals("元素2")) {
                iterator.remove(); // 使用 iterator.remove() 删除元素
            }
        }
    }

}
