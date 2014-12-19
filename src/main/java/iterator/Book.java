package iterator;

import lombok.Getter;

public class Book {

  @Getter
  private String name;

  public Book(String title) {
    this.name = title;
  }

}
