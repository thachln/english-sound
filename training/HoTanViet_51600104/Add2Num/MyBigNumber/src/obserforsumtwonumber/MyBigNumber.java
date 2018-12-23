package obserforsumtwonumber;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MSSV: 51600104, Tên: Hồ Tấn Việt. Chú thích Class MyBigNumber dùng để thực
 * thi việc cộng 2 số. dưới dạng chuỗi Hàm sum trong Class MyBigNumber là hàm để
 * thực hiện phép cộng 2 chuỗi số.
 */
public class MyBigNumber {

    private IReceiver ireceiver;

    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }

    /**
     * Để thực hiện phép cộng, ta cần hai chuối chứa các kí số từ '0' đến '9'.
     * làm tham số nhập vào
     * <br/>
     *
     * @param s1 chuỗi số thứ nhất.
     * @param s2 chuỗi số thứ hai.
     * @return là tổng của hai số s1 và s2 cũng nằm dưới dạng chuỗi String.
     */
    public String sum(final String s1, final String s2) {
        // Bước Zero: Rất quan trọng, check null hoặc Empty của s1 và s2
        //Kiểm tra null
        if (s1 == null) {
            throw new NumberFormatException("Chuỗi s1 null error");
        }

        if (s1.isEmpty()) {
            throw new NumberFormatException("Chuỗi s1 rỗng");
        }

        if (s2 == null) {
            throw new NumberFormatException("Chuỗi s2 null error");

        }

        if (s2.isEmpty()) {
            throw new NumberFormatException("Chuỗi s2 rỗng");
        }

        // Bước I: Khai báo biến và xác định chuỗi lớn nhất cho biến max
        // Khai báo biến
        String replaceFirsts1 = s1.replaceFirst("^0+(?!$)", "");//loại bỏ số 0 ở đầu s1
        String replaceFirsts2 = s2.replaceFirst("^0+(?!$)", "");//loại bỏ số 0 ở đầu s2
        int max;// lưu chuỗi lớn nhất
        int rember = 0;// biến nhớ dành cho trường hợp lớn hơn 9
        int sumall = 0;// Biến dùng để lưu tổng 2 kí số và ghép vào result
        int lengths1 = replaceFirsts1.length();// lấy độ dài chuỗi 1
        int lengths2 = replaceFirsts2.length();// lấy độ dài chuỗi 2
        int posits1 = 0;// Vị trí chuỗi s1
        int posits2 = 0;// Vị trí chuỗi s2
        char cs1;// cs1 dùng để lưu kí tự ngay vị trí được chỉ định chuỗi s1
        char cs2;// cs1 dùng để lưu kí tự ngay vị trí được chỉ định chuỗi s2
        String result = "";//Biến lưu kết quả
        String msg = "";// Biến tham số cho hàm send

        Pattern ps1 = Pattern.compile("[^A-Za-z0-9]");
        final Matcher ms1 = ps1.matcher(s1);//Matcher kết hợp với pattern để tìm các kí tự đặc biệt chuỗi 1
        final Matcher ms11 = Pattern.compile("[a-zA-Z]+").matcher(s1);//tìm chữ 

        Pattern ps2 = Pattern.compile("[^A-Za-z0-9]");
        final Matcher ms2 = ps2.matcher(s2);//Matcher kết hợp với pattern để tìm các kí tự đặc biệt chuỗi 2
        final Matcher ms22 = Pattern.compile("[a-zA-Z]+").matcher(s2);//tìm chữ 

        //Xác định chuỗi lớn nhất cho biến max
        if (lengths1 > lengths2) {
            max = lengths1;
        } else {
            max = lengths2;
        }

        // Bước II: Thông báo lỗi
        // Kiểm tra từng kí tự của 2 chuỗi s1 và s2 có chữ không 
        if (ms11.find()) {
            // Nếu chuỗi s1 có chữ thì sẽ có NumberFormatException
            throw new NumberFormatException("Lưu ý: vị trí " + (ms11.start() + 1) + " trong chuỗi " + s1
                    + " không phải là số");
        }

        if (ms22.find()) {
            // Nếu chuỗi s1 có chữ thì sẽ có NumberFormatException
            throw new NumberFormatException("Lưu ý: vị trí " + (ms22.start() + 1) + " trong chuỗi " + s1
                    + " không phải là số");
        }

        // Kiểm tra số âm 
        if (s1.charAt(0) == '-') {
            throw new NumberFormatException("Phần mềm chưa hỗ trợ số âm s1: " + s1);
        }

        if (s2.charAt(0) == '-') {
            throw new NumberFormatException("Phần mềm chưa hỗ trợ số âm s2: " + s2);
        }

        //Kiểm tra kí tự đặc biệt
        if (ms1.find()) {
            throw new NumberFormatException("Vị trí " + (ms1.start() + 1) + " ở s1 là kí tự đặc biệt");
        }

        if (ms2.find()) {
            throw new NumberFormatException("Vị trí " + (ms2.start() + 1) + " ở s2 là kí tự đặc biệt");
        }

        //Bước III: Tính toán
        // Lặp từ 0 đến bé hơn max lần
        for (int i = 0; i < max; i++) {
            posits1 = lengths1 - i - 1;// cập nhật lại vị trí chuỗi s1
            posits2 = lengths2 - i - 1;// cập nhật lại vị trí chuỗi s2

            // Xét vị trí của 2 chuỗi xem có >= 0 hay không
            if (posits1 >= 0) {
                cs1 = replaceFirsts1.charAt(lengths1 - i - 1);
            } else {
                cs1 = '0';
            }

            if (posits2 >= 0) {
                cs2 = replaceFirsts2.charAt(lengths2 - i - 1);
            } else {
                cs2 = '0';
            }

            sumall = (cs1 - '0') + (cs2 - '0') + rember;// chuyển kí tự thành số xong cộng cho số nhớ
            result = (sumall % 10) + result;// Lấy kết quả tổng ở trên chia lấy dư cho 10 và ghép vào chuỗi kết quả
            rember = sumall / 10;// Cập nhật lại số nhớ

            msg = "Bước " + (i + 1) + ":" + cs1
                    + " + " + cs2 + " = "
                    + (sumall - rember) + " + "
                    + rember + " = " + sumall + " . Ghi "
                    + (sumall % 10) + " nhớ " + rember;
            this.ireceiver.send(msg);
        }

        if (rember > 0) {
            result = rember + result;// Nếu số nhớ còn dư thì ghép vào chuỗi kết quả
        }

        return result;// Trả về kết quả thu được
    }
}
