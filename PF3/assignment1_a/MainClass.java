package assignment1_a;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		ComputeRemainder c=new ComputeRemainder();
		Scanner sc=new Scanner(System.in);
		int dividend,divisor;
		
		System.out.println("Enter dividend and divisor=");
		dividend= sc.nextInt();
		divisor= sc.nextInt();
		System.out.println(c.getRemainder(dividend,divisor));
		sc.close();
	}

}
