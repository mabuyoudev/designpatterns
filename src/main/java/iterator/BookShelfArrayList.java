package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelfArrayList implements Aggregate {
  
  private List<Book> bookShelfArrayList;
  

  public BookShelfArrayList(int shelfSize) {
    bookShelfArrayList = new ArrayList<Book>(shelfSize);
  }
  
  public void appendBook(Book book) {
    bookShelfArrayList.add(book);
  }
  
  public Book getBookAt(int index) {
    return bookShelfArrayList.get(index);
  }
  
  public int getLength() {
    return bookShelfArrayList.size();
  }
  
  public Iterator iterator() {
    return new BookShelfArrayListIterator(this);
  }

}
