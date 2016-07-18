package assignment1_c;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestLargestDigitInInteger {
	
	@Test
	public void testLargestDigit(){
		LargestDigitInInteger largeDigit=new LargestDigitInInteger();
		
		assertEquals(2, largeDigit.largestDigit(2));
		assertEquals(9, largeDigit.largestDigit(1257369));
		assertEquals(4, largeDigit.largestDigit(444));
		assertEquals(-1, largeDigit.largestDigit(-5425));
	}
}
