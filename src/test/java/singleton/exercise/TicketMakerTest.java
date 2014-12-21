package singleton.exercise;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class TicketMakerTest {

  public static class インスタンスが1つの場合 {

    @Test
    public void getNextTicketNumberメソッドで1001が返る() throws Exception {
      // SetUp
      TicketMaker sut = TicketMaker.getInstance();
      // Verify
      assertThat(sut.getNextTicketNumber(), is(1001));
    }

  }

  public static class インスタンスが2つの場合 {

    TicketMaker sut1;
    TicketMaker sut2;

    @Before
    public void setUp() {
      sut1 = TicketMaker.getInstance();
      sut2 = TicketMaker.getInstance();
    }

    @Test
    public void 正しく連番になっている() throws Exception {
      // Exercise
      int actual1 = sut1.getNextTicketNumber();
      int actual2 = sut2.getNextTicketNumber();
      // Verify
      assertThat(actual1, is(1002));
      assertThat(actual2, is(1003));
    }

    @Test
    public void Singletonパターンが適用されている() throws Exception {
      // Verify
      assertThat(sut1, is(sut2));
    }

  }

}
