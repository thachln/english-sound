/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserforsum2number;

/**
 *
 * @author 51600104
 */
abstract class Observer {

    protected Subject subject;
    //chi can mot subject, moi lan obersever add la mot phuong thuc khac
    //dau tien dat cho ngoi
    //sau do set vi tri, chinh la gia tri state, muon nhan vao bao nhieu gia tri 
    //thi lay bao nhieu bien

    public abstract void update();
    public abstract void send(int step, int s1, int s2, String stack);
    
}
