/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javao
 */
import java.io.*;

public class ReaderKeyboard {
    public static void main(String args[]) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        System.out.println("Enter name");
        String name = bfr.readLine();
        System.out.println("Hello "+name);
    }    
}
