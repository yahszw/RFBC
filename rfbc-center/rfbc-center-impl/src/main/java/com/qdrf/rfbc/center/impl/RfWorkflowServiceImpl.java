package com.qdrf.rfbc.center.impl;

import com.qdrf.rfbc.center.service.RfWorkflowService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RfWorkflowServiceImpl implements RfWorkflowService {

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private ProcessEngineConfigurationImpl processEngineConfiguration;

    private static Logger LOG = LoggerFactory.getLogger(RfWorkflowService.class);

    /**
     * 启动流程
     * @param bizId 业务id
     */
    @Override
    public void startProcesses(String bizId) {
        ProcessInstance pi = runtimeService.startProcessInstanceByKey("demo5", bizId);//流程图id，业务表id
        System.out.println("流程启动成功，流程id:"+pi.getId());
    }


    /**
     *
     * <p>描述:任务审批 	（通过/拒接） </p>
     * @author 范相如
     * @date 2018年2月25日
     * @param taskId 任务id
     * @param userId 用户id
     * @param result false OR true
     */
    @Override
    public void completeTask(String taskId,String userId,String result) {
        //获取流程实例
        taskService.claim(taskId, userId);

        Map<String,Object> vars = new HashMap<String,Object>();
        vars.put("sign", "true");
        taskService.complete(taskId, vars);
    }

    @Override
    public String getTest() {
        LOG.info("来了！");
        return "success!";
    }
}
