package com.nagoriyuki.demo4genericity;

import java.util.ArrayList;

public class GenericDemo5 {
    public static void main(String[]arg)
    {
        //目标：理解泛型通配符和上下限
        ArrayList<Xiaomi> xiaomis = new ArrayList<>();
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        go(xiaomis);
        //方法不具备通用性
        ArrayList<BYD> byds = new ArrayList<>();
        byds.add(new BYD());
        byds.add(new BYD());
        byds.add(new BYD());
        go(byds);//报错
//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        go(dogs);
//        //狗也能跑
        //通配符上限加入之后狗就跑不了了
    }
    //需求：开发一个极品飞车游戏
    //虽然Xiaomi和BYD是Car的子类，但是ArrayList<Xiaomi>和ArrayList<BYD>没有关系
    public static void go(ArrayList<? extends Car> cars){
        //通配符上限 ？ extends Car
        //通配符下限 ？ super Car

    }

}
