package com.mk.baseservice.service;

import java.util.List;

/**
 * @Author liumingkang
 * @Date 2019-09-07 22:53
 * @Destcription TODO 数据实体通用操作类接口
 * @Version 1.0
 **/
public interface BaseInstanceManager
{
    /**
    *
     * @Author liumingkang
     * @Description //TODO 通过sql直接查询接口
     * @Date 13:32 2019-09-08
     * @Param [sql]
     * @return java.util.List
     **/
    public List getInstanceList(String sql);

}
