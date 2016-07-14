package ass5;

public class CheckArrayOrder   //warning:does not work for if input array contains equal numbers
{

	public int checkOrder(int arr[])
	{
		int countAsc=1,countDesc=1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				if(countDesc>1)
				{
					System.out.println("Array has No order");
					return 0;
				}
				countAsc++;
			}
			else if(arr[i]>arr[i+1])
			{
				if(countAsc>1)
				{
					System.out.println("Array has No order");
					return 0;
				}
				countDesc++;
				
			}
		}
		
		if(countAsc==arr.length)
		{
			System.out.println("Array is in Ascending order");
			return 1;
		}
		
		
		else if(countDesc==arr.length)
		{
			System.out.println("Array is in Descending order");
			return 2;
		}
		else
		{
			System.out.println("Array has No order");
			return 0;
		}
	}
	
	public static void main(String[] args) 
	{
		CheckArrayOrder c=new CheckArrayOrder();
		int a[]={5,4,3,2,2,0};
		System.out.println(c.checkOrder(a));
		
	}

}


