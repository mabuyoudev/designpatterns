package bridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextfileDisplayImpl extends DisplayImpl {

  private String         fileName;
  private FileReader     fr;
  private BufferedReader br;

  public TextfileDisplayImpl(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void rawOpen() {
    try {
      fr = new FileReader(fileName);
      br = new BufferedReader(fr);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void rawPrint() {
    try {
      String str = br.readLine();
      while (str != null) {
        System.out.println(str);
        str = br.readLine();
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void rawClose() {
    try {
      fr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
