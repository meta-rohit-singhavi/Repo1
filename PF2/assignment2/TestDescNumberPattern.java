package assignment2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestDescNumberPattern{
	
	DescNumberPattern descNoPat=new DescNumberPattern();
	
	@Test
	public void testGetDescNumberPattern(){
		String expArray[]={"12345"," 1234","  123","   12","    1"};
		assertArrayEquals(expArray, descNoPat.getDescNumberPattern(5)); 
	}

	@Test
	public void testGetSpaces(){
		String expSpaces="  ";
		assertEquals(expSpaces, descNoPat.getSpaces(3));	
	}

	@Test
	public void testGetNumberSeries(){
		String expNoSeries="123";
		assertEquals(expNoSeries, descNoPat.getNumberSeries(5,3));	
	}	
}