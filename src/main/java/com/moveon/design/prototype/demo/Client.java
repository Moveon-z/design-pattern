package com.moveon.design.prototype.demo;

/**
 * @ClassName Client
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/24 16:02
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = realizeType.clone();
        System.out.println(realizeType == clone);
    }
}
