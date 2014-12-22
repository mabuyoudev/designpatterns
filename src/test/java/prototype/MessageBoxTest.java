package prototype;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MessageBoxTest {

  @Test
  public void useメソッドにaを渡すと装飾された文字列が返る() throws Exception {
    // SetUp
    MessageBox sut = new MessageBox('*');
    String expected = "*****\n* a *\n*****\n";
    // Exercise
    String actual = sut.use("a");
    // Verify
    assertThat(actual, is(expected));
  }

}
