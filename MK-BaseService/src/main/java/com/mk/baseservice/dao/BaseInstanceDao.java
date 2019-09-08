package com.mk.baseservice.dao;

import java.util.List;
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
    public Object selectInstanceById(String modelName,long id);
    
    /**
    *
     * @Author liumingkang
     * @Description //TODO 根据自定义sql查询
     * @Date 22:57 2019-09-07
     * @Param [sql]
     * @return java.util.List
     **/
    public List<Object> selectInstanceBySql(String sql);

    /**
    *
     * @Author liumingkang
     * @Description //TODO 通过sql条件进行查询 动态拼接
     * @Date 12:29 2019-09-08
     * @Param [modelName, conditionSql]
     * @return java.util.List<java.lang.Object>
     **/
    public List<Object> selectInstanceByCondition(String modelName,String conditionSql);

    /**
    *
     * @Author liumingkang
     * @Description //TODO 根据表名和参数进行查询 实现动态生成sql 通过占位符拼接
     * @Date 22:59 2019-09-07
     * @Param [modelName, queryParams]
     * @return java.lang.Object
     **/
    public List<Object> selectInstanceByTable(String modelName, Map<String,Object> queryParams);

    
}
