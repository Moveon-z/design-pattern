package com.moveon.design.builder.demo1;

/**
 * @ClassName OfoBuilder
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/25 10:29
 * @Version 1.0
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike buildBike() {
        return bike;
    }
}
