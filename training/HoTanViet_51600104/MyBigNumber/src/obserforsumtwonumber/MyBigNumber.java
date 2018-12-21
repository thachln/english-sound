package obserforsumtwonumber;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 51600104
 */
/**
 * Tác giả: Hồ Tấn Việt DesCription. Class MyBigNumber là lớp cộng 2 số sử dụng
 * cách đổi ký số ASCII Hàm sum trong Class MyBigNumber là hàm để tương tác với
 * các chuỗi và đổi nó bằng cách -48 ('0')
 */
public class MyBigNumber extends Observer {

    public MyBigNumber(final Subject subject) {//tao subject de tien hanh Observer
        /**
         * dat cho ngoi
         */
        this.subject = subject;
        this.subject.add(this);
    }

    /**
     * Sum 2 string.
     */
    public static String sum(final String s1, final String s2) {

        /*
     * Cộng theo thứ tự số lớn + số bé. 2 chuỗi đều có ký số từ '0 đến '9
     * <br/>
     * s1 chuỗi số thứ nhất phải có final để cố định biến s2  chuỗi số thứ hai
     * như trên return chuỗi có giá trị là tổng của hai số s1 và s2 và là chuỗi
     * đã đảo ngược
         */
        String replaceFirst = s1.replaceFirst("^0+(?!$)", "");
        String replaceFirst1 = s2.replaceFirst("^0+(?!$)", "");

        String result = "";
        final StringBuffer sb1;
        MyBigNumber cd = new MyBigNumber();
        int string1 = replaceFirst.length(); //lay do dai hai chuoi string1 va string2
        int string2 = replaceFirst1.length();
        int sumAll;
        int step = 0;
        int end = 0;

        int number1;
        int number2;
        int digit1;
        int digit2;

        // kiểm tra tính hợp lệ: return exception nếu có tham số rỗng
        try {

            // kiểm tra tính hợp lệ của tham số s1
            for (char c : replaceFirst.toCharArray()) {
                if (c - '0' < 0 || c - '0' > 9) {
                    throw new NumberFormatException();
                }
            }

            // kiểm tra tính hợp lệ của tham số s2
            for (char c : replaceFirst1.toCharArray()) {
                if (c - '0' < 0 || c - '0' > 9) {
                    throw new NumberFormatException();
                }
            }
        } catch (Exception e) {
            throw new NumberFormatException();
        }

        int max = string1; //gan mac dinh mot chuoi nao do la max, theo quy tac so lon cong so be

        if (string1 > string2) { //so sanh va gan lai bien max
            max = string1;
        } else {
            max = string2;
        }

        int flag = 0; // luu so du la 1

        for (int i = 0; i < max; i++) {

            if (i == (max - 1)) {//end of loop
                end = 2;
            }

            number1 = string1 - i - 1; //lay gia tri cuoi cua chuoi 1
            number2 = string2 - i - 1; //tuong tu voi chuoi 2, co the %10

            digit1 = 0;
            digit2 = 0; //luu ky tu xuat ra

            if (number1 >= 0) {

                digit1 = replaceFirst.charAt(number1) - '0'; //doi sang ky tu saau do doi sang so nguyen
            }
            if (number2 >= 0) {
                digit2 = replaceFirst1.charAt(number2) - '0'; // 
            }

            // int temp1 = digit1 -'0'; // doi chuoi ra so theo kieu cu
            //int temp2 = digit2 -'0'; // 
            sumAll = digit1 + digit2 + flag; // bi?n tính t?ng giá tr?.
            step += 1;

            flag = sumAll / 10; //c?ng s? du.
            if (number1 > 0) {//khi  vi tri chua dat toi 0

                result += (sumAll % 10);
                cd.send(step, digit1, digit2, result, end);

            } else {//khi vi tri da het

                if (sumAll > 9) { //9 + 9 hoac tuong tu

                    result += (sumAll % 10);//truong hop sumAll lon hon 9
                    result += 1;
                    cd.send(step, digit1, digit2, result, end);

                    if (end != 2) {//bien chua lon hon 9 va chay het chuoi
                        end = 1;
                    }

                } else {//khi 4 + 5 hoac tuong tu
                    result += sumAll;
                    cd.send(step, digit1, digit2, result, end);

                }

            }

        }

        sb1 = new StringBuffer(result);//doi ra string builder

        return sb1.reverse().toString();//reverser string with no loop

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
    public void send(final int step, final int number1, final int number2, final String stack, final int end) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm"); // class định dạng DateTime 

        if (number1 == 0 && number2 == 0) {

        } else {

            int k;
            k = number1 + number2;

            String reverse = "";
            for (int i = stack.length() - 1; i >= 0; i--) {
                reverse = reverse + stack.charAt(i);
            }

            if (k < 10) {
                System.out.println("(" + dtf.format(LocalDateTime.now()) + ")" + "Step:" + step + "" + " take " + number1 + "+" + number2 + " We got: " + k);
                System.out.println(" Stack " + reverse);
            } else {

                if (end == 0) {
                    System.out.println("(" + dtf.format(LocalDateTime.now()) + ")" + "Step:" + step + "" + " take " + number1 + "+" + number2 + " We have: " + k);
                    System.out.println(" Because " + k + ">9" + " , we got " + (k % 10) + " and remember 1");
                    System.out.println(" Stack " + reverse);
                } else if (end == 1) {

                    System.out.println("(" + dtf.format(LocalDateTime.now()) + ")" + "Step:" + step + "" + " take " + number1 + "+" + number2 + " We have: " + k);
                    System.out.println(" Because " + k + ">9" + " , we got " + (k) + "plus 1 memory" + "=" + (k + 1) + " and remember 1");
                    System.out.println(" Stack " + reverse);

                } else {
                    System.out.println("(" + dtf.format(LocalDateTime.now()) + ")" + "Step:" + step + "" + " take " + number1 + "+" + number2 + " We got: " + (k + 1));
                    System.out.println(" Stack " + reverse);
                }
            }
        }
    }
}