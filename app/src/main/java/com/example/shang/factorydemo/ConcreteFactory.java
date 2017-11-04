package com.example.shang.factorydemo;

/**
 * Created by shang on 2017/11/4.
 */

//public class ConcreteFactory extends Factory {
//
//    @Override
//    public <T extends Product> T createProduct(Class<T> clz) {
//        Product product = null;
//        try {
//            product = (Product) Class.forName(clz.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return (T) product;
//    }
//}
