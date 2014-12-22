package singleton.exercise;

import lombok.Getter;

public class Triple {

  @Getter
  private int number;

  private Triple(int number) {
    this.number = number;
  }

  public static Triple getInstance(int number) {
    return new Triple(number);
  }

}
