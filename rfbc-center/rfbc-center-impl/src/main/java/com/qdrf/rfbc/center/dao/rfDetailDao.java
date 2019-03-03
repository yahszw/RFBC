package com.qdrf.rfbc.center.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class rfDetailDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int update() {
        String sql = "update demo set name = ? where id = ?";
        Object[] params = new Object[]{"张三",1};
        return jdbcTemplate.update(sql, params);
    }

    public List queryForList() {
        String sql = "select id ,name from demo where id = ?";
        Object[] params = new Object[]{1};
        return jdbcTemplate.queryForList(sql, params);
    }
}
