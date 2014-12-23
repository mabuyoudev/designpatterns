package builder.exercise;

public class XMLBuilder implements Builder {
  
  private StringBuffer buffer = new StringBuffer();

  @Override
  public void makeTitle(String title) {
    buffer.append("<?xml version=\"1.0 encoding=\"UTF-8\"?>\n");
    buffer.append("<xmlbuilder>\n<title>" + title + "</title>\n");
  }

  @Override
  public void makeString(String str) {
    buffer.append("<string>" + str + "</string>\n");
  }

  @Override
  public void makeItems(String[] items) {
    buffer.append("<items>\n");
    for (int i = 0; i < items.length; i++) {
      buffer.append("<item>" + items[i] + "</item>\n");
    }
    buffer.append("</items>\n");
  }

  @Override
  public void close() {
    buffer.append("</xmlbuilder>\n");
  }
  
  public String getResult() {
    return buffer.toString();
  }

}
