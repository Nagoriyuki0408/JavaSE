package com.nagoriyuki.demo3genericity;

public class StudentData implements Data<Student> {
    @Override
    public void add(Student t) {
        System.out.println("添加学生：" );
    }
    @Override
    public void delete(Student t) {
        System.out.println("删除学生：" );
    }
    @Override
    public void update(Student t) {
        System.out.println("修改学生：" );
    }
    @Override
    public Student query(int id) {
        System.out.println("查询学生：" + id);
        return new Student();
    }
}
