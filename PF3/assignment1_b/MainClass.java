package assignment1_b;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		ComputeGCD compGCD=new ComputeGCD();
		Scanner sc=new Scanner(System.in);
		int first,second;
		
		System.out.println("Enter two numbers=");
		first= sc.nextInt();
		second= sc.nextInt();
		System.out.println(compGCD.getGCD(first, second)+""+first);
		sc.close();
	}
}
