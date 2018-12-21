/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserforsumtwonumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Reference: https://github.com/NQCuong/Sum2String/blob/master/source/test/MyBigNumberTest.java
 * @author 51600104
 */
public class MyBigNumberTest {
    
    public MyBigNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testsolution1() {
        System.out.println("\n#Testcase 1:");
        String s1 = "L";
        String s2 = "0";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        //assertEquals(expResult, result);
    }
    
     /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testsolution2() {
        System.out.println("\n#Testcase 2:");
        String s1 = "0";
        String s2 = "P";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        //assertEquals(expResult, result);
    }
    
    
     @Test (expected = NumberFormatException.class)
    public void testsolution3() {
        System.out.println("\n#Testcase 3:");
        String s1 = "H";
        String s2 = "G";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        //assertEquals(expResult, result);
    }
    
     @Test (expected = NumberFormatException.class)
    public void testsolution4() {
        System.out.println("\n#Testcase 4:");
        String s1 = "99.";
        String s2 = "99";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        //assertEquals(expResult, result);
    }
    
     @Test (expected = NumberFormatException.class)
    public void testsolution5() {
        System.out.println("\n#Testcase 5:");
        String s1 = "99";
        String s2 = ".99";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        //assertEquals(expResult, result);
    }

   
    @Test (expected = NumberFormatException.class)
    public void testsolution6() {
        System.out.println("\n#Testcase 6:");
        String s1 = "100.";
        String s2 = "?100";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        //assertEquals(expResult, result);
    }
   
    
     @Test (expected = NumberFormatException.class)
    public void testsolution7() {
        System.out.println("\n#Testcase 7:");
        String s1 = "-456";
        String s2 = "456";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        //assertEquals(expResult, result);
    }
    
     @Test (expected = NumberFormatException.class)
    public void testsolution8() {
        System.out.println("\n#Testcase 8:");
        String s1 = "456";
        String s2 = "-789";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        //assertEquals(expResult, result);
    }
    
     @Test (expected = NumberFormatException.class)
    public void testsolution9() {
        System.out.println("\n#Testcase 9:");
        String s1 = "-234";
        String s2 = "-234";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        //assertEquals(expResult, result);
    }
    
     @Test 
    public void testsolution10() {
        System.out.println("\n#Testcase 10:");
        String s1 = "0111";
        String s2 = "111";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "222";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        assertEquals(expResult, result);
    }
    
     @Test 
    public void testsolution11() {
        System.out.println("\n#Testcase 11:");
        String s1 = "222";
        String s2 = "0222";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "444";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        assertEquals(expResult, result);
    }
    
    
     @Test 
    public void testsolution12() {
        System.out.println("\n#Testcase 12:");
        String s1 = "0894";
        String s2 = "0345";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "1239";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        assertEquals(expResult, result);
    }
    
    
     @Test 
    public void testsolution13() {
        System.out.println("\n#Testcase 13:");
        String s1 = "0";
        String s2 = "777";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "777";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        assertEquals(expResult, result);
    }
    
    
     @Test 
    public void testsolution14() {
        System.out.println("\n#Testcase 14:");
        String s1 = "888";
        String s2 = "0";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "888";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        assertEquals(expResult, result);
    }
    
    
     @Test 
    public void testsolution15() {
        System.out.println("\n#Testcase 15:");
        String s1 = "555";
        String s2 = "333";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "888";
        String result = instance.sum(s1, s2);
        System.out.println(s1 + " + " + s2 + " = " + result);
        assertEquals(expResult, result);
    }
    
}
