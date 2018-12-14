/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserforsum2number;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 51600104
 */
public class MyBigNumber extends Observer {

    public MyBigNumber(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    //dat cho ngoi 

    public static String sum(final String s1, final String s2) {

        String result = "";
        MyBigNumber cd = new MyBigNumber();
        int string1 = s1.length(); //lay do dai hai chuoi string1 va string2
        int string2 = s2.length();
        int sumAll;
        int step = 0;

        int number1;
        int number2;
        int digit1;
        int digit2;

        int max = string1; //gan mac dinh mot chuoi nao do la max, theo quy tac so lon cong so be

        if (string1 > string2) { //so sanh va gan lai bien max
            max = string1;
        } else {
            max = string2;
        }

        int flag = 0; // luu so du la 1

        for (int i = 0; i < max; i++) {
            number1 = string1 - i - 1; //lay gia tri cuoi cua chuoi 1
            number2 = string2 - i - 1; //tuong tu voi chuoi 2, co the %10

            digit1 = 0;
            digit2 = 0; //luu ky tu xuat ra

            if (number1 >= 0) {

                digit1 = s1.charAt(number1) - '0'; //doi sang ky tu saau do doi sang so nguyen
            }
            if (number2 >= 0) {
                digit2 = s2.charAt(number2) - '0'; // 
            }
            
            
            
            
            // int temp1 = digit1 -'0'; // doi chuoi ra so theo kieu cu
            //int temp2 = digit2 -'0'; // 
            sumAll = digit1 + digit2 + flag; // bi?n tính t?ng giá tr?.
            

            flag = sumAll / 10; //c?ng s? du.
            if (number1 > 0) {
                result += (sumAll % 10);
                cd.send(step,digit1,digit2,result);
            } else {
                if (sumAll > 9) {
                    result += (sumAll % 10);//truong hop sumAll lon hon 9
                    result += 1;
                     cd.send(step,digit1,digit2,result);
                } else {
                    result += sumAll;
                      cd.send(step,digit1,digit2,result);
                }

            }
                step +=1;
        }

        String reverse = "";
        for (int i = result.length() - 1; i >= 0; i--) {
            reverse = reverse + result.charAt(i);
        }

        return reverse;

    }
    //thuc hien hanh dong ngoi xuong

    public MyBigNumber() {
        
    }

    @Override
    public void update() {
        System.out.print("Result : " + sum(subject.getString1(), subject.getString2()) + "\n");
    }
    //in ra ket qua

    @Override
    public  void send(int step, int number1, int number2, String stack) {
        int k;
        k = number1 + number2;
        
        String reverse = "";
        for (int i = stack.length() - 1; i >= 0; i--) {
            reverse = reverse + stack.charAt(i);
        }
        
        if (k < 10) {
            System.out.println("Step:" + step + "" + " take " + number1 + "+" + number2 + " We have: " + k);
            System.out.println("Stack "+reverse);
        } else {
            
            System.out.println("Step:" + step + "" + " take " + number1 + "+" + number2 + " We have: " + k);
            System.out.println("Because "+k+">9"+" , we take "+(k%10)+ " and remember 1");
            System.out.println("Stack "+reverse);
        }
    }
}
