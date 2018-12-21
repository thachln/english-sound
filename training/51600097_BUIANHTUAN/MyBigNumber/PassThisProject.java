/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PassThisProject implements GetData{
    public static void main(String[] args){
        //TestVer_1();
        //TestVer_2();
        //TestVer_3();
        TestVer_4();
        //TestVer_5();
    }
    public static void TestVer_1(){//Trường hợp đầu tiên chúng ta làm 1 phép tính với a b có độ dài bằng nhau.
        PassThisProject test_1 = new PassThisProject();
        myBigNumber mybignumber = new myBigNumber(test_1);
        String sum = mybignumber.sum("","423");
       
    }
    
    public static void TestVer_2(){//Trường hợp thứ hai chúng ta làm 1 phép tính với a b trong đó a có độ dài lớn hơn b.
        PassThisProject test_2 = new PassThisProject();
        myBigNumber mybignumber = new myBigNumber(test_2);
        String sum = mybignumber.sum("1239","423");
       
    }
    
    public static void TestVer_3(){//Trường hợp thứ ba chúng ta làm 1 phép tính với a b trong đó b có độ dài lớn hơn a.
        PassThisProject test_2 = new PassThisProject();
        myBigNumber mybignumber = new myBigNumber(test_2);
        String sum = mybignumber.sum("12","4236");
       
    }
    
    public static void TestVer_4(){//Trường hợp thứ tư chúng ta làm 1 phép tính với a b trong đó a có 1 kí tự đặc biệt.
        PassThisProject test_2 = new PassThisProject();
        myBigNumber mybignumber = new myBigNumber(test_2);
        String sum = mybignumber.sum("123z9","423");
       
    }
    
    public static void TestVer_5(){//Trường hợp thứ năm chúng ta làm 1 phép tính với a b trong đó a có độ dài lớn hơn b.
        PassThisProject test_2 = new PassThisProject();
        myBigNumber mybignumber = new myBigNumber(test_2);
        String sum = mybignumber.sum("1239","423");
       
    }
    
    public void takeandgive( String data) {
        //TODO Auto-generated method stub
        System.out.println("case :" + data);
    }
}
