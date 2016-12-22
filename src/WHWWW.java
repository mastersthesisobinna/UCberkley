/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javao
 */
import java.net.URL;
import java.io.*;

public class WHWWW {
    public static void main(String[] args) throws Exception{
        URL u = new URL("https://www.whitehouse.gov/");
        InputStream ins = u.openStream();
        InputStreamReader insr = new InputStreamReader(ins);
        BufferedReader bfr = new BufferedReader(insr);
        // or try this bfr = new BufferedReader(new InputStreamReader(u.openStream()));
        String webContent = bfr.readLine();
        System.out.println(webContent);
        //System.out.println(bfr);
        //System.out.println("Hi");
        
    }
}
