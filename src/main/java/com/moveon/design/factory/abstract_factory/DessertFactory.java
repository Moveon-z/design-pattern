package com.moveon.design.factory.abstract_factory;

/**
 * @ClassName DessertFactory
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/24 15:41
 * @Version 1.0
 */
public interface DessertFactory {

    /**
     * 生产咖啡的功能
     * @return
     */
    Coffee createCoffee();

    /**
     * 生产甜品的功能
     * @return
     */
    Dessert createDessert();
}
