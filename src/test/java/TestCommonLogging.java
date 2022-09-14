import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class TestCommonLogging {
  protected  final Log log = LogFactory.getLog(getClass());

  @Test
  public void testLogging() {
    log.info("hello");
  }

  @Test
  public void testClass() {
    getClassInfo(String.class);
  }

  private void getClassInfo(Class cls) {
    log.info("name: " + cls.getName());
    log.info("name: " + cls.getSimpleName());
    try {
      log.info("name" + cls.getField("demo"));
    } catch (NoSuchFieldException e) {
      throw new RuntimeException(e);
    }
  }
}
