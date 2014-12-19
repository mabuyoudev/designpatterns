package iterator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class BookShelfTest {

  public static class 初期化の場合 {
    
    BookShelf instance;
    
    @Before
    public void setUp() {
      instance = new BookShelf(1);
    }

    @Test
    public void インスタンス化テスト() throws Exception {
      // Verify
      assertThat(instance, is(notNullValue()));
    }
    
    @Test
    public void iteratorでBookShelfIteratorのインスタンスが返る() throws Exception {
      // Exercise
      BookShelfIterator actual = (BookShelfIterator)instance.iterator();
      // Verify
      assertThat(actual, instanceOf(BookShelfIterator.class));
    }

  }

  public static class 本を1つ追加した場合 {
    
    BookShelf sut;
    Book test;
    
    @Before
    public void setUp() {
      sut = new BookShelf(1);
      test = new Book("test");
      sut.appendBook(test);
    }

    @Test
    public void 追加した本を取り出すことができる() throws Exception {
      // Exercise
      Book actual = sut.getBookAt(0);
      // Verify
      assertThat(actual.getName(), is(test.getName()));
    }
    
    @Test
    public void getLengthで1が返る() throws Exception {
      // Verify
      assertThat(sut.getLength(), is(1));
    }

  }

}
