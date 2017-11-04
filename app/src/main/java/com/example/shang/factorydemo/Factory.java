package com.example.shang.factorydemo;

/**
 * Created by shang on 2017/11/4.
 */

// 抽象工厂类
public abstract class Factory {

    public abstract Product createProduct();
    //public abstract <T extends Product> T createProduct(Class<T> clz);
}
