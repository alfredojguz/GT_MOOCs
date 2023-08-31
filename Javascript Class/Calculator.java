import java.util.Scanner;

public class Calculator {
    public static void main(String [] ars) {
        System.out.print("Please select one of the following operations:\nadd\nsubtract\nmultiply\ndivide\nalphabetize-->");
        Scanner input = new Scanner(System.in);
        String mathmode = input.next();
        System.out.println(mathmode);
        switch (mathmode) {
            case "add":
                System.out.print("Enter a Value for Integer 1: ");
                int val1 = input.nextInt();
                System.out.print("Enter a value for Integer 2: ");
                int val2 = input.nextInt();
                int res = val1 + val2;
                System.out.println(res);
                break;
            case "subtract":
                System.out.print("Enter a Value for Integer 1: ");
                double num1  = input.nextInt();
                System.out.print("Enter a value for Integer 2: ");
                double num2 = input.nextInt();
                double res2 = num1 - num2;
                System.out.println(res2);
                break;
            case "multiply":
                System.out.print("Enter a Value for Integer 1: ");
                double doub1  = input.nextDouble();
                System.out.print("Enter a value for Integer 2: ");
                double doub2 = input.nextDouble();
                double res3 = doub1 * doub2;
                System.out.printf("%.1f", res3);
                break;
            case "divide":
                System.out.print("Enter a Value for Integer 1: ");
                double doub11  = input.nextDouble();
                System.out.print("Enter a value for Integer 2: ");
                double doub22 = input.nextDouble();
                if (doub22 == 0)
                    {System.out.println("Terminating...");
                    break;
                }
                double res4 = doub11 / doub22;
                System.out.printf("%.1f", res4);
                break;
            case "alphabetize":
                System.out.print("Enter a Value for Integer 1: ");
                String string1  = input.next();
                System.out.print("Enter a value for Integer 2: ");
                String string2 = input.next();
                int compare = string1.compareTo(string2);
                    if (compare < 0)
                    {System.out.println(string1);}
                    else {
                        if (compare > 0)
                        {System.out.println(string2);}
                    }
                break;
            default:
                System.out.println("Terminating...");
        }

    }
}
