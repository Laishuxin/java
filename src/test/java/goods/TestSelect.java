package goods;

import com.demo.mybatis.MyBatisUtils;
import com.demo.mybatis.entity.Goods;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestSelect {
  @Test
  public void testSelectAll() {
    SqlSession session = null;
    try (SqlSession session1 = MyBatisUtils.openSession()) {
      List<Goods> goodsList = session1.selectList("goods.selectAll");

      goodsList.forEach((c) -> {
        System.out.println(c.getTitle());
        System.out.println(c.getSubTitle());
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testSelect() {
    try (SqlSession session = MyBatisUtils.openSession()) {
      Goods g = session.selectOne("goods.selectById", 1602);
      System.out.println(g);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testSelectByCurrentPrice() {
    try (SqlSession session = MyBatisUtils.openSession()) {
      Map map = new HashMap();
      map.put("min", 100);
      map.put("max", 200);
      map.put("limit", 10);
      List<Goods> goods = session.selectList("goods.selectByPriceInterval", map);
      System.out.println(goods.size());
      goods.forEach(g -> {
        System.out.println(g);
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
