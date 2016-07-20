package Assignment1;
import java.util.Scanner;

/** 
 * This class will perform basic 
 * matrix operations
 *
 */

public class MatrixOperations {
 
	/**
	 * It will create 2d matrix with input rows and columns
	 * @return It will return 2d matrix
	 */
	int[][] createMatrix() {
		Scanner scan= new Scanner(System.in);
		int row= 0, column= 0;
		// Matrix Creation and Data insertion..
		System.out.println("\nEnter number of rows & columns");
		row = scan.nextInt();
		column = scan.nextInt();
		
		int[][] matrix = new int[row][column];

		System.out.println("Enter the data for matrix :");
		for(int i= 0; i < row; i++) {
			for(int j= 0; j < column; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		//scan.close();
		return matrix;
	}
	/**
	 * This method will add elements of two matrices
	 * @param mat1
	 * @param mat2
	 * @return It returns the resultant matrix after addition
	 */
	int[][] addElements(int mat1[][], int mat2[][]) {
		if( (mat1.length != mat2.length || mat1[0].length != mat2[0].length) ){
			return null;
		}
		int[][] sum= new int[mat1.length][mat1[0].length];
		
		for(int row= 0; row < mat1.length; row++) {
			for(int col=0; col < mat1[0].length; col++) {
				sum[row][col] = mat1[row][col] + mat2[row][col];
			}
		}
		return sum;
	}
	
	/**
	 * This method will multiply two matrices
	 * @param mat1
	 * @param mat2
	 * @return It returns resultant matrix
	 */
	int[][] multiplyMatrix(int[][] mat1, int[][] mat2){
		if ( mat1[0].length != mat2.length ){
			return null;
		}
		int sum= 0;
		int[][] multiply= new int[mat1.length][mat2[0].length];
		 
		for (int row= 0; row < mat1.length; row++){
			for (int col= 0; col < mat2[0].length; col++ ){
				for ( int col1 = 0 ; col1 < mat2.length ; col1++ ){
					sum = sum + mat1[row][col1] * mat2[col1][col];
					}
               multiply[row][col] = sum;
               sum = 0;
            }
         }
		return multiply;
	}
	
	/**
	 *It will perform transpose operation 
	 * @param mat
	 * @return It returns transposed matrix
	 */
	int[][] transposeElements(int[][] mat){
		int[][] transMat= new int[mat[0].length][mat.length];
		
		for(int row= 0; row < mat[0].length; row++) {
			for(int col= 0; col < mat.length; col++) {		
				transMat[row][col] = mat[col][row];
			}
		}
		return transMat;
	}
	
	/**
	 * It displays provided matrix
	 * @param matrix
	 */
	void showMatrix(int[][] matrix) {	
		for(int row= 0; row < matrix.length; row++) {
			for(int col= 0; col < matrix[0].length; col++) {
					System.out.print("\t" + matrix[row][col]);
			}
			System.out.println();
		}
	}
}