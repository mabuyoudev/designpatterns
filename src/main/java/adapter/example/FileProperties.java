package adapter.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {

  FileInputStream  fis;
  Properties       props;
  FileOutputStream fos;

  @Override
  public void readFromFile(String fileName) throws IOException {
    fis = new FileInputStream(new File(fileName));
    props = new Properties();
    props.load(fis);
    fis.close();
  }

  @Override
  public void writeToFile(String fileName) throws IOException {
    fos = new FileOutputStream(new File(fileName));
    String header = "written by FileProperties";
    props.store(fos, header);
    fos.close();
  }

  @Override
  public void setValue(String key, String value) {
    props.setProperty(key, value);
  }

  @Override
  public String getValue(String key) {
    return props.getProperty(key);
  }

}
