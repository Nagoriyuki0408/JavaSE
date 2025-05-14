package com.nagoriyuki.exception;

public class ExceptionDemo3 {
    public static void main(String[] args) throws ItnagoriyukiAgeillegalException { // 声明 main 方法可能抛出异常
        //目标：认识自定义异常
        System.out.println("开始保存年龄");
        try {
            saveAge(100);
            System.out.println("年龄保存完毕");
        } catch (ItnagoriyukiAgeillegalException e) {
            System.err.println("年龄不合法: " + e.getMessage()); // 打印错误信息
            throw e; // 继续抛出异常
        }
        System.out.println("程序结束"); // 无论是否发生异常，都会执行
    }

    //需求：我们公司的系统只要收到了年龄小于1岁或者大于200岁就是一个年龄非法异常
    public static void saveAge(int age) throws ItnagoriyukiAgeillegalException {
        if (age < 1 || age > 200) {
            //年龄非法：抛出一个异常返回
            throw new ItnagoriyukiAgeillegalException("年龄非法，年龄不能低于一岁，不能高于两百岁");
        } else {
            System.out.println("年龄合法");
        }
    }
}