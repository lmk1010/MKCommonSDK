package com.mk.baseservice.dao.impl;

import com.mk.baseservice.dao.BaseInstanceDao;

import java.util.Map;

/**
 * @Author liumingkang
 * @Date 2019-09-07 22:52
 * @Destcription TODO 基础DAO层实现类
 * @Version 1.0
 **/
public class BaseInstanceDaoImpl implements BaseInstanceDao {

    @Override
    public Object selectInstanceById(long id) {
        return null;
    }

    @Override
    public Object selectInstanceBySql(String sql) {
        return null;
    }

    @Override
    public Object selectInstanceByTable(String modelName, Map<String, Object> queryParams) {
        return null;
    }
}
