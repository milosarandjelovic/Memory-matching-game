package working;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MemoryMatchingGame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] board = { "1", "2", "3", "4", "5", "6", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
				"1", "2", "3", "4", "5", "6", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" };
		Shuffle(board);
		String[] gameBoard = new String [board.length];
		boardPrint (board);	
		System.out.println();
		System.out.println("Are you ready?");
		String start=s.next();
		startGame (gameBoard);
		gameBoardPrint (gameBoard);
	}

	public static String[] Shuffle(String[] board) {
		Random rand = new Random();
		for (int i = 0; i < 50; i++) {
			int first = rand.nextInt(board.length);
			int second = rand.nextInt(board.length);
			String tmp = board[first];
			board[first] = board[second];
			board[second] = tmp;
		}
		return board;
	}
	public static void boardPrint (String [] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.print(board[i] + ",");
			if (i == 5) {
				System.out.println();

			} else if (i == 11) {
				System.out.println();

			} else if (i == 17) {
				System.out.println();
			} else if (i == 23) {
				System.out.println();
			} else if (i == 29) {
				System.out.println();
			}
		}
	}
	public static String[] startGame(String[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = "#";
		}
		return array;
		
	}
	public static void gameBoardPrint (String [] gameBoard) {
		for (int i = 0; i < gameBoard.length; i++) {
			System.out.print(gameBoard[i] + ",");
			if (i == 5) {
				System.out.println();

			} else if (i == 11) {
				System.out.println();

			} else if (i == 17) {
				System.out.println();
			} else if (i == 23) {
				System.out.println();
			} else if (i == 29) {
				System.out.println();
			}
		}
	}
}
