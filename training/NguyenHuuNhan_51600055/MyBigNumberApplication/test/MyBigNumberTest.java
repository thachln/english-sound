/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class MyBigNumberTest implements IReceiver {

    public MyBigNumberTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test
    public void testSum_N_1() {
        MyBigNumber mb = new MyBigNumber(this);
        String sum = mb.sum("1", "2");

        assertEquals("3", sum);

        String s = mb.sum("8", "2");

        assertEquals("10", s);
    }

    @Test
    public void testSum_N_2() {
        MyBigNumber mb = new MyBigNumber(this);
        String sum = mb.sum("123", "9");

        assertEquals("132", sum);
    }

    @Test
    public void testSum_N_3() {
        MyBigNumber mb = new MyBigNumber(this);
        String sum = mb.sum("111111111111111111111111111111", "222222222222222222222222222222");

        assertEquals("333333333333333333333333333333", sum);
    }
    
    @Test(expected = NumberFormatException.class)
    public void testSum_N_4() {
        MyBigNumber mb = new MyBigNumber(this);
        String sum = mb.sum("asd", "asd");
    }

    @Override
    public void receive(String msg) {
        
    }

}
