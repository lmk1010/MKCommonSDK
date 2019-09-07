package com.mk.baseservice.dao;

import java.util.Map;

/**
 * @Author liumingkang
 * @Date 2019-09-07 22:52
 * @Destcription TODO 基础底层DAO通用操作类
 * @Version 1.0
 **/
public interface BaseInstanceDao 
{
    /**
    *
     * @Author liumingkang
     * @Description //TODO  根据ID查询记录
     * @Date 22:56 2019-09-07
     * @Param [id]
     * @return java.lang.Object
     **/
    public Object selectInstanceById(long id);
    
    /**
    *
     * @Author liumingkang
     * @Description //TODO 根据自定义sql查询
     * @Date 22:57 2019-09-07
     * @Param [sql]
     * @return java.lang.Object
     **/
    public Object selectInstanceBySql(String sql);
    
    /**
    *
     * @Author liumingkang
     * @Description //TODO 根据表名和参数进行查询
     * @Date 22:59 2019-09-07
     * @Param [modelName, queryParams]
     * @return java.lang.Object
     **/
    public Object selectInstanceByTable(String modelName, Map<String,Object> queryParams);
    
}
