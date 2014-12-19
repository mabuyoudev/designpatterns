package iterator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class BookShelfIteratorTest {

  @Test
  public void コンストラクタテスト() throws Exception {
    // SetUp
    BookShelf books = new BookShelf(1);
    // Exercise
    BookShelfIterator instance = new BookShelfIterator(books);
    // Verify
    assertThat(instance, is(notNullValue()));
  }

}
