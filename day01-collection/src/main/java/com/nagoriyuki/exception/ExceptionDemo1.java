package com.nagoriyuki.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args){
        //show();
        try {
            show1();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        //目标：认识异常的体系，搞清楚异常的基本作用
    }
    public static void show1() throws ParseException, FileNotFoundException {
        //编译异常，编译阶段报错，编译不通过
        String str ="2025-05-14 11:12:14";
        //把字符串时间解析为Java中的一个日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=sdf.parse(str);//编译式异常：这里的程序很容易出错
        System.out.println(date);
        System.out.println("show1结束");

        //担心你没有这个文件
        //编译式异常
        //往上面的函数抛
        InputStream is =new FileInputStream(("d:/test.txt"));
    }
    public static void show(){
        System.out.println("show方法执行了");
        int[] arr={1,2,3};
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException

        System.out.println(10/0);//ArithmeticException

        //空指针异常
        String str=null;
        System.out.println(str.length());
        System.out.println(str);

        System.out.println("show方法结束了");
    }
}
