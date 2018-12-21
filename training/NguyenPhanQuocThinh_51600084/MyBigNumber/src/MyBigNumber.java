import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * Tác Giả: Nguyễn Phan Quốc Thịnh
 * 
 */
public class MyBigNumber {
        /*example : 38 + 9
        Step 1: 8 cộng 9 bằng 17 nhớ 1
	 3 + 0 + nho = 4

	 return kết quả 41
        */    
    private IReceiver ireceiver;

    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }
    
    public String sum(String s_1, String s_2){
        // Khai Báo ở đây
        
        //Pattern xét kí tự còn \D trong class partern có ký tự là số từ 0 đến 9
        Pattern p = Pattern.compile("\\D");
        //Sau đó tạo ra matcher xét kí tự
        Matcher m = p.matcher(s_1);
        
        String result = "";
        String direction = "";  

        int length1 = s_1.length();// do dai chuoi thu 1
        int length2 = s_2.length();// do dai chuoi thu 2
        int nho = 0;// Khởi tạo số nhớ = 0 để khi cộng sẽ có vài trường hợp lớn hơn 9
        int pos1 = 0;// Vị trí chuỗi s1
        int pos2 = 0;// Vị trí chuỗi s2
        char c1;// kí tự c1 dùng để lấy kí tự cuối cùng của chuỗi s1
        char c2;// kí tự c2 dùng để lấy kí tự cuối cùng của chuỗi s2
        int tong = 0;// Khởi tạo biến tổng = 0 để cộng 2 kí tự cuối cùng lại với nhau
        int str_1 = s_1.length(); //lấy độ dài của số đầu tiên
        int str_2 = s_2.length(); //lấy độ dài của số 2
                
        String c;
        int id;
        
        // lay do dau lon nhat giua a va b
        int max = str_1;
        
        if(str_1 > str_2 ){
            max = str_1;
        }else{
            max = str_2;
        }
        
        if (m.find()) {
            c = m.group();
            id = m.start();
            if ("-".equals(c) && id == 0) {
                this.ireceiver.receive("Chương trình chưa hỗ trợ số âm cho học sinh lớp 3. "
                        + "Vui lòng nhập lại số A ");
                throw new NumberFormatException("Chương trình chưa hỗ trợ số âm cho học sinh lớp 3."
                        + " Vui lòng nhập lại số A "); 
                // Nếu người dùng nhập số âm thì pro thông báo cho
            }
            this.ireceiver.receive("Bạn đã nhập nhầm kí tự vào sô A. Vui lòng check lại.");
            throw new NumberFormatException("Bạn đã nhập nhầm kí tự vào sô A. Vui lòng check lại."); 
                // Nếu người dùng nhập chữ hoặc kí tự thì pro thông báo cho  
        }
        m = p.matcher(s_2);
        if (m.find()) {
            c = m.group();
            id = m.start();
            if ("-".equals(c) && id == 0) {
                this.ireceiver.receive("Chương trình chưa hỗ trợ số âm cho học sinh lớp 3."
                        + " Vui lòng nhập lại số B ");
                throw new NumberFormatException("Chương trình chưa hỗ trợ số âm cho học sinh lớp 3. "
                        + "Vui lòng nhập lại số B"); 
                // Nếu người dùng nhập số âm thì pro thông báo cho 
            }
            this.ireceiver.receive("Bạn đã nhập nhầm kí tự vào sô B. Vui lòng check lại.");
            throw new NumberFormatException("Bạn đã nhập nhầm kí tự vào sô B. Vui lòng check lại."); 
                // Nếu người dùng nhập chữ hoặc kí tự thì pro thông báo cho      
        }

        // Vòng lặp từ 0 đến max lần, cứ chạy tới khi nào nhớ hết số và hiển thị số nhớ
        
        for (int i = 0; i < max; i++) {
            pos1 = length1 - i - 1;
            // cập nhật lại vị trí chuỗi s1
            pos2 = length2 - i - 1;
            // cập nhật lại vị trí chuỗi s2
            c1 = (pos1 > -1) ? s_1.charAt(pos1) : '0';
            c2 = (pos2 >= 0) ? s_2.charAt(pos2) : '0';
            tong = (c1 - '0') + (c2 - '0') + nho;
            // chuyển kí tự thành số xong cộng cho số nhớ
            result = (tong % 10) + result;
            // Lấy kết quả tổng ở trên chia lấy dư cho 10 và ghép vào chuỗi kết quả
            nho = tong / 10;// Cập nhật lại số nhớ
            direction = " Bước " + (i + 1) + ":\n " + c1 + " + " + c2 + " = " + (tong - nho) + " + " + nho + " = "+ tong 
                    + " . Ta có " + tong % 10 + " nhớ " + nho + ".\n";
            this.ireceiver.receive(direction);
        }

        if (nho > 0) {
            result = 1 + result;
            // Nếu số nhớ còn dư thì ghép vào chuỗi kết quả
        }

        return result;
        // Trả về kết quả thu được
    }
}
    

