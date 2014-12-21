package adapter.example;

import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    FileIO f = new FileProperties();
    String inputFilename = "/Users/yusukemabuchi/Documents/sourceCode/eclipse/DesignPatterns/target/classes/adapter/example/file.txt";
    String outputFilename = "/Users/yusukemabuchi/Documents/sourceCode/eclipse/DesignPatterns/target/classes/adapter/example/newfile.txt";
    try {
      f.readFromFile(inputFilename);
      f.setValue("year", "2004");
      f.setValue("month", "4");
      f.setValue("day", "21");
      f.writeToFile(outputFilename);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
