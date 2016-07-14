package ass5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCheckArrayOrder 
{

	@Test 
	public void testCheckOrder()
	{
		CheckArrayOrder cao=new CheckArrayOrder();
		
		int actual1[]={5,2,1,0};
		int expected1=2;
		assertEquals(expected1,cao.checkOrder(actual1));
		
		int actual2[]={0,2,5,8,9};
		int expected2=1;
		assertEquals(expected2,cao.checkOrder(actual2));
		
		int actual3[]={5,2,1,0,5,4};
		int expected3=0;
		assertEquals(expected3,cao.checkOrder(actual3));
	
	}
	
}
