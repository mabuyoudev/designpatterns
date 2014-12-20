package iterator;

public class Main {

  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Around the World in 80 days"));
    bookShelf.appendBook(new Book("Bible"));
    bookShelf.appendBook(new Book("Cinderella"));
    bookShelf.appendBook(new Book("Daddy-Long-Legs"));
    Iterator it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }

    BookShelfArrayList shelfArray = new BookShelfArrayList(1);
    shelfArray.appendBook(new Book("test"));
    shelfArray.appendBook(new Book("test2"));
    Iterator it2 = shelfArray.iterator();
    while (it2.hasNext()) {
      Book book2 = (Book) it2.next();
      System.out.println(book2.getName());
    }
  }

}
