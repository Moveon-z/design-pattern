package com.moveon.design.factory.abstract_factory;

/**
 * @ClassName ItalyDessertFactory
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/24 15:43
 * @Version 1.0
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
