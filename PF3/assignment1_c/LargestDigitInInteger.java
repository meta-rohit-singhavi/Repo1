package assignment1_c;

public class LargestDigitInInteger {
	/**
	 * This method finds the largest digit from an 
	 * integer number.
	 * @param number 
	 * @return It returns largest digit from given integer value
	 * if exists otherwise it returns zero.
	 */
	public int largestDigit(int number){
		int remainder= 0;
		int check= 0;
		if(number == 0)
			return 0;
		else if(number < 0){
			System.out.println("Number is negative");
			return -1;
		}
		else{
			remainder= number % 10;
			check= largestDigit(number / 10);
		
			if(remainder > check)
				return remainder;
			else
				return check;
		}
	}
}
