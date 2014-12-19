package iterator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

  @Test
  public void インスタンス化のテスト() throws Exception {
    // Exercise
    Book instance = new Book("test");
    // Verify
    assertThat(instance.getName(), is("test"));
  }

}
