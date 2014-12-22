package prototype;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class UnderLineTest {

  @Test
  public void useメソッドで装飾された文字列が返る() throws Exception {
    // SetUp
    UnderLine sut = new UnderLine('-');
    String expected = "\"a\"\n -\n";
    // Exercise
    String actual = sut.use("a");
    // Verify
    assertThat(actual, is(expected));
  }

}
