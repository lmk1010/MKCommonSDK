package com.mk.baseservice.dao.impl;

import com.mk.baseservice.dao.BaseInstanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author liumingkang
 * @Date 2019-09-07 22:52
 * @Destcription TODO 基础DAO层实现类 使用JDBCTemplate实现
 * @Version 1.0
 **/
@Repository("baseInstanceDao")
public class BaseInstanceDaoImpl implements BaseInstanceDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Object selectInstanceById(String modelName,long id) {
        if (0 == id || null == modelName)
        {
            return null;
        }
        StringBuffer sql = new StringBuffer();
        sql.append("select * from ");
        sql.append(modelName + "where id =" + id);

        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql.toString());


        return null;
    }

    @Override
    public List selectInstanceBySql(String sql) {
        if (false == checkSqlStandard(sql))
        {
            return null;
        }
        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);

        return resultList;
    }

    @Override
    public List<Object> selectInstanceByCondition(String modelName, String conditionSql) {
        return null;
    }

    @Override
    public List<Object> selectInstanceByTable(String modelName, Map<String, Object> queryParams) {
        return null;
    }

    /**
    *
     * @Author liumingkang
     * @Description //TODO 校验SQL的标准 如有不标准的SQL则直接返回
     * @Date 13:25 2019-09-08
     * @Param [sql]
     * @return boolean
     **/
    private boolean checkSqlStandard(String sql)
    {
        if (null == sql)
        {
            return false;
        }
        // todo 校验规则



        return true;
    }
}
