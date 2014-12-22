package prototype;

import prototype.framework.Product;

public class MessageBox implements Product {
  
  private char decochar;
  
  public MessageBox(char decochar) {
    this.decochar = decochar;
  }

  @Override
  public String use(String s) {
    int length = s.getBytes().length;
    StringBuilder sb = new StringBuilder();
    sb.append(drawLine(decochar, length));
    sb.append("\n");
    sb.append(decochar + " " + s + " " + decochar);
    sb.append("\n");
    sb.append(drawLine(decochar, length));
    sb.append("\n");
    return sb.toString();
  }
  
  private String drawLine(char decochar, int length) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < length + 4; i++) {
      sb.append(decochar);
    }
    return sb.toString();
  }

  @Override
  public Product createClone() {
    Product p = null;
    try {
      p = (Product) clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return p;
  }

}
