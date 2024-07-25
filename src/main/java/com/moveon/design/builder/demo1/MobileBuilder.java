package com.moveon.design.builder.demo1;

/**
 * @ClassName MobileBuilder
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/25 10:28
 * @Version 1.0
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike buildBike() {
        return bike;
    }
}
