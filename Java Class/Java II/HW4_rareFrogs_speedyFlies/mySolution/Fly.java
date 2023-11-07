public class Fly extends Pond {
    // instantiate attribute encapsulation  
    private double mass;
    private double speed;

    // Constructor with no parameters 
    public Fly() {
        this(5,10); 
        // System.out.println("1st Default Constructor of child class");   
    }
    // Constructor with mass parameter
    public Fly(double mass) {
        this(mass, 10);
        // System.out.println("2nd Constructor of child class");   
    }
    // Constructor with mass and speed parameter
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
        // System.out.println("3rd Constructor of child class");   
    }
    
    // Setters and Getters
    public double getMass() {
        return mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // toString method
    public String toString()
    {
        if (mass == 0) {
            return String.format("I’m dead, but I used to be a fly with a speed of %.2f.", speed);
        }
        else {
            return String.format("I’m a speedy fly with %.2f speed and %.2f mass.", speed, mass);
        }
    }

    //  Fly grow 
    public void grow(int newMass) {
        for (int i = 0; i < newMass; i++ ) {
            mass++;
            if (mass <= 20) {
                speed += 1;
            } else if (mass > 20) {
                speed -= 0.5;
            }
        }
    }

    // Check if Fly is dead
    public static boolean isDead(Fly obj) {
        if (obj.mass == 0) {
            return true;
        } else {
            return false;
        }

    }

    // Main driver for fly
    public static void main(String args []) {
        Fly obj = new Fly(30,50);
        System.out.println(obj.toString());
        obj.grow(10);
        System.out.println(obj.toString());
    }
}
