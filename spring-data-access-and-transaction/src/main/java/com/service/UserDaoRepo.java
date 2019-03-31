package com.service;

import com.model.User;
import com.rowMapper.UserMapper;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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

    @Transactional(propagation = Propagation.REQUIRED)
    //@Transactional(propagation = Propagation.REQUIRES_NEW)
    //@Transactional(propagation = Propagation.NESTED)
    //@Transactional(propagation = Propagation.MANDATORY)
    //@Transactional(propagation = Propagation.SUPPORTS)
    //@Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void insert() {
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        System.out.println("No. of rows Added : " + jdbcTemplate
                .update(sql, "harsh", "harsh101", "harsh", 20, new Date()));
//        insertUser();
    }

    @Transactional(readOnly = true)
    public void insert2() {
        insert();
    }

    @Transactional(timeout = 2)
    public void insert3() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        insert();
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = ArithmeticException.class)
    public void insert4() {
        insert();
        throw new ArithmeticException();
    }

    @Transactional(propagation = Propagation.REQUIRED, noRollbackFor = ArithmeticException.class)
    public void insert5() {
        insert();
        throw new ArithmeticException();
    }
}

