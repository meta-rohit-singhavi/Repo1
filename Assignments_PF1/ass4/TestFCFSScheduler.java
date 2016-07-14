package ass4;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestFCFSScheduler 
{
	@Test
	public void testFCFS()
	{
		FCFSScheduler fcfs=new FCFSScheduler();
		
		int expected1[][]={{1,1,0,1,12},{2,4,9,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		int expected2[][]={{1,1,0,1,8},{2,7,2,9,21},{3,15,7,22,23},{4,25,0,25,30}};
		
		int arrtime1[]={1,4,9,25};
		int bursttime1[]={12,7,2,5};
		
		int arrtimet2[]={1,7,15,25};
		int bursttime2[]={8,13,2,6};
		
		assertArrayEquals(expected1, fcfs.FCFS(arrtime1, bursttime1));
		assertArrayEquals(expected2, fcfs.FCFS(arrtimet2, bursttime2));
	}
}
