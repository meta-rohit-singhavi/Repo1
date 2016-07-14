package ass4;

public class FCFSScheduler 
{
	
	public int[][] FCFS(int arrival_time[],int job_size[])
	{
		int waitingtime[]=new int[arrival_time.length];
		int starttime[]=new int[arrival_time.length];
		int endtime[]=new int[arrival_time.length];
		
		waitingtime[0]=0;
		
		endtime[0]=arrival_time[0]+job_size[0]-1;
		starttime[0]=1;
		
		for(int z=1;z<arrival_time.length;z++)
		{
			if(arrival_time[z]>endtime[z-1])
			{
				endtime[z]=arrival_time[z]+job_size[z]-1;
			}
			else
			endtime[z]=endtime[z-1]+job_size[z];
			
		}
		
		for(int i=1;i<arrival_time.length;i++)
		{
			if(arrival_time[i]>endtime[i-1])
			{
				waitingtime[i]=0;
			}
			else
			{
				waitingtime[i]=endtime[i]-arrival_time[i]-job_size[i]+1;
			}
		}
		
		for(int j=1;j<arrival_time.length;j++)
		{
			starttime[j]=arrival_time[j]+waitingtime[j];
		}
		
		
		System.out.println("job  job_atime job_wt  job_start job_end");
		
		for(int l=0;l<arrival_time.length;l++)
		{
			System.out.println((l+1)+" 	"+arrival_time[l]+"	 "+waitingtime[l]+"	  "+starttime[l]+"       "+endtime[l]);
			
		}
		
		int result[][]=new int[arrival_time.length][5];
		
		for(int i=0;i<arrival_time.length;i++)
		{
			result[i][0]=i+1;
			result[i][1]=arrival_time[i];
			result[i][2]=waitingtime[i];
			result[i][3]=starttime[i];
			result[i][4]=endtime[i];
		}	
		
		return result;  
	}
	
}
