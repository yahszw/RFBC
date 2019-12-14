package com.runfa.rfbc.demo;

import java.util.Optional;

/**
 * @Author: Hui
 * @Date: 2019-12-11
 */
public class TestMain {
    public static void main(String[] args){
        //测试默认方法
        TestInterface testInterface=new TestInterfaceImpl();
        testInterface.test1();
        testInterface.test2();
        TestInterface testInterface2=null;
        Optional<TestInterface> optional = Optional.of(testInterface2);
        System.out.println(optional.orElse(testInterface));
        Optional<String> optional2 = Optional.ofNullable(new String("123"));
        optional2.map(s -> s.hashCode()).get();
    }
}
