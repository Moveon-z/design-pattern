package com.moveon.design.builder.demo2;

/**
 * @ClassName Client
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/25 10:57
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 创建手机对象
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿")
                .mainBoard("华硕")
                .build();
    }
}
