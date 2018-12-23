/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserforsumtwonumber;
/**
 * @author 51600104.
 * Chú thích.
 * Trong IReceiver interface có hàm send đại diện để in bước cộng số, sẽ được
 * Override trong file MyBigNumber.java và  MyBigNumberGUI.java
 * Hàm send chứa chuỗi cần in
 */
public interface IReceiver {

    /*
     * Để thực hiện việc in từng bước cộng 2 chuỗi
     *Hàm send phải được gọi để lưu trữ chuỗi
     */

    public abstract void send(String msg);
}
