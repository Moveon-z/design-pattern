package com.moveon.design.builder.demo1;

/**
 * @ClassName Builder
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/25 10:26
 * @Version 1.0
 */
public abstract class Builder {

    /**
     * 生命Bike类型的变量，并进行赋值
     */
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike buildBike();
}
