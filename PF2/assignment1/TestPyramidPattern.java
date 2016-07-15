package assignment1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestPyramidPattern{
	
	PyramidPattern pyPat=new PyramidPattern();
	
	@Test
	public void testGetPyramidPattern(){
		String expArray[]={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		assertArrayEquals(expArray, pyPat.getPyramidPattern(5));		
	}
	
	
	@Test
	public void testGetSpaces(){
		String expString="    ";
		assertEquals(expString, pyPat.getSpaces(5, 1));	
	}
	
	
	@Test
	public void testGetNumberSeries(){
		String expSeries="12321";
		assertEquals(expSeries, pyPat.getNumberSeries(3));
	}
	
}
