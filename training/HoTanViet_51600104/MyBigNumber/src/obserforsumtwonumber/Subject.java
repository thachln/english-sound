/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserforsumtwonumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author 51600104
 */
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String String1;
    private String String2;
    

    public void add(Observer o) {
        observers.add(o);
    }
    //dat cho ngoi, khong dung vao

    public String getString1() {
        return String1;
    }
    
    public String getString2() {
        return String2;
    }
    //xac dinh vi tri

    public void setState(String value1, String value2) {
        this.String1 = value1;
        this.String2 = value2;
        execute();
    }
    //thuc hien luon hanh dong ngoi xuong

    private void execute() {
        for (Observer observer : observers) {
            observer.update();
            
        }
    }
}