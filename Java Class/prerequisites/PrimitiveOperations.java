package prerequisites;
public class PrimitiveOperations {
    
    public static void main(String[] args) {
    int integer = 1;
    System.out.println(integer);
    float floating = (float) 2.4;
    System.out.println(floating);
    float multiply = integer * floating;
    System.out.println(multiply);

    // use casting
    float newInteger = integer;
    System.out.println(newInteger);
    int newFloating = (int) floating ;
    System.out.println(newFloating);

    // declaring char
    char character = 'B';
    System.out.println(character);
    int asciiOfChar = (int) character + 32;
    char newAscii = (char) asciiOfChar;
    System.out.println(newAscii);

    }
    
}