package ass6;

public class MergeTwoSortedArrays 
{
	public int[] join(int a[],int asize,int b[],int bsize,int c[])
	{
		
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			
			else
				c[k++]=b[j++];
			
		}
		
		while(i<a.length)
			c[k++]=a[i++];
		
		while(j<b.length)
			c[k++]=b[j++];
	
		return c;
	}
}
