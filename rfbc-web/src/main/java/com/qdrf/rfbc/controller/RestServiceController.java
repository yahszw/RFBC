package com.qdrf.rfbc.controller;

public interface RestServiceController<Model, String> {
    public Object getOne(java.lang.String id);
    public Object getList( Integer rowSize, Integer page);
    public Object postOne(org.activiti.engine.repository.Model entity);
    public Object putOne(java.lang.String s, org.activiti.engine.repository.Model entity);
    public Object patchOne(java.lang.String s, org.activiti.engine.repository.Model entity);
}