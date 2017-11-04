package com.example.shang.factorydemo;

/**
 * Created by shang on 2017/11/4.
 */

// 具体工厂类A
public class FactoryA extends Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
