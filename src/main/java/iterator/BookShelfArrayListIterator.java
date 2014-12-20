package iterator;

public class BookShelfArrayListIterator implements Iterator {

  private BookShelfArrayList shelfArray;
  int                        index = 0;

  public BookShelfArrayListIterator(BookShelfArrayList shelfArray) {
    this.shelfArray = shelfArray;
  }

  @Override
  public boolean hasNext() {
    if (index < shelfArray.getLength()) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public Object next() {
    Book book = shelfArray.getBookAt(index);
    index++;
    return book;
  }
  

}
