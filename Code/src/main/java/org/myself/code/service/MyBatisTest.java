package org.myself.code.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.myself.code.Mapper.UserMapper;
import org.junit.Test;
 
import java.io.IOException;
import java.io.InputStream;
 
public class MyBatisTest {
    @Test
    public void testInsert() throws IOException {
        //获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sql的会话对象SqlSession，是MyBatis提供操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取UserMapper类的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用mapper接口中的方法，实现添加用户信息的功能
        int result = mapper.insertUser();
        System.out.println("结果:" + result);
        //提交事务（若没有commit，只会插入表中，但是不显示插入结果）
        sqlSession.commit();
        //关闭会话
        sqlSession.close();
    }
}