package com.qdrf.rfbc;

import com.qdrf.rfbc.center.service.RfWorkflowService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class RfWorkflowTest extends BaseTest {
    @Autowired
    RfWorkflowService rfWorkflowService;

    private static Logger LOG = LoggerFactory.getLogger(RfWorkflowTest.class);

    @Test
    public void testStartProcesses(){
        LOG.info("123");
        LOG.info(rfWorkflowService.getTest());
    }
}
