package com.moveon.design.prototype.demo;

/**
 * @ClassName RealizeType
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/24 16:01
 * @Version 1.0
 */
public class RealizeType implements Cloneable{

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        return (RealizeType) super.clone();
    }
}
