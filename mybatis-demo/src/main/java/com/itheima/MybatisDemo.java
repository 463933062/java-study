package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemo {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 方式1
        List<User> users = sqlSession.selectList("com.itheima.mapper.UserMapper.selectAll");

        // 方式2，代理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users2 = userMapper.selectAll();

        System.out.println(users);
        System.out.println(users2);

        sqlSession.close();
    }
}
