public class MyBigNumber{
    
        private GetData getData;
        
        public MyBigNumber(GetData getData){
            this.getData = getData;
        }
    
    
    
        public String sum(String s_1,String s_2){
            /* 
                *Phần mềm có cơ chế hoạt động rất đơn giản.
                *Do được khách hàng yêu cầu làm ra dành riêng cho học sinh lớp 3.
                *Giúp cho các em có thể sử dụng phần mềm để tính phép toán cộng 2 số.
                *Cấu trúc bắt đầu từ 2 chuỗi a và b có độ dài bất kì.
                *Phần mềm gồm 3 chức năng chính là tính, làm lại, và cộng thêm số.
                *Các trường hợp xuất hiện lỗi là khi các em học sinh nhập số có lẫn các kí tự ko phải từ [0-9]. 
                *Phần mềm sẽ thông báo ra lỗi của các em và yêu cầu các em phải nhập lại số mới.
                       
            */
            String message;
            String result = "";//*Đây là biến lưu kết quả cuối cùng sau khi chạy xong.
            String source = "";// * Tham số này sẽ được sử dụng cuối cùng để lưu các bước tính toán và gửi về interface GetData;
            int str_1 = s_1.length(); //* Sẽ lấy độ dài của tham số thứ nhất.
            int str_2 = s_2.length(); //* Sẽ lấy độ dài của tham số thứ hai.
            int max = str_1; //*Giả sử độ dài tối da là str_1;
            if(str_1 > str_2){ // *so sánh sau đó lấy dộ dài chuỗi dài nhất.
                max = str_1;
            }
            else{
                max = str_2;
            }
            int num_1;
            int num_2;
            char digit_1;//*lấy giá trị tại vị trí num_1 cùa chuỗi s_1;
            char digit_2;//*lấy giá trị tại vị trí num_2 cùa chuỗi s_2;
            int temp = 0; //*để lưu số dư;
            int a;
            int b;
            int first ;//* Tạm gọi là tổng của a+b
            int second; //*Tạm gọi là tổng của a+b ko lấy dư
            String pattern = "\\d+"; //* Giúp kiểm tra xem chuỗi có khác các số từ[0-9] hay không.
            if("".equals(s_1)){
                s_1="0";
                str_1= s_1.length();
            }
            if("".equals(s_2)){
                s_2="0";
                str_2=s_2.length();
            }
            if(s_1.charAt(0)== '-'){
                this.getData.takeandgive("NumberFormatException(\"Không hỗ trợ số âm: "+s_1);
                throw new NumberFormatException("Em hãy nhập lại số đầu tiên đi nào (^_^) " +s_1);
            }
            if(s_2.charAt(0)== '-'){
                this.getData.takeandgive("NumberFormatException(\"Không hỗ trợ số âm: "+s_2);
                throw new NumberFormatException("Em hãy nhập lại số thứ hai đi nào (^_^) "+s_2);
            }
            boolean p1 = s_1.matches(pattern);//*lưu giá trị của s_1.
            boolean p2 = s_2.matches(pattern);//*lưu giá trị của s_2.
            if (!p1){
                this.getData.takeandgive("NumberFormatException(\"Ôi không số em đã nhập sai số đầu tiên rồi: "+s_1);
                throw new NumberFormatException("Em hãy nhập lại số đầu tiên đi nào (^_^) " +s_1);
            }
            if (!p2){           
                this.getData.takeandgive("NumberFormatException(\"Ôi không số em đã nhập sai số thứ hai rồi: "+s_2);
                throw new NumberFormatException("Em hãy nhập lại số thứ hai đi nào (^_^) "+s_2);
            }
            
            
            //*Thực hiện phép tính
            for(int i = 0 ; i< max;++i){
                num_1 = str_1 - i - 1;// lấy chỉ số của chuỗi 1 tại vị trí num_1;
                num_2 = str_2 - i - 1;// lấy chỉ số của chuỗi 2 tại vị trí num_2;
                
                if(num_1>=0){
                    digit_1 = s_1.charAt(num_1); // gắn digit_1 bằng trị số kí tự hiện tại của s_1;
                }
                else{ 
                    digit_1 = '0';
                }
                if(num_2>=0){
                    digit_2 = s_2.charAt(num_2); // gắn digit_2 bằng trị số kí tự hiện tại của s_2;
                }
                else {
                    digit_2 = '0';
                }
                
                a = digit_1 - '0'; //* bước này ta lấy được số a bằng cách lấy kí tự số [0-9] vừa lấy trừ cho kí tự [0] ta sẽ được số tương ứng;
                b = digit_2 - '0'; //* bước này ta lấy được số b bằng cách lấy kí tự số [0-9] vừa lấy trừ cho kí tự [0] ta sẽ được số tương ứng;
                
                first = a + b +temp; // lấy số a + số b + thêm với số dư nếu có;
                second = a + b;
                result = (first %10) + result;
                temp = first/10;
                
                if(i==0){
                    message = "Bước đầu tiên các em được " + a +" + "+b+" = " +second+" và nhớ  "+temp+"\n";
                }
                else{
                    message = "Bước kế tiếp các em được " + a +" + "+ b+" = " +second+" và nhớ  "+temp+"\n";
                }
                
                source = source + message;
            }
            if(temp>0){
                result = temp +result;
            }
            source = "\n" + s_1 +" + " +s_2 +" = "+ result +"\n"+ "Process implementation : \n" + source;
            this.getData.takeandgive(source);
            
            
            return result;
    
    }
        
}
