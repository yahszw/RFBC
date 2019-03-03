package com.qdrf.rfbc.center.service;

public interface RfWorkflowService {

    /**
     * 启动流程
     * @param bizId 业务id
     */
    public void startProcesses(String bizId);

    /**
     *
     * <p>描述:任务审批 	（通过/拒接） </p>
     * @author 范相如
     * @date 2018年2月25日
     * @param taskId 任务id
     * @param userId 用户id
     * @param result false OR true
     */
    public void completeTask(String taskId,String userId,String result);

    public String getTest();
}
