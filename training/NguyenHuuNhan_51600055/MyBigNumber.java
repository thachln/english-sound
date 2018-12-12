/**
 * TĂ¡c giáº£: Nguyá»…n Há»¯u NhĂ¢n. Description. Class MyBigNumber lĂ  lá»›p
 * Ä‘á»ƒ Cá»™ng 2 sá»‘ lá»›n báº±ng 2 chuá»—i. HĂ m sum trong Class MyBigNumber
 * lĂ  hĂ m Ä‘á»ƒ thá»±c hiá»‡n phĂ©p cá»™ng 2 chuá»—i sá»‘
 */

public class MyBigNumber {

	private IReceiver iReceiver;

	public MyBigNumber(IReceiver iReceiver) {
		this.iReceiver = iReceiver;
	}

	/**
	 * Ä?á»ƒ thá»±c hiá»‡n phĂ©p cá»™ng, ta cáº§n 2 chuá»—i lĂ m tham sá»‘ cho hĂ m
	 * sum trong Ä‘Ă³: 2 chuá»—i nĂ y Ä‘á»?u chá»‰ chá»©a cĂ¡c kĂ­ sá»‘ tá»« '0'
	 * Ä‘áº¿n '9'. <br/>
	 * 
	 * @param s1 chuá»—i sá»‘ thá»© nháº¥t.
	 * @param s2 chuá»—i sá»‘ thá»© hai.
	 * @return chuá»—i cĂ³ giĂ¡ trá»‹ lĂ  tá»•ng cá»§a hai sá»‘ s1 vĂ  s2.
	 */
	public String sum(String s1, String s2) {
		// Buoc 1: lay do dai 2 chuoi
		// Phan khai bao
		if (s1 == null || s1 == "") {
			s1 = "0";
		}

		if (s2 == null || s2 == "") {
			s2 = "0";
		}

		String result = "";
		String direction = "";
		int length1 = s1.length();// do dai chuoi thu 1
		int length2 = s2.length();// do dai chuoi thu 2
		int nho = 0;// Khá»Ÿi táº¡o sá»‘ nhá»› = 0 Ä‘á»ƒ khi cá»™ng sáº½ cĂ³ vĂ i trÆ°á»?ng há»£p
					// lá»›n hÆ¡n 9
		int pos1 = 0;// Vá»‹ trĂ­ chuá»—i s1
		int pos2 = 0;// Vá»‹ trĂ­ chuá»—i s2
		char c1;// kĂ­ tá»± c1 dĂ¹ng Ä‘á»ƒ láº¥y kĂ­ tá»± cuá»‘i cĂ¹ng cá»§a chuá»—i s1
		char c2;// kĂ­ tá»± c2 dĂ¹ng Ä‘á»ƒ láº¥y kĂ­ tá»± cuá»‘i cĂ¹ng cá»§a chuá»—i s2
		int tong = 0;// Khá»Ÿi táº¡o biáº¿n tá»•ng = 0 Ä‘á»ƒ cá»™ng 2 kĂ­ tá»± cuá»‘i cĂ¹ng láº¡i
						// vá»›i nhau

		// Láº·p tá»« 0 Ä‘áº¿n max láº§n
		for (int i = 0; i < ((length1 > length2) ? length1 : length2); i++) {
			pos1 = length1 - i - 1;// cáº­p nháº­t láº¡i vá»‹ trĂ­ chuá»—i s1
			pos2 = length2 - i - 1;// cáº­p nháº­t láº¡i vá»‹ trĂ­ chuá»—i s2

			// XĂ©t vá»‹ trĂ­ cá»§a 2 chuá»—i xem cĂ³ >= 0 hay khĂ´ng

			c1 = (pos1 > -1) ? s1.charAt(pos1) : '0';

			c2 = (pos2 >= 0) ? s2.charAt(pos2) : '0';
			
			if (Character.isLetter(c1) || Character.isLetter(c2)) {
                throw new NumberFormatException();// Nếu có chữ hoặc kí tự thì sẽ có NumberFormatException
            }
            
			tong = (c1 - '0') + (c2 - '0') + nho;// chuyá»ƒn kĂ­ tá»± thĂ nh sá»‘ xong cá»™ng cho sá»‘ nhá»›
			result = (tong % 10) + result;// Láº¥y káº¿t quáº£ tá»•ng á»Ÿ trĂªn chia láº¥y dÆ° cho 10 vĂ  ghĂ©p vĂ o
											// chuá»—i káº¿t quáº£
			nho = tong / 10;// Cáº­p nháº­t láº¡i sá»‘ nhá»›
			direction = "Buoc " + (i + 1) + ":\n" + c1 + " + " + c2 + " = " + (tong - nho) + " + " + nho + " = " + tong + " . Viet " + tong % 10 + " nho " + nho + ".\n";
			iReceiver.receive(direction);
			direction = "";
		}

		if (nho > 0) {
			result = 1 + result;// Náº¿u sá»‘ nhá»› cĂ²n dÆ° thĂ¬ ghĂ©p vĂ o chuá»—i káº¿t quáº£
		}

		return result;// Tráº£ vá»? káº¿t quáº£ thu Ä‘Æ°á»£c
	}
}
