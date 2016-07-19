package KnightProblem;

class KnightTourSolution{

	/**
	 * This will check if place is safe to move or not
	 * @param next_x
	 * @param next_y
	 * @param sol
	 * @param dimension
	 * @return boolean Returns true if safe to move else false
	 */
	public boolean safePlace(int next_x, int next_y, int sol[][], int dimension){
		return(next_x>=0 && next_x<dimension && next_y>=0 && next_y<dimension && sol[next_x][next_y]== -1);
	}
	
	public boolean solveKnightProblem(int x, int y, int movei, int sol[][], int xMove[], int yMove[], int dimension){
		if(movei == dimension * dimension){
			return true;
		}
		
		for(int index= 0; index < dimension; index++){
			int next_x= x + xMove[index];
			int next_y= y + yMove[index];
			if(safePlace(next_x, next_y, sol, dimension)){
				sol[next_x][next_y]= movei;
				if(solveKnightProblem(next_x, next_y, movei+1, sol, xMove, yMove, dimension)){
					return true;
				}else{
					//backtracking
					sol[next_x][next_y]= -1;
				}
			}
		}
		return false;
	}
	
	/**
	 * This method will create and initialize arrays
	 * @param dimension
	 * @return It return -1 if solution does not exists or 
	 * when wrong input provided
	 */
	public int solveKP(int dimension){
		if(dimension <= 0){
			System.out.println("Please Enter Valid Dimension");
			return -1;
		}
		int sol[][]= new int[dimension][dimension];
		 
		for (int col = 0; col < dimension; col++)
            for (int row= 0; row < dimension; row++){
                sol[col][row] = -1;
            }
		
		int xMove[]= {2, 1, -1, -2, -2, -1, 1, 2};
		int yMove[]= {1, 2, 2, 1, -1, -2, -2, -1};
		sol[0][0]= 0;
		
		if(!solveKnightProblem(0, 0, 1, sol, xMove, yMove, dimension)){
			System.out.println("Solution doesnt found");
			return -1;
		}
		printSolution(sol, dimension);
		return 0;
	}
	
	public void printSolution(int sol[][], int dimension){
		for(int row=0; row < dimension; row++){
			for(int col= 0; col < dimension; col++){
				System.out.print(" "+sol[row][col]);
			}
			System.out.println();
		}
	}
}