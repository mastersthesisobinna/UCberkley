/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javao
 */
public class StringClassCreation {
    public static void main(String args[]) throws Exception{
        String a; //a is a variable. Not set as an object yet. Does not create any object when declared this way
        a = new String("Hello");//a is now an object of class String. The a object is an empty sequence of characters.
        System.out.println("a: "+a);
        System.out.println();
        //a = new String("Hello) is same as a = "Hello"
        //In both cases, a creates a new object with a ref number that points to a data slot containing "Hello"
        
        String b = a;//make copy of object a ref as b's ref. Thus ref in memory that points to data.
        System.out.println("b: "+b);//both ref of b and a point to the same data or hello.
        System.out.println(b == a);//since both have the same ref number, then both object will return true.
        System.out.println();
        //In the above, java does not create a new object.
        //Java simply makes copy of object a reference of its data in object b.
        //Now both object a and b point have the same reference number and point to the same data.
        //b == a does not compare the data of both objects instead it compares their ref number in memory.
        
        b = new String(a);//create a new b object, using the data of object a.
        System.out.println("b: "+b);
        System.out.println(b == a);
        System.out.println();
        //b is new object and points to a new data slot containing exactly similar copy of object a's data.
        //a does not point to the new b oject data slot. however, in its own data slot, it has a simlar data.
        //after a new b oject is created, it no longer shares the same ref number as the a object.
        //therefore b == a will return false.
        
    }
}
