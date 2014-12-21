package factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import factorymethod.framework.Factory;
import factorymethod.framework.Product;

public class IDCardFactory extends Factory {

  @Getter
  private List<String> owners = new ArrayList<String>();

  @Override
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  protected void registerProduct(Product product) {
    owners.add(((IDCard) product).getOwner());
  }

}
