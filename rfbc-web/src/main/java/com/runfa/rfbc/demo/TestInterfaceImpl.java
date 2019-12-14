package com.runfa.rfbc.demo;

/**
 * @Author: Hui
 * @Date: 2019-12-14
 */
public class TestInterfaceImpl implements TestInterface {
    /**
     * 测试抽象方法
     */
    @Override
    public void test1() {
        System.out.println("test1");
    }

    /**
     * 测试默认方法
     */
    @Override
    public void test2() {
        System.out.println("test2-new");
    }
}
