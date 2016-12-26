/*
 * In the below program, we use the toUpperCase method in java to switch lower case strings to upper case strings.
 */
package lecture2;

/**
 *
 * @author javao
 */
public class ToUpperCaseMethod {
    public static void main(String args[]) throws Exception{
        String data = "apple";
        String lower = new String(data);
        System.out.println("LowerCase- Character is: "+lower);
        
        //create upper object using a constructor and then invoke the toUpperCase method wihin the constructor
        String upper = new String(data.toUpperCase());
        System.out.println("UpperCase- Applied within a constructor: "+upper);
        
        //invoke the toUpperCase method directly on the object
        String upper2 = lower.toUpperCase();
        System.out.println("UpperCase- Applied directly on String object: "+upper2);
                
    }
}
