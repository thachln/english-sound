/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class myBigNumberTest implements GetData{
    
    public myBigNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class myBigNumber.
     */
    @Test
    public void testSum1() {
        System.out.println("Test_sum1 : ");
        String s1 = "123";
        String s2 = "456";
        System.out.println("Ta có a = " + s1);
        System.out.println("Ta có b = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
    }
    
    @Test (expected = NumberFormatException.class)
    public void testSum2() {
        System.out.println("Test_sum2 : ");
        String s1 = "-123";
        String s2 = "456";
        System.out.println("Ta có a = " + s1);
        System.out.println("Ta có b = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
    }
    
    @Test (expected = NumberFormatException.class)
    public void testSum3() {
        System.out.println("Test_sum3 : ");
        String s1 = "";
        String s2 = "456";
        System.out.println("Ta có a = " + s1);
        System.out.println("Ta có b = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
    }
    
    @Test (expected = NumberFormatException.class)
    public void testSum4() {
        System.out.println("Test_sum4 : ");
        String s1 = null;
        String s2 = "456";
        System.out.println("Ta có a = " + s1);
        System.out.println("Ta có b = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
    }
    
    @Test (expected = NumberFormatException.class)
    public void testSum5() {
        System.out.println("Test_sum5 : ");
        String s1 = null;
        String s2 = "0";
        System.out.println("Ta có a = " + s1);
        System.out.println("Ta có b = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
    }
    
    @Test (expected = NumberFormatException.class)
    public void testSum6() {
        System.out.println("Test_sum6 : ");
        String s1 = "123as";
        String s2 = "456";
        System.out.println("Ta có a = " + s1);
        System.out.println("Ta có b = " + s2);
        MyBigNumber instance = new MyBigNumber(this);
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
    }
    
    public void takeandgive(String msg) {
         System.out.println(msg);
    }
}
