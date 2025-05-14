package com.nagoriyuki.exception;

public class ExceptionDemo2 {
    public static void main(String[] args) throws Exception {
        //目标：搞清楚异常的作用
        System.out.println("开始");
        System.out.println(div(10,0));

        try {
            System.out.println(div(10,0));
            System.out.println("底层方法执行成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层方法执行失败了");
        }
        System.out.println("程序结束运行");
    }
    public static int div(int a,int b) throws Exception {
        if(b==0){
            //抛一个运行异常
//            throw new RuntimeException("除数不能为0");
            //抛一个编译式异常
            throw new Exception("除数不能为0");
        }
//        if(b==0){
//            System.out.println("b不能等于0");
//            return -1;//代表程序出现问题
//        }
        return a/b;
    }
}
