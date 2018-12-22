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
public class MyBigNumberGUI implements IReceiver{
    public static void main( String[] args ) {
        String s1,s2;
        
        while(true){
        MyBigNumberGUI sub = new MyBigNumberGUI();
        // Client configures the number and type of Observers
        MyBigNumber m = new MyBigNumber(sub);
       
        

   
        Scanner scanner = new Scanner(System.in);   // Lớp đọc giá trị nhập vào
         System.out.println("\t\t\t~ WELCOME to Sum two number program ~"); 
        System.out.println("FirstNumber: ");
        s1 = scanner.nextLine();
        System.out.println("SecondNumber: ");
        s2= scanner.nextLine();
        
        System.out.println("\t\t\t   ~ Solution ~");
      
        
        String sum = m.sum(s1, s2);
        System.out.println("Kết quả: " + sum);
    }
    }

    @Override
    public void send(String msg) {
        //auto execute the program
       System.out.println(msg);
    }
}
