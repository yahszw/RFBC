package com.runfa.rfbc.demo;

/**
 * @Author: Hui
 * @Date: 2019-12-11
 */
public interface TestInterface {

    String NAME = null;

    /**
     * 测试抽象方法
     */
    void test1();

    /**
     * 测试默认方法
     */
    default void test2(){
        System.out.println("test2");
    };
}
