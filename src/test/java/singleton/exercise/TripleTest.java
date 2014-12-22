package singleton.exercise;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TripleTest {

  @Test
  public void getInstanceメソッドへ引数1を渡すと1のインスタンスが返る() throws Exception {
    // Exercise
    Triple sut = Triple.getInstance(1);
    // Verify
    assertThat(sut.getIndex(), is(1));
  }

}
