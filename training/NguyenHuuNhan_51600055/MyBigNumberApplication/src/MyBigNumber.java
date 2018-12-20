
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Tác giả: Nguyễn Hữu Nhân. Credit : Nguyễn Châu Thảo Quân Dessription. Class
 * MyBigNumber là lớp để Cộng 2 số lớn bằng 2 chuỗi. Hàm sum trong Class
 * MyBigNumber là hàm để thực hiện phép cộng 2 chuỗi số
 */
public class MyBigNumber {

    private IReceiver ireceiver;

    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }

    /**
     * Để thực hiện phép cộng, ta cần 2 chuỗi làm tham số cho hàm sum trong đó:
     * 2 chuỗi này đều chỉ chứa các kí số từ '0' đến '9'.
     * <br/>
     *
     * @param s1 chuỗi số thứ nhất.
     * @param s2 chuỗi số thứ hai.
     * @return chuỗi có giá trị là tổng của hai số s1 và s2.
     */
    public String sum(final String s1, final String s2) {
        // Buoc 1: lay do dai 2 chuoi
        // Phan khai bao

        Pattern p = Pattern.compile("\\D");
        Matcher m = p.matcher(s1);
        String c;
        int idx;
        String result = "";
        String direction = "";
        int length1 = s1.length();// do dai chuoi thu 1
        int length2 = s2.length();// do dai chuoi thu 2
        int nho = 0;// Khởi tạo số nhớ = 0 để khi cộng sẽ có vài trường hợp lớn hơn 9
        int c1;// kí tự c1 dùng để lấy kí tự cuối cùng của chuỗi s1
        int c2;// kí tự c2 dùng để lấy kí tự cuối cùng của chuỗi s2
        int tong = 0;// Khởi tạo biến tổng = 0 để cộng 2 kí tự cuối cùng lại với nhau
        int getUnit = 0;// variable get The number per unit
        int i = 0;

        if (m.find()) {
            c = m.group();
            idx = m.start();

            if ("-".equals(c) && idx == 0) {
                this.ireceiver.receive("NumberFormatException(\"Chua ho tro so am s1: "
                        + s1 + "\")");
                throw new NumberFormatException("\"Chua ho tro so am s1: "
                        + s1 + "\""); // Nếu có chữ hoặc kí tự thì sẽ có NumberFormatException  
            }
            this.ireceiver.receive("NumberFormatException(\"Loi o tham so s1 tai vi tri "
                    + idx + ": " + c + "\")");
            throw new NumberFormatException("\"Loi o tham so s1 tai vi tri "
                    + idx + ": " + c + "\""); // Nếu có chữ hoặc kí tự thì sẽ có NumberFormatException   
        }
        m = p.matcher(s2);
        if (m.find()) {
            c = m.group();
            idx = m.start();
            if ("-".equals(c) && idx == 0) {
                this.ireceiver.receive("NumberFormatException(\"Chua ho tro so am s2: "
                        + s2 + "\")");
                throw new NumberFormatException("\"Chua ho tro so am s2: "
                        + s2 + "\""); // Nếu có chữ hoặc kí tự thì sẽ có NumberFormatException  
            }
            this.ireceiver.receive("NumberFormatException(\"Loi o tham so s2 tai vi tri "
                    + idx + ": " + c + "\")");
            throw new NumberFormatException("\"Loi o tham so s2 tai vi tri "
                    + idx + ": " + c + "\""); // Nếu có chữ hoặc kí tự thì sẽ có NumberFormatException      
        }

        // Lặp từ 0 đến max lần
        for (i = 0; i < (length1 < length2 ? length2 : length1); i++) {

            // XĂ©t vá»‹ trĂ­ cá»§a 2 chuá»—i xem cĂ³ >= 0 hay khĂ´ng
            c1 = i < length1 ? (s1.charAt(length1 - i - 1) - '0') : 0;

            c2 = i < length2 ? (s2.charAt(length2 - i - 1) - '0') : 0;

            tong = c1 + c2 + nho;// chuyển kí tự thành số xong cộng cho số nhớ
            getUnit = tong % 10;

            if (nho == 0) {
                direction += "\n" + "Buoc " + (i + 1) + ": "
                        + "Lay " + c1
                        + " + " + c2
                        + " = " + tong + ""
                        + ". Viet " + getUnit
                        + " nho " + tong / 10 + "\n";
            } else {
                direction += "\n" + "Buoc " + (i + 1) + ": "
                        + "lay " + c1
                        + " + " + c2
                        + " = " + (c1 + c2)
                        + " + " + nho
                        + " = " + tong
                        + ". Viet " + getUnit
                        + " nho " + nho + "\n";
            }

            nho = tong / 10;// Cập nhật lại số nhớ
            result = getUnit + result;
        }
        if (nho > 0) {
            result = nho + result;
            direction += "\n" + "Buoc " + (i + 1) + ": "
                    + "lay " + 0
                    + " + " + 0
                    + " nho " + 1
                    + " = " + 1
                    + ". Viet " + 1
                    + "\n";
        }

        this.ireceiver.receive(direction);

        return result;// Trả về kết quả thu được
    }
}
