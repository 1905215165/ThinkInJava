//: object/Doc4.java

import java.util.*;

/**
 * You can insert a list:
 * <ol>
 * <li> Item One
 * <li> Item Two 
 * <li> Item Three
 * </ol>
    
    * Another test line: 
    * <ol>
    * <li> One
    * <li> Two 
    * <li> Three
    * </ol>
     */

public class Doc4{
 
    /**
     * Let's try a public field list
     * <ol>
     * <li> One
     * <li> Two 
     * <li> Three
     * </ol>
     */
    
     public int i=2;

     /**
     * A private field list (-private to see)
     * <ol>
     * <li> One
     * <li> Two 
     * <li> Three
     * </ol>
     */

     public int j=3;

     /**
     * Another list can be inserted here to help explain the 
     * following method call
     * <ol>
     * <li> One
     * <li> Two 
     * <li> Three
     * </ol><br>
     * but may be formatted differently in Method Summary
     */
    public static void main(String[] args) {
    
        /**
         * Let's try a public field list
         * <ol>
         * <li> One
         * <li> Two 
         * <li> Three
         * </ol>
         */
        Date d = new Date();
        System.out.println("d = " + d);

    }

}