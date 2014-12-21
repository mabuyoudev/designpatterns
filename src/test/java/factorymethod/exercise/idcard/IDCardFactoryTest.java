package factorymethod.exercise.idcard;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

@RunWith(Enclosed.class)
public class IDCardFactoryTest {

  public static class 初期状態の場合 {

    @Test
    public void コンストラクタテスト() throws Exception {
      // Exercise
      Factory instance = new IDCardFactory();
      // Verify
      assertThat(instance, instanceOf(IDCardFactory.class));
    }

  }

  public static class 製品を一つ追加した場合 {

    private IDCardFactory sut;

    @Before
    public void setUp() {
      sut = new IDCardFactory();
    }

    @Test
    public void 製品を1つ追加できる() throws Exception {
      // Exercise
      IDCard actual = (IDCard) sut.create("test");
      // Verify
      assertThat(actual.getOwner(), is("test"));
    }
    
    @Test
    public void getOwnersメソッドで一覧を取得できる() throws Exception {
      // SetUp
      sut.create("test");
      // Exercise
      Map<Integer, String> actual = sut.getOwners();
      // Verify
      assertThat(actual.get(1), is("test"));
    }

  }

}
