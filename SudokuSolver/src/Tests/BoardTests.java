package Tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Items.Position;
import Items.SudokuBoard;
import Logic.SudokuLogic;

public class BoardTests {
	
	public static void main(String[] args){
	
		int[][] board = {	
				{0,0,0,0,8,0,0,7,0}, 
				{0,4,0,2,0,7,0,0,0},	
				{0,0,7,0,0,3,5,4,9},
				{2,0,0,0,0,0,3,0,0},
				{0,0,6,0,3,0,0,0,0},
				{7,0,0,0,9,6,0,8,0},
				{3,0,0,5,0,1,0,2,8},
				{1,8,0,4,0,0,0,6,3},
				{0,6,0,0,0,0,4,0,0} };

		SudokuBoard sudokuBoard = new SudokuBoard(board);
		System.out.println("Printing initial board... \n");
		sudokuBoard.printBoard();
		System.out.println("\n ... process finished.");
		
		SudokuLogic sudokuLogic = new SudokuLogic();
		sudokuLogic.setBoard(sudokuBoard);
		
		/*
		Position pos = sudokuLogic.empty();
		
		System.out.println("X: " + pos.getX() + " Y: " + pos.getY());
		*/
		
		/*
		Position pos = new Position(6,1);
		System.out.println(sudokuLogic.checkIfValid(2, pos));
		System.out.println(sudokuLogic.checkIfValid(3, pos));
		*/
		
		
		System.out.println("\nSolving Sudoku... \n");
		sudokuLogic.solveSudoku();
		System.out.println("Solved Sudoku: \n");
		sudokuBoard.printBoard();
		
	}
}
