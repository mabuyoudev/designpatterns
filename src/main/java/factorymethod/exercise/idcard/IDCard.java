package factorymethod.exercise.idcard;

import lombok.Getter;
import factorymethod.framework.Product;

public class IDCard extends Product {
  
  @Getter
  private String owner;
  @Getter
  public int number;
  
  IDCard(String owner, int number) {
    System.out.println(owner + "のカードを作ります。");
    this.owner = owner;
    this.number = number;
  }

  @Override
  public void use() {
    System.out.println("カード番号:" + number + "所有者:" + this.owner + "のカードを使います。");
  }

}
