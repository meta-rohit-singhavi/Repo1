package Assignment1;

public class MainMatrixOperations {


	public static void main(String args[]) {
		
		MatrixOperations matOp = new MatrixOperations();
		
		int[][] mat1= matOp.createMatrix();
		int[][] mat2= matOp.createMatrix();
		
		System.out.println("Addition of matrices: ");
		int addResult[][]= matOp.addElements(mat1, mat2);
		if(addResult == null){
			System.out.println("Input matrices should have same dimensions for addition");
		}else{
			matOp.showMatrix(addResult);
		}
		
		
		System.out.println("Multiplication of input matrices: ");
		int mulMatrix[][]= matOp.multiplyMatrix(mat1, mat2);
		if(mulMatrix == null){
			System.out.println("Matrices with entered orders can't be multiplied with each other.");
		}else{
			matOp.showMatrix(mulMatrix);
		}
		
		
		System.out.println("Transpose of added matrix: ");
		if(addResult != null){
			int transMat[][]= matOp.transposeElements(addResult);
			matOp.showMatrix(transMat);
		}else{
			System.out.println("Transpose is not possible");
		}
		
		
		
	}	
}
