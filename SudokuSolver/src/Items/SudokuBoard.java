package Items;

public class SudokuBoard {
	
	/**
	 * Das Sudoku Board als Matrix
	 * @param board
	 */
	private int[][] board;
	
	/**
	 * Konstruktor fuer das Sudoku Board
	 * @param board
	 */
	public SudokuBoard(int[][] board) {
		this.board = board;
	}

	/**
	 * Gibt das Sudoku Board als eine Matrix zurueck
	 * @return board
	 */
	public int[][] getBoard() {
		return board;
	}

	/**
	 * Legt ein neues Sudoku Board fest
	 * @param board
	 */
	public void setBoard(int[][] board) {
		this.board = board;
	}
	
	/**
	 * Gibt das Sudoku Board auf der Kommandozeile aus
	 * @param
	 */
	public void printBoard() {
		for(int i = 0; i < 9; i++) {
			if(i != 0 && i % 3 == 0 && i != 8) {
				System.out.println("---------------------");
			}
			for(int k = 0; k < 9; k++) {
				if(k != 0 && ((k + 1) % 3 == 0) && k != 8) {
					System.out.print(this.board[i][k] + " | ");
				}
				else if(k == 8) {
					System.out.println(this.board[i][k] + " ");
				}
				else {
					System.out.print(this.board[i][k] + " ");
				}
			}
		}
	}
	
}
