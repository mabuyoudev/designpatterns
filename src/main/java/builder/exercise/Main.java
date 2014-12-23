package builder.exercise;

public class Main {

  public static void main(String[] args) {
    TextBuilder textBuilder = new TextBuilder();
    Director director = new Director(textBuilder);
    director.construct();
    String result = textBuilder.getResult();
    System.out.println(result);
    
    XMLBuilder xmlBuilder = new XMLBuilder();
    Director director2 = new Director(xmlBuilder);
    director2.construct();
    String result2 = xmlBuilder.getResult();
    System.out.println(result2);
  }

}
