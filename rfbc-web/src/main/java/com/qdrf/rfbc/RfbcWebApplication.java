package com.qdrf.rfbc;


import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}
)
public class RfbcWebApplication
{
    public static void main(String[] args) {
        SpringApplication.run(RfbcWebApplication.class, args);
    }
}
