package com.moveon.design.factory.abstract_factory;

/**
 * @ClassName AmericanDessertFactory
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/24 15:43
 * @Version 1.0
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
