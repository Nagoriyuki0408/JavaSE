package com.nagoriyuki.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
    public static void main(String[] args) {
    //目标：掌握异常的处理方案一：底层错误层层网上抛，最外层捕获错误
    System.out.println("开始保存年龄");
        try {
            show();
            System.out.println("年龄保存完毕");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("年龄不合法");
        }
        System.out.println("年龄保存完毕");
    }
//    public static void show() throws ParseException, FileNotFoundException {
//        //编译异常，编译阶段报错，编译不通过
//        String str ="2025-05-14 11:12:14";
//        //把字符串时间解析为Java中的一个日期对象
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date=sdf.parse(str);//编译时异常，提醒：这里的程序很容易出错
//        System.out.println(date);
//        InputStream is=new FileInputStream("d:/test.txt");
//    }
    //直接抛Exception
    public static void show() throws Exception {
        //编译异常，编译阶段报错，编译不通过
        String str ="2025-05-14 11:12:14";
        //把字符串时间解析为Java中的一个日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=sdf.parse(str);//编译时异常，提醒：这里的程序很容易出错
        System.out.println(date);
        InputStream is=new FileInputStream("d:/test.txt");
    }
    }
