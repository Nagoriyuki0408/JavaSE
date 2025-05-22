package com.nagoriyuki.demo6collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTraversalTest6 {
    //目标：认识并发遍历修改的异常问题，搞清楚三种遍历方式的区别
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add("C++");
//        list.add("C#");
//        list.add("Python");
//        list.add("C++11");
//        list.add("C++14");
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            if (s.contains("C++")) {
//                list.remove(s);
//            }
//        }
//        System.out.println(list);
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("Java");
//        list2.add("C++");
//        list2.add("C#");
//        list2.add("Python");
//        list2.add("C++11");
//        list2.add("C++14");
//        for (int i = 0; i < list2.size(); i++) {
//            String s = list2.get(i);
//            if (s.contains("C++")) {
//                list2.remove(s);
//                i--;
//            }
//        }
//        System.out.println(list2);

//        ArrayList<String> list3 = new ArrayList<>();
//        list3.add("Java");
//        list3.add("C++");
//        list3.add("C#");
//        list3.add("Python");
//        list3.add("C++11");
//        list3.add("C++14");
//        //需求1：删除全部C++
//        //解决方案2：到序遍历并删除（前提是支持索引）
//        for(int i = list3.size()-1; i >=0; i--)
//            if(list3.get(i).contains("C++"))
//                list3.remove(i);
//        System.out.println(list3);
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Java");
        list4.add("C++");
        list4.add("C#");
        list4.add("Python");
        list4.add("C++11");
        list4.add("C++14");
        //需求1：删除全部C++
        //方案一：迭代器遍历
        Iterator<String> it=list4.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if(s.contains("C++")) {
                it.remove();
            }
        }
        System.out.println(list4);


    }

}
