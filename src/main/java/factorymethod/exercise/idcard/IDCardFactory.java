package factorymethod.exercise.idcard;

import java.util.HashMap;

import lombok.Getter;
import factorymethod.framework.Factory;
import factorymethod.framework.Product;

public class IDCardFactory extends Factory {

  @Getter
  private HashMap<Integer, String> owners = new HashMap<Integer, String>();
  private int                      number = 1;

  @Override
  protected Product createProduct(String owner) {
    IDCard card = new IDCard(owner, number);
    number++;
    return card;
  }

  @Override
  protected void registerProduct(Product product) {
    IDCard card = (IDCard) product;
    owners.put(card.getNumber(), card.getOwner());
  }

}
