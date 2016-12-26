package lecture2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javao
 */
import java.net.*;
import java.io.*;

public class WHWWW {
    public static void main(String[] args) throws Exception{
        URL fb = new URL("https://www.facebook.com/");
        InputStream ins = fb.openStream();
        InputStreamReader insr = new InputStreamReader(ins);
        BufferedReader bfr = new BufferedReader(insr);
        String inputLine;
        
        while ((inputLine = bfr.readLine()) != null)
            System.out.println(inputLine);
        bfr.close();    
    }
}
