package com.nagoriyuki.demo8Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    //4. 准备一个集合容器，存储全部上架的电影数据
    private static List<Movie> movies =new ArrayList<>();
    private static Scanner scanner=new Scanner(System.in);
    public void start() {while (true) {
        //3. 准备操作界面/cmd命令
        System.out.println("==欢迎来到电影管理系统==");
        System.out.println("1. 上架某个电影");
        System.out.println("2. 删除某个电影");
        System.out.println("3. 查询某个电影");
        System.out.println("4. 封杀某个明星");
        System.out.println("5. 退出");
        System.out.println("6. 展示所有电影");
        System.out.println("请你输入操作命令");
        String cmd = scanner.next();
        switch (cmd) {
            case "1":
                System.out.println("上架电影");
                addMovie();
                break;
            case "2":
                System.out.println("删除电影");
                deleteMovie();
                break;
            case "3":
                System.out.println("查询电影");
                queryMovie();
                break;
            case "4":
                System.out.println("封杀明星");
                killStar();
                break;
            case "5":
                System.out.println("退出成功");
                System.exit(0);
                return;
            case "6":
                System.out.println("展示所有电影");
                showAllMovie();
                break;
            default:
                System.out.println("输入有误");
                start();
        }
    }
    }


    /*
    1. 上架电影
     */
    private void addMovie(){
        //分析：每点击一次上架电影，其实就是新增一部电影，每部电影都是一个电影对象封装数据的
        //1. 创建电影对象，封装这部电影信息
        Movie movie=new Movie();
        //2. 给电影对象注入数据
        System.out.println("==请输入电影名称：==");
        movie.setName(scanner.next());
        System.out.println("请输入电影价格：");
        movie.setPrice(scanner.nextDouble());
        System.out.println("请输入电影演员：");
        movie.setActor(scanner.next());
        System.out.println("请输入电影评分：");
        movie.setScore(scanner.nextDouble());
        //3. 把电影对象添加到集合当中去
        movies.add(movie); // 把新电影加入到列表中
        System.out.println("《" + movie.getName() + "》 上架成功！");
    }
    /**
     *  查询某个电影
     */
    private void queryMovie() {
        System.out.println("==查询电影==");
    System.out.println("请输入电影名称：");
    String name=scanner.next();
    //根据电影名称查询电影对象，返回
        Movie movie=queryMovieByName(name);
    }
    //根据电影名称查询电影对象，返回
    //movies=[m1,m2,m2……]
    //
    private Movie queryMovieByName(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;//没有找到电影对象
    }
    /*
    删除某个电影
     */
     private void deleteMovie() {
         System.out.println("==删除电影==");
         System.out.println("请输入电影名称：");
         String name=scanner.next();
         //根据电影名称查询电影对象，返回
         Movie movie=queryMovieByName(name);
         if (movie==null) {
             System.out.println("没有找到电影");
             return;
         }
         //删除电影对象
         movies.remove(movie);
         System.out.println("删除成功");
     }
     /*
     封杀某个明星
     */
    private void killStar() {
        System.out.println("==封杀明星==");
        System.out.println("请输入明星名称：");
        String name=scanner.next();
        //根据明星名称查询电影对象，返回
        for(int i=0;i<movies.size();i++){
            Movie movie=movies.get(i);
            if (movie.getActor().equals(name)) {
                movies.remove(movie);
                System.out.println("封杀成功");
                i--;//退一步
            }
        }
        //展示全部电影
        showAllMovie();
    }
/*
展示所有电影
 */
    private void showAllMovie() {
        System.out.println("==展示所有电影==");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }


}
