package iterator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class BookShelfIteratorTest {

  public static class 初期状態の場合 {

    BookShelf bookShelf;

    @Before
    public void setUp() {
      bookShelf = new BookShelf(1);
    }

    @Test
    public void コンストラクタテスト() throws Exception {
      // Exercise
      BookShelfIterator instance = new BookShelfIterator(bookShelf);
      // Verify
      assertThat(instance, is(notNullValue()));
    }
    
  }

  public static class 本が1冊ある状態の場合 {
    
    BookShelf bookShelf;
    Book book;
    BookShelfIterator sut;
    
    @Before
    public void setUP() {
      bookShelf = new BookShelf(1);
      book = new Book("test");
      bookShelf.appendBook(book);
      sut = new BookShelfIterator(bookShelf);
    }

    @Test
    public void hasNextでtrueが返る() throws Exception {
      // Verify
      assertThat(sut.hasNext(), is(true));
    }
    
    @Test
    public void nextで進めるた後のhasNextでfalseが返る() throws Exception {
      // SetUp
      sut.next();
      // Verify
      assertThat(sut.hasNext(), is(false));
    }
    
    @Test
    public void nextでbookのインスタンスが返る() throws Exception {
      // SetUp
      String expected = "test";
      // Exercise
      Book actual = (Book)sut.next();
      // Verify
      assertThat(actual.getName(), is(expected));
    }
    
  }
  
}
