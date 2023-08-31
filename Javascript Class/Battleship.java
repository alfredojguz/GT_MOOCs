import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        // Intialize 5 x 5 grid:
        String[][] board = new String[5][5];
        for (int outer = 0; outer < board.length; outer++) {
            String[] row = new String[board[outer].length];
            for (int inner = 0; inner < row.length; inner++) {
                row[inner] = "-";
            }
            board[outer] = row;
        }

        // test print:
        for (int outer = 0; outer < board.length; outer++) {
            String[] row = new String[board[outer].length];
            for (int inner = 0; inner < row.length; inner++) {
            }
            board[outer] = row;
        }
        System.out.println(Arrays.deepToString(board));

        System.out.println("Welcome to Battleship!");
        System.out.println("PLAYER 1, ENTER YOUR SHIPS COORDINATES.");
        System.out.println("Enter ship 1 location:");
        System.out.println("Enter ship 2 location:");
        System.out.println("Enter ship 3 location:");
        System.out.println("Enter ship 4 location:");
        System.out.println("Enter ship 5 location:");
    }
}