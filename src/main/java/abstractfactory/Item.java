/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author yusukemabuchi
 */
public abstract class Item {
  
  protected String caption;

  public Item(String caption) {
    this.caption = caption;
  }

  public abstract String makeHTML();
}
