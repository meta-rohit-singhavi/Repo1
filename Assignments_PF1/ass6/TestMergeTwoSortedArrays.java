package ass6;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestMergeTwoSortedArrays 
{
	
	@Test
	public void testJoin() 
	{
		MergeTwoSortedArrays mtsa=new MergeTwoSortedArrays();
		
		int a1[]={1,4,6,7,8};
		int b1[]={2,3,5,9,25};
		int expected1[]={1,2,3,4,5,6,7,8,9,25};
		int c1[]=new int[a1.length+b1.length];
		
		int a2[]={5,6,8};
		int b2[]={1,7,9};
		int expected2[]={1,5,6,7,8,9};
		int c2[]=new int[a2.length+b2.length];
		
		
		assertArrayEquals(expected1,mtsa.join(a1, a1.length, b1, b1.length, c1));
		assertArrayEquals(expected2,mtsa.join(a2, a2.length, b2, b2.length, c2));
	}

	
}
