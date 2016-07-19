package KnightProblem;

import java.util.Scanner;

public class MainKnightTourSolution {

	public static void main(String[] args) {
		KnightTourSolution kts=new KnightTourSolution();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Dimension of matrix :");
		int dimension=scan.nextInt();
		
		kts.solveKP(dimension);
		
		scan.close();
	}
}
