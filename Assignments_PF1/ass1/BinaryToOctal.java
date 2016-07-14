package ass1;

public class BinaryToOctal 
{
	public int convertBinaryToOctal(int n)
	{
		int decimal=0,p=0,rem=0,i=1;
		int octal=0;
		
		while(true)
		{
			if(n==0)
			{
				break;
			}
			else
			{
				int temp=n%10;
				decimal+= temp*Math.pow(2,p);
				n=n/10;
				p++;
			}
		}
		
		while(decimal!=0)
		{
			rem=decimal%8;
			decimal/=8;
			octal+=(rem*i);
			i*=10;
		}
		
		return octal;
	}

}
