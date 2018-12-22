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
public class MyBigNumberGUI implements IReceiver {

    public static void main(String[] args) {

        MyBigNumberGUI sub = new MyBigNumberGUI();
        // Client configures the number and type of Observers
        MyBigNumber m = new MyBigNumber(sub);

        System.out.println("\t\t\t~ WELCOME to Sum two number program ~");
        System.out.println("FirstNumber: ");

        System.out.println("SecondNumber: ");

        System.out.println("\t\t\t   ~ Solution ~");

        String sum = m.sum(args[0], args[1]);
        System.out.println("Kết quả: " + sum);

    }

    @Override
    public void send(String msg) {
        //auto execute the program
        System.out.println(msg);
    }
}
