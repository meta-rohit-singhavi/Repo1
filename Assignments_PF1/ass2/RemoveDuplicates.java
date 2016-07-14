package ass2;

public class RemoveDuplicates
{
	
	    public int[] removeDuplicates(int[] input)
	    {
	    	int out[]=new int[input.length];
	    	int k=0;
	    	        for(int i=0;i<input.length;i++)
	    	        {
	    	            boolean isDiff = false;
	    	            for(int j=0;j<i;j++){
	    	                if(input[i] == input[j])
	    	                {
	    	                    isDiff = true;
	    	                    break;
	    	                }
	    	            }
	    	            if(!isDiff)
	    	            {
	    	            	out[k++]=input[i];
	    	                System.out.print(input[i]+" ");
	    	            }
	    	        }
	    	        
	    	        int output[]=new int[k];
	    	        
	    	        for(int l=0;l<output.length;l++)
	    	        {
	    	        	output[l]=out[l];
	    	        	
	    	        }
	    	        
					return output;
	    }
	    	     
	    
}
	    	