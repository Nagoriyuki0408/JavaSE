package com.nagoriyuki.demo5generecity;

import java.util.ArrayList;

public class GenericDemo6 {
    public static void main(String[]arg)
    {
        //目标：理解泛型类和集合不支持基本数据类，只能支持对象类型
//        ArrayList<int> list = new ArrayList<>();
//        list.add(1);
        //把基本数据类型变成包装类对象
        //手工包装
        //Integer i = new Integer(1);
        Integer it =Integer.valueOf(100);//推荐的
        Integer it2 = Integer.valueOf(100);
        System.out.println(it==it2);
        //自动装箱成对象，基本数据类型的数据可以直接变成包装对象的数据，不需要额外做任何事情
        Integer it3 = 100;
        Integer it4 = 100;
        System.out.println(it3==it4);
        //自动拆箱：直接把包装类型的对象给基本类型的数据
        int i = it3;
        System.out.println(i);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(it3);
        list.add(130);//自动拆箱

        int rs=list.get(0);//自动拆箱

        //包装类新增的功能
        //1. 把基本类型的数据换成字符串
        int j=23;
        String s = Integer.toString(j);
        System.out.println(s);

        Integer i0=j;
        String s1 = i0.toString();
        System.out.println(s1+1);

        //2. 把字符串数值转化为对象的数据类型
        String s2 = "123";
//        Integer i7=Integer.parseInt(s2);
        Integer i7=Integer.valueOf(s2);
        System.out.println(i7+1);
    }
}
