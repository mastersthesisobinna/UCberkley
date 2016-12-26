/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture2;

import java.io.File;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author javao
 */
public class WHWWWpart2 {
    public static void main(String args[]) throws Exception{
        
        Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/List_of_countries_by_GDP_(nominal)").get();
        String title = doc.title();
        Element body = doc.body();
        System.out.println();
        
        String text = body.tagName("table").data();
        System.out.println(text);
    }
}
