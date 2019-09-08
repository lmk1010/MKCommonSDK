package com.mk.baseservice.service.impl;

import com.mk.baseservice.dao.BaseInstanceDao;
import com.mk.baseservice.service.BaseInstanceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author liumingkang
 * @Date 2019-09-07 22:53
 * @Destcription TODO 基础实体类操作管理实现类 CURD
 * @Version 1.0
 **/
@Service("baseInstanceManager")
@Transactional
public class BaseInstanceManagerImpl implements BaseInstanceManager
{

    @Autowired
    private BaseInstanceDao baseInstanceDao;

    @Override
    public List getInstanceList(String sql) {
        return baseInstanceDao.selectInstanceBySql(sql);
    }
}
