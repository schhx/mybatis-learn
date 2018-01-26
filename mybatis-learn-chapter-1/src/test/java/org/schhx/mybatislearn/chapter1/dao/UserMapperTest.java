package org.schhx.mybatislearn.chapter1.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.schhx.mybatislearn.chapter1.entity.User;

import java.io.InputStream;
import java.util.UUID;

public class UserMapperTest {

    private SqlSession session;
    private UserMapper userMapper;


    @Before
    public void getUserDao() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        session = sqlSessionFactory.openSession(true);
        userMapper = session.getMapper(UserMapper.class);
    }

    @After
    public void close(){
        session.close();
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        User user = userMapper.selectByPrimaryKey("001");
        System.out.println(user);
    }

    @Test
    public void insert() throws Exception {
        String id = UUID.randomUUID().toString();
        userMapper.insert(new User(id, "李四", 21));
    }

}