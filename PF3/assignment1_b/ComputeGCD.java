package assignment1_b;

public class ComputeGCD {
	
	/**
	 * This method calculates GCD of two numbers using recursion
	 * @param first The first number
	 * @param second The second number
	 * @return It returns GCD value as an integer
	 */
	int getGCD(int first, int second) {
       
		if(first<=0 || second<=0){
			System.out.println("Numbers can not be zero or negative");
			return -1;
		}else{
			int remainder = first % second;
			
	        if (remainder == 0)
	            return second;
	        else
	            return getGCD(second, remainder);
		}
	}
}
