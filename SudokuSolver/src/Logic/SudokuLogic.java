package Logic;

import Items.Position;
import Items.SudokuBoard;

public class SudokuLogic {
	
	/**
	 * Ein SudokuBoard als Matrix
	 * @param SudokuBoard
	 */
	private SudokuBoard board;
	
	/**
	 * Gibt das Sudoku Board zurueck
	 * @return board
	 */
	public SudokuBoard getBoard() {
		return board;
	}

	/**
	 * Legt ein neues Board fest
	 * @param board
	 */
	public void setBoard(SudokuBoard board) {
		this.board = board;
	}

	public Position empty() {
		for(int y = 0; y < this.board.getBoard().length; y++) {
			for(int x = 0; x < this.board.getBoard().length; x++) {
				if(this.board.getBoard()[y][x] == 0) {
					return new Position(x,y);
				}
			}
		}
		return null;
	}
	
	public boolean checkIfValid(int number, Position position) {
		
		//Check row
		for(int i = 0; i < this.board.getBoard().length; i++) {
			if(this.board.getBoard()[position.getY()][i] == number && i != position.getX()) {
				return false;
			}
		}
		
		//Check Column
		for(int i = 0; i < this.board.getBoard().length; i++) {
			if(this.board.getBoard()[i][position.getX()] == number && i != position.getY()) {
				return false;
			}
		}
		
		//Check Square
		int xCoordinate = position.getX() / 3;
		int yCoordinate = position.getY() / 3;
		
		for(int y = yCoordinate * 3; y < (yCoordinate * 3) + 3; y++) {
			for(int x = xCoordinate * 3; x < (xCoordinate * 3) + 3; x++) {
				if(this.board.getBoard()[y][x] == number && y != position.getY() && x != position.getX()) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean solveSudoku() {
		
		Position emptyCell = this.empty();
		
		if(emptyCell == null) {
			return true;
		}
		
		for(int i = 1; i < 10; i++) {
			
			if(this.checkIfValid(i, emptyCell)) {
				this.board.getBoard()[emptyCell.getY()][emptyCell.getX()] = i;
				
				if(solveSudoku()){
					return true;
				}
				
				this.board.getBoard()[emptyCell.getY()][emptyCell.getX()] = 0;
			}
		}
		return false;
	}

}
