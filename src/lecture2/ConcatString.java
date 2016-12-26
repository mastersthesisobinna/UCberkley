package lecture2;

/*
 * The below code shows how to concat two or more strings using the concat method.
 */

/**
 *
 * @author javao
 */
public class ConcatString {
    public static void main(String args[]) throws Exception{
        //same but different ways to create String objects in java
        String s1 = "Obinna";
        String s2 = new String(" Mogbogu");//notice the space added before character M
        
        //use the concat method to combine s1 and s2. Assign to a new String variabe.
        String s3 = s1.concat(s2);
        
        //print result
        System.out.println(s3);
        
        //Multiple concat is also possible
        String s4 = " Olajide";//note the space added before character O
        String s5 = s1.concat(s4).concat(s2);
        
        //print result
        System.out.println(s5);
        
           
        
        
    }
}
