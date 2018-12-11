package myjava.mybignumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBigNumberTest {
	IReceiver IReceiver;
	@Test
	void testSum_N_1() {
		MyBigNumber myBigNumber = new MyBigNumber(IReceiver);
		String kq = myBigNumber.sum("1234", "4321");
		assertEquals("5555", kq);
	}
	
	@Test
	void testSum_N_2() {
		MyBigNumber myBigNumber = new MyBigNumber(IReceiver);
		String kq = myBigNumber.sum("1239", "4322");
		assertEquals("5561", kq);
	}
	
	@Test
	void testSum_N_3() {
		
		MyBigNumber myBigNumber = new MyBigNumber(IReceiver);
		String kq = myBigNumber.sum(null, null);
		assertEquals("0", kq);
	}

}
