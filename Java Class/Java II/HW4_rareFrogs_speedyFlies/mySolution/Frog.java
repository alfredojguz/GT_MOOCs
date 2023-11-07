public class Frog extends Pond {
    // instantiate attribute encapsulation  
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet; // ? do I need to instantiate this
    public String species = "Rare Pepe"; // ? Where is this used

    public Frog(String name) {
        this(name, 5, 5);
    } public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name, (int) (ageInYears * 12), tongueSpeed);
    } public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        if (age > 1 && age < 7) {
            isFroglet = true;
        } else {
            isFroglet = false;
        }
        species = "Rare Pepe";
    }

    // getters and setters methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public double getTongueSpeed() {
        return tongueSpeed;
    }
        
    public void setTongueSpeed(double tongueSpeed) {
        this.tongueSpeed = tongueSpeed;
    }
    
    public boolean isIsFroglet() {
        return isFroglet;
    }

    public void setIsFroglet(boolean isFroglet) {
        this.isFroglet = isFroglet;
    }
        
    public String getSpecies() {
        return species;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }


    // grow method for frog
    public void grow(int months) {
        for (int i = 0; i < months; i ++) {
            age += 1;
            if (age < 12) { // ensure that frog younger than 12 months to increase TS
                tongueSpeed += 1;
            } else if (age > 30 && tongueSpeed >= 5) { // otherwise, decrement TS 
                tongueSpeed -= 1;
            } else {
                continue;
            }
        }
        if (1 < age && age < 7) { // Update froglet status
            isFroglet = true;
        } else {
            isFroglet = false;
        }
    }

    // grow method that takes in no parameters 
    public void grow() {
        age += 1;
        if (age < 12) { // grow cases 
            tongueSpeed += 1;
        } else if (age > 30 && tongueSpeed >= 5) {
            tongueSpeed -= 1;
        }
        if (1 < age && age < 7) { // Update froglet status
            isFroglet = true;
        } else {
            isFroglet = false;
        }
    }
    // method to attempt to eat class type Fly
    public void eat(Fly flyToEat) {
        if (!Fly.isDead(flyToEat)) {
            // System.out.println("catching block running...");
            // System.out.println("frog tongue speed " + tongueSpeed);
            // System.out.println("fly speed " + flyToEat.flySpeed);
            // System.out.println("fly mass " + flyToEat.flyMass);
            if (tongueSpeed > flyToEat.getSpeed() && flyToEat.getMass() >= (0.5 * age)) {
                grow();
                flyToEat.setMass(0);
            } else if (tongueSpeed > flyToEat.getSpeed()) {
                flyToEat.setMass(0);
            } else { // fly not caught cases
                flyToEat.grow(1);
            }

        }
    }

    // toString() method for driver return 
    public String toString() {
        if (isFroglet == true) {
            return String.format("My name is %s and I’m a rare froglet! I’m %.2f months old and my tongue has a speed of %.2f.", name, (double) age,tongueSpeed);
        } else {
            return String.format("My name is %s and I’m a rare frog. I’m %.2f months old and my tongue has a speed of %.2f.", name, (double) age,tongueSpeed);
        }
    }

    // public static void main(String args[]) {
    //     Frog obj = new Frog("Peepo", 2, 5);
    //     System.out.println(obj.toString());

    // }
}
