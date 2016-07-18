package assignment1_c;

import java.util.Scanner;

public class MainClass {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LargestDigitInInteger largestInt=new LargestDigitInInteger();
		int number;
		
		System.out.println("Enter an Integer=");
		number= sc.nextInt();
		if(number > 0)
			System.out.println("largest digit in "+number+" is "+largestInt.largestDigit(number));
		else
			System.out.println("Number is Negative or zero");
		sc.close();
	}
	
}
