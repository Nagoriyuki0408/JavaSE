package com.nagoriyuki.demo7list;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    //目标：用LinkedList做一个队列对象
    public static void main(String[] args) {
    List<String> queue = new LinkedList();
    //入队
        queue.addLast("hello");
        queue.addLast("world");
        queue.addLast("java");
        System.out.println(queue);
        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

//        List<String> queue = new LinkedList();
//        //入队
//        queue.addLast("hello");
//        queue.addLast("world");
//        queue.addLast("java");
//        System.out.println(queue);
//        //出队
//        System.out.println(queue.removeFirst());
//        System.out.println(queue.removeFirst());
//        System.out.println(queue.removeFirst());
//        System.out.println(queue);
    }
}
