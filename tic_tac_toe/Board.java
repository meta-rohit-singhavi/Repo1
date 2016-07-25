package tic_tac_toe;
/**
 * This class will create and initialize the matrix board
 * @author rohit
 */
public class Board {
	static final int Empty= 0, ROW= 3, COL= 3;
	int board[][] = new int[ROW][COL];
	
	Board(){
		for(int row= 0; row < ROW; row++){
			for(int col= 0; col < COL; col++){
				board[row][col]= Empty;
			}
		}
	}
	
	public int[][] getBoard(){
		return board;
	}

}
