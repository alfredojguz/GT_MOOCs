import java.util.Scanner;

public class Battleship {
    
	/** Method for printing game board
	 * @param player
	 */
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


    /** Method that returns 0 if inout not zero and returns 0 for 1
	 * 
	 * @param a
	 * @return
	 */
    public static int reverse(int a){
        if(a==0){
            return 1;
        }
        return 0;
    }

    /** Method for processing hits
	 * 
	 * @param i for player number
	 * @param hit
	 * @param obj player input 
	 * @return
	 */
    public static int[] input(int i, char[][] hit, Scanner obj){
        System.out.println("\nPlayer "+(i+1)+", enter hit row/column:");
        // Take the input
        String inp = obj.nextLine();
        // Split the string
        String[] arrOfStr = inp.split(" ");
        // Convert the coordinates into integers from strings
        int x = Integer.parseInt(arrOfStr[0]);
        int y = Integer.parseInt(arrOfStr[1]);
        // If the coordinate is out of the map, calling this function again
        if((x<0)||(x>4)||(y<0)||(y>4)){
            System.out.println("Invalid coordinates. Choose different coordinates.");
            return input(i, hit, obj);
        }
        // If the map is already hit, calling this function again
        else if(hit[x][y]=='X' || hit[x][y]=='O'){
            System.out.println("You already fired this spot. Choose different coordinates.");
            return input(i, hit, obj);
        }
        // If not, returning the two coordinates fired
        else{
            int [] ret = new int[2];
            ret[0]=x;
            ret[1]=y; 
            return ret;
        }
    }


    /** Main Method for Game processing
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        // The scanner for the entire program
        Scanner obj = new Scanner(System.in);
        // The Welcome message
        System.out.println("Welcome to Battleship!");
        // An char array of size 2*5*5, the player[0] represents 5*5 array of player 1
        char[][][] player = new char[2][5][5];
        // Initializing the array to all "-"
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                player[0][i][j]='-';
                player[1][i][j]='-';
            }
        }
        // Taking the input of these boards j=0 is player 1 and j=1 is player 2
        for(int j=0; j<2; j++){
            System.out.println("\nPLAYER "+(j+1)+", ENTER YOUR SHIPS' COORDINATES.");

            // Taking the coordinates of 5 ships with a loop
            for(int k=0; k<5; k++){
                System.out.println("Enter ship "+(k+1)+" location:");
                // Taking the input as a string
                String inp = obj.nextLine();
                // Splitting the string based on the space " "
                String[] arrOfStr = inp.split(" ");
                // Converting these string coordinates into integer
                int x = Integer.parseInt(arrOfStr[0]);
                int y = Integer.parseInt(arrOfStr[1]);
                // If the coordinate is out of range or if the coordinate has already been marked as "@"
                if((x<0)||(x>4)||(y<0)||(y>4)||(player[j][x][y]=='@')){
                    // We take the coordinate again
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    k--;
                }
                // If it is valid, update in the char array
                else{
                    player[j][x][y]='@';
                }
            }
            // Printing the battle ship after taking coordinates
            printBattleShip(player[j]);
            // Printing 100 empty lines
            for(int i=0; i<100; i++){
                System.out.print("\n");
            }
        }

        // available[0] indicates the number of ships player 1 needs to sink
        int[] available = new int[2];

        // Intializing this array to 5
        available[0] = 5;
        available[1] = 5;

        // The hitchar[0] and hitchart[1] are the arrays visible to player 1 and 2 respectively
        char[][][] hitchart = new char [2][5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                // Initializing them all to "-"
                hitchart[0][i][j]='-';
                hitchart[1][i][j]='-';
            }
        }
        // Boolean integer  to check if the game has ended
        int gameend = 0;
        // The gameends if any one of available reaches 0
        while(available[0]>0 || available[1]>0){
            // i=0 represents player 1 and i=1 represents player 2
            for(int i=0; i<2; i++){
                // Calling the input function to take the input
                int [] present = input(i, hitchart[i], obj); // calls the input method to return an array of [x][y] integers
                // Based in the received coordinates, checking with other player's battleship map
                // If the battleship is present at these coordinates
                if(player[reverse(i)][present[0]][present[1]]=='@'){
                    // Decreasing the value of available ships
                    available[i]--;
                    // Marking this in the map current player's hit map as X
                    hitchart[i][present[0]][present[1]] = 'X';
                    System.out.println("PLAYER "+(i+1)+" HIT PLAYER "+(reverse(i)+1)+"'s SHIP!");
                }
                // If no battleship is present at these coordinates
                else{
                    // Marking this in the map current player's hit map as O
                    hitchart[i][present[0]][present[1]] = 'O';
                    System.out.println("PLAYER "+(i+1)+" MISSED!");
                }
                // Print the battleship
                printBattleShip(hitchart[i]);
                // Break the loop if available of this player becomes 0
                if(available[i]==0){
                    gameend=1;
                    System.out.println("PLAYER "+(i+1)+" WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
                    break;
                }
            }
            // If the game has end, breaking the outer while loop
            if(gameend==1){
                break;
            }
        }
        // Printing the final boards is required because throughout the values were only compared not constructed on boards for opposite players
        char[][][] boards = new char[2][5][5];
        for(int i=0; i<2; i++){
            for(int j=0; j<5; j++){
                for(int k=0; k<5; k++){
                    if(hitchart[reverse(i)][j][k]=='X'){
                        boards[i][j][k]='X';
                    }
                    else if(hitchart[reverse(i)][j][k]=='O'){
                        boards[i][j][k]='O';
                    }
                    else if(player[i][j][k]=='@'){
                        boards[i][j][k]='@';
                    }
                    else{
                        boards[i][j][k]='-';
                    }
                }
            }
        }

		// Final Printing for Games

        System.out.println("\nFinal Boards:\n");
        printBattleShip(boards[0]);
        System.out.println("");
        printBattleShip(boards[1]);
        // Closing the scanner
        obj.close();


    }
}
