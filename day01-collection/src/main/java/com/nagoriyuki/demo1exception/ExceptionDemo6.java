package com.nagoriyuki.demo1exception;

import java.util.Scanner;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        //目标：掌握异常处理方案2，捕获异常对象，尝试重新修复
        //接受用户的一个定价
        System.out.println("开始录入价格");
        double price = 0;
        try {
            price = userInputPrice();
            System.out.println("价格录入成功"+price);
            return ;
        } catch (Exception e) {
            System.out.println("价格录入失败");
        }
        System.out.println("程序结束");
    }
    public static double userInputPrice() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个价格");
        double price = sc.nextDouble();
        return price;
    }
}
