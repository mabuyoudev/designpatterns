package iterator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class BookShelfArrayListTest {

  public static class 初期状態の場合 {

    BookShelfArrayList instance;

    @Before
    public void setUp() {
      instance = new BookShelfArrayList(1);
    }

    @Test
    public void コンストラクタテスト() throws Exception {
      // Verify
      assertThat(instance, is(notNullValue()));
    }

    @Test
    public void iteratorメソッドでインスタンスが返る() throws Exception {
      // Exercise
      BookShelfArrayListIterator actual = (BookShelfArrayListIterator) instance
          .iterator();
      // Verify
      assertThat(actual, instanceOf(BookShelfArrayListIterator.class));
    }

  }

  public static class 本を1冊追加した場合 {

    BookShelfArrayList sut;
    Book               book;

    @Before
    public void setUp() {
      sut = new BookShelfArrayList(1);
      book = new Book("test");
      sut.appendBook(book);
    }

    @Test
    public void getBookAtメソッドで本を取り出すことができる() throws Exception {
      // Exercise
      Book actual = sut.getBookAt(0);
      // Verify
      assertThat(actual.getName(), is("test"));
    }

    @Test
    public void getLengthメソッドで1が返る() throws Exception {
      // Exercise
      int actual = sut.getLength();
      // Verify
      assertThat(actual, is(1));
    }

    @Test
    public void さらに1冊本を追加できる() throws Exception {
      // SetUp
      Book book2 = new Book("test2");
      // Exercise
      sut.appendBook(book2);
      // Verify
      assertThat(book2.getName(), is("test2"));
    }

  }

}
