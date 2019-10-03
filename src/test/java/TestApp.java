import junit.framework.*;
import main.App;

public class TestApp extends TestCase {
  public void testInsertAndGetDataIsEqual() {
    String result = "";
    App app = new App();
    result = app.getData();
    assertEquals("Message is not the same", "Hope this works!", result);
  } 

  public void testInsertAndGetDataNotEmpty() {
    String result = "";
    App app = new App();
    result = app.getData();
    assertNotNull("Message is null", result);
  }
}

