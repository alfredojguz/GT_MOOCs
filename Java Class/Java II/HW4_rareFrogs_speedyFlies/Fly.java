public class Fly {
    
    private double flyMass;
    private double flySpeed;

    // Constructor with no parameters 
    public Fly() {
        this(5,10); 
        System.out.println("1st Default Constructor of child class");   
    }
    // Constructor with mass parameter
    public Fly(double mass) {
        this(mass, 10);
        System.out.println("2nd Constructor of child class");   
    }
    // Constructor with mass and speed parameter
    public Fly(double mass, double speed) {
        this.flyMass = mass;
        this.flySpeed = speed;
        System.out.println("3rd Constructor of child class");   
    }
    
    // toString method
    public String toString()
    {
        if (flyMass == 0) {
            return String.format("I’m dead, but I used to be a fly with a speed of %.2f.", flySpeed);
        }
        else {
            return String.format("I’m a speedy fly with %.2f speed and %.2f mass.", flyMass, flySpeed);
        }
    }

    public void grow(int addedMass) {
        flyMass += (double) addedMass;
        
    }

    // Main driver for fly
    public static void main(String args []) {
        Fly obj = new Fly(0); 
        System.out.println(obj.flyMass + " " + obj.flySpeed);
        System.out.println(obj.toString());
    }
}
