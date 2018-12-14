import java.io.PrintStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Phan Quoc Thinh
 */
public class MyBigNumber {
    /**
     * @param s1 chuỗi số 1
     * @param s2 chuỗi số 2
     * @return 
     */
    
        /*example : 38 + 9
        Step 1: 8 cộng 9 bằng 17 nhớ 1
	 3 + 0 + nho = 4

	 return result(41)
        */
    
    
    public static String sum(String s_1, String s_2){
        String result = "";
        int str_1 = s_1.length(); //lấy độ dài của số đầu tiên
        int str_2 = s_2.length(); //lấy độ dài của số 2
        
        int max = str_1; //d?t gi?i h?n chu?n c?a 2 chu?i
        
        
        if(str_1 > str_2 ){//so sánh dô dài 2 chu?i d? ti?p t?c ch?y vòng l?p
            max = str_1;
        }else{
            max = str_2;
        }
        
        int flag = 0; // t?o 1 bi?n c? d? luu l?i giá tr? du
        
        for (int i=0; i<max ; i++){
            int num_1 = str_1 - i - 1 ; //giá tr? cu?i cùng c?a chu?i 1;
            int num_2 = str_2 - i - 1 ; //giá tr? cu?i cùng c?a chu?i 2;
            
            char dig_1 = '0', dig_2 = '0'; // bien luu vao khi xuat ket qua ra
            
            if(num_1 >=0 ){
                dig_1 = s_1.charAt(num_1); // lay so o vtri num_1
            }
            if(num_2 >=0 ){
                dig_2 = s_2.charAt(num_2); // lay so o vtri num_2
            }
            
            int temp_1 = dig_1 -'0'; 
            int temp_2 = dig_2 -'0'; 
            
            int sumAll = temp_1 + temp_2 + flag; // bi?n tính t?ng giá tr?.
            
            if(num_1 > 0){
                result += (sumAll % 10);
            }else {
                result += sumAll;
            }
            flag = sumAll/10 ; //cong cac so du lai
        }
        return result;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Nhập vào số thứ nhất: ");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào số thứ hai: ");
        String s2 = scanner.nextLine();
        
        System.out.println(sum(s1,s2));
    }
    
}
