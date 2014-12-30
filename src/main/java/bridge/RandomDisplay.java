package bridge;

import java.util.Random;

public class RandomDisplay extends Display {

  public RandomDisplay(DisplayImpl impl) {
    super(impl);
  }

  public void randomDisplay(int times) {
    open();
    Random rnd = new Random();
    for (int i = 0; i < rnd.nextInt(times); i++) {
      print();
    }
    close();
  }

}
