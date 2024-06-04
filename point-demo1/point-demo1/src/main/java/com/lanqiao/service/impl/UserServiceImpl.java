package com.lanqiao.service.impl;

import com.lanqiao.mapper.UserMapper;
import com.lanqiao.pojo.User;
import com.lanqiao.service.UserService;
import com.lanqiao.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserServiceImpl implements UserService {

    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public User UserSelect(String username, String password) {
        // 2.获取sqlsession对象
        SqlSession sqlSession = factory.openSession();
        // 3.获取BrandMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.UserSelect(username, password);

        sqlSession.close(); // 释放资源
        return user;
    }
}
