package com.qdrf.rfbc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAsync//支持异步操作
@EnableTransactionManagement //启用事务等  同于xml配置方式的 <tx:annotation-driven />
public class RfbcCenterApplication
{
    public static void main(String[] args) {
        SpringApplication.run(RfbcCenterApplication.class, args);
    }
}
