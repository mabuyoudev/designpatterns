// commit test
package singleton.exercise;

import lombok.Getter;

public class Triple {

  private static Triple[] triple = new Triple[] { new Triple(0), new Triple(1),
      new Triple(2),            };

  @Getter
  int                     index;

  private Triple(int index) {
    this.index = index;
  }

  public static Triple getInstance(int index) {
    return triple[index];
  }

}
