import java.util.Scanner;
import java.util.Arrays;


public class Battleship1 {
    public static void main(String[] args) {
        //  Intialize 5 x 5 grid:
        // for player 1 :
        String[][] board1 = new String[5][5];
        for (int outer = 0; outer < board1.length; outer++) {
            String[] row = new String[board1[outer].length];
            for (int inner = 0; inner < row.length; inner++) {
                row[inner] = "-";
            }
            board1[outer] = row;
        }
        // for player 2 :
        String[][] board2 = new String[5][5];
        for (int outer = 0; outer < board2.length; outer++) {
            String[] row = new String[board2[outer].length];
            for (int inner = 0; inner < row.length; inner++) {
                row[inner] = "-";
            }
            board2[outer] = row;
        }
        // We can use deepToString to convert multidimensional arrays
        // System.out.println(Arrays.deepToString(board1));
        
        // Welcome msg
        System.out.println("Welcome to Battleship!");
        // Player 1 Base
        System.out.println("PLAYER 1, ENTER YOUR SHIPS COORDINATES.");
        System.out.println("Enter ship 1 location:");
        Scanner input = new Scanner(System.in);
        String ship1_1 = input.next(); 
        System.out.println("Enter ship 2 location:");
        String ship1_2 = input.next();
        System.out.println("Enter ship 3 location:");
        String ship1_3 = input.next();
        System.out.println("Enter ship 4 location:");
        String ship1_4 = input.next();
        System.out.println("Enter ship 5 location:");
        String ship1_5 = input.next();

        
        // Player 2 Base
        System.out.println("PLAYER 2, ENTER YOUR SHIPS COORDINATES.");
        String ship2_1 = input.next(); 
        System.out.println("Enter ship 2 location:");
        String ship2_2 = input.next();
        System.out.println("Enter ship 3 location:");
        String ship2_3 = input.next();
        System.out.println("Enter ship 4 location:");
        String ship2_4 = input.next();
        System.out.println("Enter ship 5 location:");
        String ship2_5 = input.next();

    }
}