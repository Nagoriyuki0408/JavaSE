package com.nagoriyuki.demo4genericity;

import com.nagoriyuki.demo3genericity.Student;

public class GenericDemo4 {
    public static void main(String[]arg){
        //目标：学会定义泛型方法，搞清楚作用
        //需求：打印任意数组的内容
        String [] names = {"张三","李四","王五"};
        printArray(names);

        Student[] stus =new Student[3];
        printArray(stus);

        Student max =getMax(stus);
        String max2=getMax(names);
    }

    public static <T> void printArray(T[] names){
    }

    public static <T> T getMax(T[] names){
        return null;
    }

}
