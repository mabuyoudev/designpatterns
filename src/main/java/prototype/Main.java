package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class Main {

  public static void main(String[] args) {
    // 準備
    Manager manager = new Manager();
    UnderLine ul = new UnderLine('~');
    MessageBox mbox = new MessageBox('*');
    MessageBox sbox = new MessageBox('/');
    manager.register("strong message", ul);
    manager.register("warning box", mbox);
    manager.register("slash box", sbox);
    
    // 生成
    Product p1 = manager.create("strong message");
    Product p2 = manager.create("warning box");
    Product p3 = manager.create("slash box");
    
    System.out.println(p1.use("Hello, world"));
    System.out.println(p2.use("Hello, world"));
    System.out.println(p3.use("Hello, world"));
  }

}
