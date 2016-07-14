package ass3;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


public class TestLongestSeq 
{

	@Test
	public void testLongestSequence()
	{
		LongestSeq ls=new LongestSeq();
		
		int actual1[]={1,2,3,5,6,7,2,3,4,1,2,3,5};
		int expected1[]={1,2,3,5,6,7};
		
		int actual2[]={5,6,8,9,1,5,6,7,8,9,2,5,8,7,9};
		int expected2[]={1,5,6,7,8,9};
		
		
		assertArrayEquals(expected1, ls.longestSequence(actual1));
		assertArrayEquals(expected2, ls.longestSequence(actual2));
		
		
	}
	
}
