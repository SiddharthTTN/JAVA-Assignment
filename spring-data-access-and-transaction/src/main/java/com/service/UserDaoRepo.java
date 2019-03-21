package com.service;

import com.model.User;
import com.rowMapper.UserMapper;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    SessionFactory sessionFactory;

    public void userCount() {
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println(jdbcTemplate.queryForObject(sql, Integer.class));
    }

    public String getUserName() {
        String sql = "SELECT NAME FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"spring"}, String.class);
    }

    public void insertUser() {
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"springTransact", "passwordd", "spring4", 22, "1995-02-11"});
    }

    public void queryForMap() {
        String sql = "SELECT * FROM user WHERE username = ?";
        System.out.println(jdbcTemplate.queryForMap(sql, new Object[]{"springTransact"}));
    }

    public void queryForList() {
        String sql = "SELECT * FROM user";
        jdbcTemplate.queryForList(sql).forEach(System.out::println);
    }

    public User getUser() {
        String sql = "SELECT * FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"springAOP"}, new UserMapper());
    }
    public void getCountHibernate() {
        String sql = "SELECT COUNT(*) FROM user";
        Query query = sessionFactory.openSession().createQuery(sql);
        System.out.println(query.uniqueResult());
    }
}

