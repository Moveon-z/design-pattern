package com.moveon.design.builder.demo1;

/**
 * @ClassName Director
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/25 10:30
 * @Version 1.0
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.buildBike();
    }
}
