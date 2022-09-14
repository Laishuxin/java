package com.demo.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtils {
  private static SqlSessionFactory sqlSessionFactory = null;

  static {
    Reader resourceAsReader = null;
    try {
      resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
    } catch (IOException e) {
      e.printStackTrace();
      throw new ExceptionInInitializerError(e);
    }
  }

  public static SqlSession openSession() {
    return sqlSessionFactory.openSession();
  }

  public static void closeSession(SqlSession sqlSession) {
    if (sqlSession != null) sqlSession.close();
  }
}
