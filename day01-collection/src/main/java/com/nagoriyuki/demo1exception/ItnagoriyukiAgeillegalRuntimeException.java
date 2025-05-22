package com.nagoriyuki.demo1exception;
/*
* 自定义运行时异常
* 继承RuntimeException做爸爸
* 重写Exception的构造器
* 哪里需要用这个异常访问，哪里就throw
* */
public class ItnagoriyukiAgeillegalRuntimeException extends RuntimeException {
    public ItnagoriyukiAgeillegalRuntimeException(){}
    public ItnagoriyukiAgeillegalRuntimeException(String message)
    {
        super(message);
    }
}
