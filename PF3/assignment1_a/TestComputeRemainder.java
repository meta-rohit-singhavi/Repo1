package assignment1_a;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestComputeRemainder {
	
	@Test
	public void testGetRemainder(){
		
		ComputeRemainder compRem=new ComputeRemainder();
		
		assertEquals(0, compRem.getRemainder(2, 1));
		assertEquals(0, compRem.getRemainder(2, 0));
		assertEquals(1, compRem.getRemainder(100, 3));
	}

}
