package com.example.shang.factorydemo;

/**
 * Created by shang on 2017/11/4.
 */

// 客户类
public class Client {
    public static void main(String []args){
        Factory factory = new FactoryA();
        Product product = factory.createProduct();
        product.method();
    }
}
