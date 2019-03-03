package com.qdrf.rfbc;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTest {
    private static Logger LOG = LoggerFactory.getLogger(BaseTest.class);
    @Before
    public void init() {
        LOG.info("开始测试-----------------");
    }

    @After
    public void after() {
        LOG.info("测试结束-----------------");
    }
}
