public class PrimitiveOperations {
    public static void main(String[] args) {
        // * TODO1
        float secondValue = 12.2f;
        int firstValue = 8;

        System.out.println("First Float Value: "+firstValue);
        System.out.println("Second Integer Value: "+secondValue);

        // * TODO2
        float newValue = secondValue * firstValue;

        System.out.println("New Product: "+newValue);

        // * TODO3
        float product = (float) firstValue;
        System.out.println("Casted float value from integer value: "+product);

        // * TODO4
        int newInt = (int) secondValue;
        System.out.println("Casted integer value from the float value"+newInt);

        // * TODO5 
        char chosenChar = 'K';
        System.out.println("This is the chosen character: "+chosenChar);

        // * TODO6
        int difference = 'a' - 'A';
        System.out.println("Difference between \"a\" and \"A\": "+difference);
        //System.out.printf("%i",chosenChar);
        chosenChar = (char)(chosenChar + difference);
        System.out.println("Converted Lowercase: "+chosenChar);


    }
}
