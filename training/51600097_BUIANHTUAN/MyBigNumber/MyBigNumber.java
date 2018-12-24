/**
 * Tác giả:  Bùi Anh Tuấn.
 * DesCription.
*/

public class MyBigNumber {

    private final GetData getData;

    public MyBigNumber(final GetData getData) {
        this.getData = getData;
    }
    
    /**
     * Để thực hiện phép cộng, ta cần 2 chuỗi làm tham số cho hàm sum trong đó:
     * a và b phải là những số từ [0-9].
     * @param s1 chuỗi số thứ nhất.
     * @param s2 chuỗi số thứ hai.
     * @return chuỗi có giá trị là tổng của hai số s1 và s2.
     */
    public String sum(final String s1,final String s2) {
        String message;
        String result = "";
        String source = "";
        int str1 = s1.length(); 
        int str2 = s2.length(); 
        int max = str1; 
        if (str1 > str2) {
            max = str1;
        } else {
            max = str2;
        }
        int num1;
        int num2;
        char digit1;
        char digit2;
        int temp = 0; 
        int a;
        int b;
        int first;
        int second; 
        String pattern = "\\d+";
        boolean p1 = s1.matches(pattern);
        boolean p2 = s2.matches(pattern);
        
       
        if (!p1) {
            this.getData.takeandgive("NumberFormatException(\"Ôi không số em đã nhập sai số đầu tiên rồi: " + s1);
            throw new NumberFormatException("Em hãy nhập lại số đầu tiên đi nào (^_^) " + s1);
        }
        if (!p2) {
            this.getData.takeandgive("NumberFormatException(\"Ôi không số em đã nhập sai số thứ hai rồi: " + s2);
            throw new NumberFormatException("Em hãy nhập lại số thứ hai đi nào (^_^) " + s2);
        }
        if ("".equals(s1)) {
            s1 = "0";
            str1 = s1.length();
        }
        if ("".equals(s2)) {
            s2 = "0";
            str2 = s2.length();
        }
        if (s1.charAt(0) == '-') {
            this.getData.takeandgive("NumberFormatException(\"Không hỗ trợ số âm: " + s1);
            throw new NumberFormatException("Em hãy nhập lại số đầu tiên đi nào (^_^) " + s1);
        }
        if (s2.charAt(0) == '-') {
            this.getData.takeandgive("NumberFormatException(\"Không hỗ trợ số âm: " + s2);
            throw new NumberFormatException("Em hãy nhập lại số thứ hai đi nào (^_^) " + s2);
        }

        

        //*Thực hiện phép tính
        for (int i = 0; i < max; ++i) {
            num1 = str1 - i - 1;
            num2 = str2 - i - 1;

            if (num1 >= 0) {
                digit1 = s1.charAt(num1);
            } else {
                digit1 = '0';
            }
            if (num2 >= 0) {
                digit2 = s2.charAt(num2); 
            } else {
                digit2 = '0';
            }

            a = digit1 - '0';
            b = digit2 - '0';
            first = a + b + temp;
            second = a + b;
            result = (first % 10) + result;
            temp = first / 10;

            if (i == 0) {
                message = "Bước đầu tiên các em được " + a + " + " + b + " = " + second + " và nhớ  " + temp + "\n";
            } else {
                message = "Bước kế tiếp các em được " + a + " + " + b + " = " + second + " và nhớ  " + temp + "\n";
            }

            source = source + message;
        }
        if (temp > 0) {
            result = temp + result;
        }
        source = "\n" + s1 + " + " + s2 + " = " + result + "\n" + "Process implementation : \n" + source;
        this.getData.takeandgive(source);

        return result;

    }
}