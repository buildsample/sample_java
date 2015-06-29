import junit.framework.*;
import main.App;

public class TestApp extends TestCase {
  public void testInsertAndGetData() {
    String result = "";
    try {
      App app = new App();
      result = app.getData();
    } finally {
      assertEquals("Hope this works ?!", result);
    }
  } 
}

