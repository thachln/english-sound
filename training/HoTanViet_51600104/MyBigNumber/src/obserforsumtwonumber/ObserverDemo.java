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
        while(true){
        Subject sub = new Subject();
        // Client configures the number and type of Observers
        new  MyBigNumber(sub);
        String s1,s2;

   
        Scanner scanner = new Scanner(System.in);   // Lớp đọc giá trị nhập vào
         System.out.println("\t\t\t~ WELCOME to Sum two number program ~"); 
        System.out.println("FirstNumber: ");
        s1 = scanner.nextLine();
        System.out.println("SecondNumber: ");
        s2= scanner.nextLine();
        
        System.out.println("\t\t\t   ~ Solution ~");
      
        sub.setState(s1,s2);
    }
    }
}
