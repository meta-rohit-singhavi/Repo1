package assignment1_b;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestComputeGCD {

	@Test
	public void testGetGCD(){
		
		ComputeGCD compGCD=new ComputeGCD();
		
		assertEquals(1, compGCD.getGCD(2, 1));
		assertEquals(6, compGCD.getGCD(12, 18));
		assertEquals(1, compGCD.getGCD(100, 3));
		assertEquals(-1, compGCD.getGCD(-54, 7));
	}
	
}
