package factorymethod.exercise.idcard;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

public class IDCardFactoryTest {
  
  @Test
  public void コンストラクタテスト() throws Exception {
    // Exercise
    Factory instance = new IDCardFactory();
    // Verify
    assertThat(instance, instanceOf(IDCardFactory.class));
  }
  
  @Test
  public void 製品を1つ追加できる() throws Exception {
    // SetUp
    Factory sut = new IDCardFactory();
    // Exercise
    IDCard actual = (IDCard) sut.create("test");
    // Verify
    assertThat(actual.getOwner(), is("test"));
  }


}
