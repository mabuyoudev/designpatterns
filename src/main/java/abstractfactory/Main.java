package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

public class Main {

  public static void main(String[] args) {
    Factory factory = Factory.getFactory("abstractfactory.listfactory.ListFactory");
    
    Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
    Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");
    
    Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
    Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
    Link excite = factory.createLink("Excite", "http://www.excite.com/");
    Link google = factory.createLink("Google", "http://www.google.com/");
    
    Tray traynews = factory.createTray("新聞");
    traynews.add(asahi);
    traynews.add(yomiuri);
    
    Tray trayyahoo = factory.createTray("Yahoo!");
    trayyahoo.add(us_yahoo);
    trayyahoo.add(jp_yahoo);
    
    Tray traysearch = factory.createTray("サーチエンジン");
    traysearch.add(trayyahoo);
    traysearch.add(excite);
    traysearch.add(google);
    
    Page page = factory.createPage("LinkPage", "結城 浩");
    page.add(traynews);
    page.add(traysearch);
    page.output();
  }

}
