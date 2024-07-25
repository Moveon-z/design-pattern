package com.moveon.design.factory.abstract_factory;

/**
 * @ClassName Client
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/24 15:45
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        coffee.show();
        dessert.show();
    }
}
