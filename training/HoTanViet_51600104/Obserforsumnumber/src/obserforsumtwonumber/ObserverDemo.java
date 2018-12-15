/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserforsumtwonumber;

import java.util.Scanner;

/**
 *
 * @author 51600104
 */
public class ObserverDemo {
    public static void main( String[] args ) {
        Subject sub = new Subject();
        // Client configures the number and type of Observers
        new  MyBigNumber(sub);
        
       String s1 = "999";
       String s2 = "999";
      
            
            sub.setState(s1,s2);
    }
}
