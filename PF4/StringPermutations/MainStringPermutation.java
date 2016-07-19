package StringPermutations;

import java.util.Scanner;

public class MainStringPermutation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter String:");
		String str= scan.next();
		StringPermutation obj= new StringPermutation();
		obj.getPermutation(str);
		scan.close();
	}

}
