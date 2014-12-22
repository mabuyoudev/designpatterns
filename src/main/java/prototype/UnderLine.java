package prototype;

import prototype.framework.Product;

public class UnderLine implements Product {
  
  private char ulchar;
  
  public UnderLine(char ulchar) {
    this.ulchar = ulchar;
  }

  @Override
  public String use(String s) {
    int lenght = s.getBytes().length;
    StringBuilder sb = new StringBuilder();
    sb.append("\"" + s + "\"");
    sb.append("\n");
    sb.append(" ");
    for (int i = 0; i < lenght; i++) {
      sb.append(ulchar);
    }
    sb.append("\n");
    return sb.toString();
  }

  @Override
  public Product createClone() {
    // TODO Auto-generated method stub
    return null;
  }

}
