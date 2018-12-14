vui lòng tải file MyBigNumberApplication.jar trong thư mục "dist" và sử dụng như bình thường

CÁCH SỬ DỤNG

Bước 1 : Nhập số đầu tiên vào ô kế bên "Số A"
Bước 2 : Nhập số thứ hai vào ô kế bên "Số B"
Bước 3 : Bấm nút "Thực hiện"
Kết quả sẽ hiện ra bên dưới , bao gồm các bước thực hiện , từ phải qua trái , theo cách hiểu của một học sinh lớp 3

Một số lỗi có thể gặp phải: 

1. "NumberFormatException('Loi o tham so (s1 hoặc s2) tai vi tri n: x')"
lỗi này xuất hiện khi một trong hai số nhập vào có 1 kí tự không phải chữ số , ngoại trừ dấu "-"
ví dụ : 
với Số A = 123s và Số B = 123 sẽ cho ra lỗi : "NumberFormatException('Loi o tham so s1 tai vi tri 3: s')"

2. "NumberFormatException("Chua ho tro so am s1(s2) : s1(s2)")
lỗi này xuất hiện khi một trong hai số nhập vào là số âm
ví dụ :
với Số A = 1231 và Số B = -546 sẽ cho ra lỗi : "NumberFormatException('Chua ho tro so am s2: -546')"

Trong trường hợp số nhập vào vừa chứa dấu - , vừa chứa kí tự không phải chữ số , chương trình sẽ ưu tiên xuất lỗi thứ 2
ví dụ : 
với Số A = -123s và Số B = 2311 sẽ cho ra lỗi : "NumberFormatException('Chua ho tro so am s1: -123s')"

Trong trường hợp 2 số vừa nhập đều thuộc các lỗi trên , chương trình sẽ ưu tiên xuất lỗi cho tham số thứ 1
ví dụ :
với Số A = -123s và Số B = -153 thì sẽ cho ra lỗi : "NumberFormatException('Chua ho tro so am s1: -123s')"

Để làm mới , bấm nút "Làm mới" và tất cả mọi thứ sẽ biến mất , đến nỗi một học sinh lớp 3 cũng không biết tại sao ...