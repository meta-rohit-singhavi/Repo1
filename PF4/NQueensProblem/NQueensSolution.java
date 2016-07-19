package NQueensProblem;

class NQueensSolution{
	/**
	 * This method prints solution of n queens problem
	 * @param board 2d matrix
	 * @param dimension 
	 */
	public void printSolution(int board[][], int dimension){
		for(int row= 0; row < dimension; row++){
			for(int col= 0; col < dimension; col++){
				System.out.print("  "+board[row][col] );
				
			}
			System.out.println();
		}
	}
	
	/**function for finding safe place for queen
	 * 
	 * @param board 2d integer array
	 * @param row
	 * @param col
	 * @param dimension
	 * @return true or false
	 */
	public boolean safePlace(int board[][], int row, int col, int dimension){
		
		//check for row at left
		
		for(int index= 0; index < col; index++){
			if(board[row][index] == 1){
				return false;
			}
		}
		
		//check for upper diagonal
		for(int index1= row, index2= col; index1>= 0 && index2>= 0; index1--, index2--){
			if(board[index1][index2] == 1){
				return false;
			}
		}
		
		//check for lower diagonal
		for(int index1= row, index2= col; index2>= 0 && index1< dimension; index1++, index2--){
			if(board[index1][index2] == 1){
				return false;
			}
		}
		return true;
	}
	
	public boolean getQueenSolution(int board[][], int col, int dimension){
		
		//Exception handling for negative dimensions
		if(dimension <= 0){
			System.out.print("Please Enter Valid dimension");
			return false;
		}
		//all column has been traversed
		if(col >= dimension){
			return true;
		}
		for(int row= 0; row < dimension; row++){
			//checking safe place condition
			if(safePlace(board, row, col, dimension)){
				board[row][col]= 1;
				//checking place of next queen to be placed using getQueenSolution
				if(getQueenSolution(board, col+1, dimension)){
					return true;
				}
				//backtracking condition
				board[row][col]= 0;
			}
			
		}
		//if solution not found
		return false;
	}
	
	public String[] queenSolution(int board[][], int col, int dimension){
		
		if(getQueenSolution(board, col, dimension) == false){
			System.out.println("Solution Doesn't found");
			return null;
		}
		
		String output[]= new String[dimension];
		for(int index= 0; index < dimension; index++){
			output[index]= "";
		}
		
		for(int row= 0; row < dimension; row++){
			for(int index= 0; index < dimension; index++){
				
				output[row]= output[row]+""+board[row][index];
			}
		}
		return output;
	}
}
