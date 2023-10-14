import java.util.Scanner;

public class Calculator {
    public static void main(String [] ars) {
        Scanner input = new Scanner(System.in);

        // initialization code
        String[] options = {"add", "subtract", "multiply", "divide", "alphabetize"};
        String errorMessage = "Invalid input entered. Terminating...";
        int integer1 = 0; // intialize first var
        int integer2;
        double double1 = 0;
        double double2;
        int resultInt;
        double resultDoub;

        // Prompt for case insensitive input from user
        System.out.println("List of Operations: " + String.join(" ", options));
        System.out.println("Enter an operation: ");
        String mathmode = input.nextLine().toLowerCase();
        switch (mathmode) {
            case "add":
                System.out.println("Enter two integers: ");

                if (input.hasNextInt())
                    integer1 = input.nextInt();
                if (input.hasNextInt()) {
                    integer2 = input.nextInt();
                    resultInt = integer1 + integer2;
                    System.out.println("Answer: " + resultInt);
                }
                else {
                    System.out.println(errorMessage);
                    return;
                }
                break;
            case "subtract":
                System.out.println("Enter two integers: ");

                if (input.hasNextInt())
                    integer1 = input.nextInt();
                if (input.hasNextInt()) {
                    integer2 = input.nextInt();
                    resultInt = integer1 - integer2;
                    System.out.println("Answer: " + resultInt);
                }
                else {
                    System.out.println(errorMessage);
                    return;
                }
                break;
            case "multiply":
                System.out.print("Enter two doubles:\n");

                if (input.hasNextDouble())
                    double1 = input.nextDouble();
                if (input.hasNextDouble()) {
                    double2 = input.nextDouble();
                    resultDoub = double1 * double2;
                    System.out.printf("Answer: %.2f", resultDoub);
                }
                else {
                    System.out.println(errorMessage);
                    return;
                }
                break;
            case "divide":
                System.out.print("Enter two doubles:\n");

                if (input.hasNextDouble())
                    double1 = input.nextDouble();
                if (input.hasNextDouble()) {
                    double2 = input.nextDouble();
                    if (double2 != 0.0) {
                        resultDoub = double1 / double2;
                        System.out.printf("Answer: %.2f", resultDoub);
                    }
                    else {
                        System.out.println(errorMessage);
                        return;
                    }
                }
                    break;
            case "alphabetize":
                // Prompt for words
                System.out.println("Enter two words: ");

                // Process words and only words
                String strings  = input.nextLine(); // ensuring to take all lines at once 
                String[] stringArr = strings.split(" "); // splitting the input into array elements

                for (int i = 0; i < 2; i++) {
                    stringArr[i] = stringArr[i].replaceAll("^\"|\"$","");
                }
                if ((stringArr.length == 2) && (strings.matches("[a-zA-Z\\sn\"]+"))) {
                    int compareWords = stringArr[0].compareTo(stringArr[1]);
                    if ((compareWords == 0) || (stringArr[0].equalsIgnoreCase(stringArr[1]))) {
                        System.out.println("Answer: Chicken or Egg.");
                    }
                    else if (compareWords < 0) {
                        System.out.println("Answer: " + stringArr[0] + " comes before " + stringArr[1] + " alphabetically.");
                    }
                    else {
                        System.out.println("Answer: " + stringArr[1] + " comes before " + stringArr[0] + " alphabetically.");
                    }
                }
                else {
                    System.out.println(errorMessage);
                    return;
                }
                break;
            default:
                // If the user enters an invalid operation, the program should print the following error message and terminate gracefully. "Invalid input entered. Terminating..."
                System.out.println(errorMessage);
                return;
        } 
        input.close();
        return;
    }
}
            




//                 int compare = (string2.toLowerCase()).compareTo((string1).toLowerCase());
//                 if (compare == 0) {
//                 System.out.println("Answer: Chicken or Egg.");
//                 }
//                 else if (compare > 0) {
//                     System.out.printf("Answer: %s comes before %s alphabetically.",string1, string2);
//                 }
//                 else if (compare < 0) {
//                     {System.out.printf("Answer: %s comes before %s alphabetically.",string2, string1);}
//                 }
//                 break;
//         }

//     }
// }
