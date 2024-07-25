package com.moveon.design.builder.demo1;

/**
 * @ClassName Client
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/25 10:31
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 创建指挥者对象
        Director director = new Director(new MobileBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
    }
}
