/* 
    *Đây là interface cho phép người dùng thấy được từng bước đi của bài toán;
    *Code được tham khảo từ bạn Nguyễn Tiến Dũng, Võ Đăng Phước.
    *Mỗi khi có một lớp nào kế thừa từ lớp này đều phải có hàm take của IReceiver.
    *Code bắt đầu từ 10:27 19/21/2018.
*/
public interface GetData {
    
    
    abstract void takeandgive(String data); //* lấy số dư và lưu lại những bước đi;
            
    
}
