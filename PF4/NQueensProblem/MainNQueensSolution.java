package NQueensProblem;

import java.util.Scanner;

public class MainNQueensSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueensSolution obj=new NQueensSolution();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Dimension of matrix :");
		int dimension=scan.nextInt();
		if(dimension<=0){
			System.out.println("Please Enter Valid Dimension");
			System.exit(1);
		}
		
		//board array-2-D
		int board[][]=new int[dimension][dimension];
		
		for(int row=0;row<dimension;row++){
			for(int col=0;col<dimension;col++){
				board[row][col]=0;
			}
		}
		
		
		//int board[][]=new int[][]{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		if(obj.getQueenSolution(board,0,dimension)==false){
			System.out.println("Solution Doesn't found");
			System.exit(1);
		}
		scan.close();
		
		//printion solution
		obj.printSolution(board,dimension);
}
}