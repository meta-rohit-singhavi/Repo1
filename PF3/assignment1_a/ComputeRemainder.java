package assignment1_a;

public class ComputeRemainder {
	
	/**
	 * This recursive method is used to get remainder
	 * 
	 * @param dividend 
	 * @param divisor
	 * @return It returns remainder as an integer value
	 */
	public int getRemainder(int dividend, int divisor){
		int rem= 0;
		
		if(dividend < 0 || divisor <= 0){
			System.out.println("Wrong input");
		}
		else{
			if(dividend < divisor){
				return dividend;
			}else{	
			return getRemainder(dividend - divisor, divisor);
			}
		}
		return rem;
	}
}
