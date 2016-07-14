package ass2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestRemoveDuplicates 
{
	
	RemoveDuplicates rd=new RemoveDuplicates();
	
	@Test
	public void testremoveDuplicates()
	{
		int actual1[]={5,2,7,2,4,7,8,2,3};
		int expected1[]={5,2,7,4,8,3};
		
		int actual2[]={5,5,4,8,7,9,7,6};
		int expected2[]={5,4,8,7,9,6};
		
		int actual3[]={2,5,8,5,2,8,6};
		int expected3[]={2,5,8,6};
		
		
		assertArrayEquals(expected1,rd.removeDuplicates(actual1));
		assertArrayEquals(expected2,rd.removeDuplicates(actual2));
		assertArrayEquals(expected3,rd.removeDuplicates(actual3));
		
	}

}
