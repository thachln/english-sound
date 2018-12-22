

======================================

# CNPM
========================
BUILD OUTPUT DESCRIPTION
========================
## Trong file CoverrageTest có chứa hình ảnh sau khi đã chạy testcase và TestCoverage.
========================
Giới thiệu về phần mềm
----------------------
    - Phần mềm cộng 2 số, trong đó 2 số nhập vào dưới dạng là chuỗi (String)
	- Phần mềm được thiết kế theo mô hình Design Pattern - Observer Pattern ( Đảm bảo được sự thay đổi của khách hàng trong những lúc cần thiết )
	- Có thể gặp vấn đề về code sạch (do trang myworkspace.vn/java bị lỗi nên không thể test code được, hình ảnh lỗi được lưu trong file Prove)
	- Phần mềm đã được đóng gói và dễ dàng sử dụng nó.
	- Người dùng có thể chạy file MyBigNumberTest.java để xem các testcase về phần mềm.
========================

======================================
Hướng dẫn sử dụng ứng dụng cộng hai số
--------------------------------------

1. Tải file Release.rar về máy theo đường dẫn:https://drive.google.com/file/d/1CoudgIIbEfftnYf5flXjIUGOu_n5XV2m/view?usp=sharing
2. Quy trình cài đặt phần mềm cho khách hàng
 - B1: copy file Release.rar vào bất kì ổ đĩa nào trên máy khách hàng mà khách hàng mong muốn ở đây mình mặc định là cài ở ổ đĩa D
 - B2: Giải nén phần mềm.
 - B3: Nếu là cài ở đĩa D(và không nằm trong folder nào khác) thì hãy thêm đường dẫn D:\Sum vào biến môi trường path
 - B4: Mở cmd và gõ dòng lệnh ( trong dấu ngoặc ) theo thứ tự sau ( D: ) -> ( cd Sum ) -> ( java -jar MyBigNumber.jar ) 
 - B5: Bắt đầu thử nghiệm phần mềm cộng 2 số thôi nào!
 ***
 Nếu như là muốn cài phần mềm ở ổ đĩa khác không phải là ở đĩa D hay trong folder nào đó thì hãy làm theo các bước sau đây:
 - B1: copy file Release.rar vào ổ đĩa mà khách hàng mong muốn (Ví dụ: E:/NewFile)
 - B2: Giải nén file Release.rar
 - B3: Dùng lệnh cd đã hướng dẫn ở trên để truy cập vào từng file cho đến khi tới file Sum: ( E: ) -> ( cd NewFile ) -> ( cd Release ).
 - B4: Tham khảo lệnh cmd trên đây: https://www.wikihow.vn/Thay-%C4%91%E1%BB%95i-Th%C6%B0-m%E1%BB%A5c-trong-Command-Prompt
 - B5: Mở cmd và tiến hành chạy chương trình.
 ***
3. Cách sử dụng phần mềm
 - B1: Nhập số thứ nhất rồi Enter
 - B2: Nhập số thứ hai rồi Enter
 - B3: Enter lần nữa để tiến hành chạy chướng trình và các bước hướng dẫn in ra nằm phía dưới của app.
 - B4:  Muốn sử dụng tiếp thì quay lại bước 1.
4. **Các lỗi thường gặp phải khi sử dụng phần mềm và phải tránh các trường hợp sau đây**<br/>
            1 (Chuỗi 1 chứa kí tự chữ, chuỗi 2 thỏa điều kiện)<br/>
            2 (Chuỗi 1 thỏa điều kiện, chuỗi 2 chứa kí tự chữ)<br/>
            3 (Chuỗi 1 và chuỗi 2 chứa kí tự chữ)<br/>
            4 (Chuỗi 1 chứa kí tự đặc biệt, chuỗi 2 thỏa điều kiện)<br/>
            5 (Chuỗi 1 thỏa điều kiện, chuỗi 2 chứa kí tự đặc biệt)<br/>
            6 (Chuỗi 1 và chuỗi 2 chứa kí tự đặc biệt)<br/>
            7 (Chuỗi 1 là số âm, chuỗi 2 thỏa điều kiện)<br/>
            8 (Chuỗi 1 thỏa điều kiện, chuỗi 2 là số âm)<br/>
            9 (Chuỗi 1 và chuỗi 2 là số âm)<br/>
	   10 (Chuỗi 1 rỗng, chuỗi 2 thỏa điều kiện)<br/>
           11 (Chuỗi 2 rỗng, chuỗi 1 thỏa điều kiện)<br/>
           12 (Chuỗi 1 null, chuỗi 2 thỏa điều kiện)<br/>
           13 (Chuỗi 2 null, chuỗi 1 thỏa điều kiện)<br/>
           14 (Chuỗi 2 rỗng và chuỗi 1 thỏa điều kiện)<br/>
           15 (Chuỗi 1 dư ký số '0' ở đầu)<br/>
           16 (Chuỗi 2 dư ký số '0' ở đầu)<br/>
           17 (Chuỗi 1 và chuỗi 2 dư ký số '0' ở đầu)<br/>
           18 (Chuỗi 1 và chuỗi 2 thỏa điều kiện)<br/>
           19 (Chuỗi 1 và chuỗi 2 thỏa điều kiện)<br/>

**Kết quả mong đợi**:<br/> 
            1 Thông báo lỗi NumberFormatException<br/>
            2 Thông báo lỗi NumberFormatException<br/>
            3 Thông báo lỗi NumberFormatException<br/>
            4 Thông báo lỗi NumberFormatException<br/>
            5Thông báo lỗi NumberFormatException<br/>
            6 Thông báo lỗi NumberFormatException<br/>
            7 Thông báo lỗi NumberFormatException<br/>
            8 Thông báo lỗi NumberFormatException<br/>
            9 Thông báo lỗi NumberFormatException<br/>
	   10 Thông báo lỗi NumberFormatException<br/>
           11 Thông báo lỗi NumberFormatException<br/>
           12 Thông báo lỗi NumberFormatException<br/>
           13 Thông báo lỗi NumberFormatException<br/>
           14 Chuỗi kết quả đúng và không dư ký số '0'<br/>
           15 Chuỗi kết quả đúng và không dư ký số '0'<br/>
           16 Chuỗi kết quả đúng và không dư ký số '0'<br/>
           17 Kết quả đúng<br/>
           18 Kết quả đúng<br/>
           19 Kết quả đúng<br/>
**Tình trạng**:<br/>
            1 Hoàn thành tốt<br/>
            2 Hoàn thành tốt<br/>
            3 Hoàn thành tốt<br/>
            4 Hoàn thành tốt<br/>
            5Hoàn thành tốt<br/>
            6 Hoàn thành tốt<br/>
            7 Hoàn thành tốt<br/>
            8 Hoàn thành tốt<br/>
            9 Hoàn thành tốt<br/>
           10 Hoàn thành tốt<br/>
           11 Hoàn thành tốt'<br/>
           12 Hoàn thành tốt'<br/>
           13 Hoàn thành tốt<br/>
           14 Hoàn thành tốt<br/>
           15 Hoàn thành tốt<br/>
           16 Hoàn thành tốt'<br/>
           17 Hoàn thành tốt<br/>
           18 Hoàn thành tốt<br/>
           19 Hoàn thành tốt<br/>

======================================

========================================================
Hướng dẫn chạy file MyBigNumberTest.java để xem testcase
--------------------------------------------------------

1. Tải file MyBigNumber.rar theo đường dẫn: 
https://drive.google.com/file/d/1LIRjuRNBG5xIhqL1LJdDOH6st1xFV-_h/view?usp=sharing

2. Mở netBean lên sau đó làm các theo các bước sau:

**( Lưu ý sử dụng : NetBeans IDE 8.2 )**

 - B1: Giải nén file MyBigNumber.rar
 - B2: Trong giap diện của netBeans tìm trên thanh công cụ phía trên góc bên trái và Nhấn File -> Open Projects... 
 - B3: Hộp thoại sẽ mở và chọn file project MyBigNumber sau khi đã giải nén.
 - B4: Projects sẽ được build và hiển thị ra và trong Test packages nhấp vào package obserforsumtwonumber.
 - B5: Nhấn chuột phải và file MyBigNumberTest.java chọn Run File.

========================================================



======================================
CONFIRM BY MY SELF
--------------------



