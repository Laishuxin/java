import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;

public class TestSqlSession {
  @Test
  public void testSqlSessionFactory() throws IOException, SQLException {
    Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
    SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsReader);
    SqlSession sqlSession = build.openSession();
    System.out.println("session: " + sqlSession);
    // int read = resourceAsReader.read();
    Connection connection = sqlSession.getConnection();
    boolean closed = connection.isClosed();
    System.out.println("isClosed" + closed);
  }
}
