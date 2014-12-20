package iterator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class BookShelfArrayListIteratorTest {

  public static class 初期状態の場合 {

    BookShelfArrayList         shelfArray;
    BookShelfArrayListIterator sut;

    @Before
    public void setUp() {
      shelfArray = new BookShelfArrayList(1);
      sut = new BookShelfArrayListIterator(shelfArray);
    }

    @Test
    public void コンストラクタテスト() throws Exception {
      // Verify
      assertThat(sut, instanceOf(BookShelfArrayListIterator.class));
    }

  }

  public static class 本が1冊の場合 {

    BookShelfArrayList         shelfArray;
    BookShelfArrayListIterator sut;
    Book                       book;

    @Before
    public void setUp() {
      book = new Book("test");
      shelfArray = new BookShelfArrayList(1);
      shelfArray.appendBook(book);
      sut = new BookShelfArrayListIterator(shelfArray);
    }

    @Test
    public void hasNextメソッドでtrueが返る() throws Exception {
      // Verify
      assertThat(sut.hasNext(), is(true));
    }

    @Test
    public void nextメソッドで進めた後のhasNextメソッドでfalseが返る() throws Exception {
      // SetUp
      sut.next();
      // Verify
      assertThat(sut.hasNext(), is(false));
    }

    @Test
    public void nextメソッドで本のインスタンスが返る() throws Exception {
      // Exercise
      Book actual = (Book) sut.next();
      // Verify
      assertThat(actual.getName(), is("test"));
    }

  }

}
