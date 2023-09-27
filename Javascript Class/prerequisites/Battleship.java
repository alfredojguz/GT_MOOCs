package prerequisites;
import java.util.Scanner;
public class Battleship {
	public static void main(String[] args) {
		System.out.println("Welcome to Battleship!");
		// Ask player 1 for their base coords
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
		// Ask player 2 for their base coords
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

		printBattleShip(null);
	}

	// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}

			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}

			System.out.println("");
		}
	}

	private static void acquireCoordinates(String coords) {
		int coord1 = coords.charAt(0);
		int coord2 = coords.charAt(2);
	}
}