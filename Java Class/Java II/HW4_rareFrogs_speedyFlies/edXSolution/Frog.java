public class Frog {
    // instantiate variables
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;

    // class variables
    private static String species = "";

    // constants 
    private static final int DEFAULT_AGE = 5;
    private static final int DEFAULT_TONGUE = 5;

    public Frog(String name) {
        this(name, DEFAULT_AGE, DEFAULT_TONGUE);
    }

    public Frog(String name, double ageInYears) {
        this(name, (int) (12 * ageInYears), DEFAULT_TONGUE);
    }

    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        this.isFroglet = (age > 1) && (age < 7); // isFroglet() can be determined in one line using boolean comparison &&
    }

    public void grow(int addMonths) {
        // for-loop through every iterative month
        for (int i = 0; i < addMonths; i++) {
            age +=1 ; 
            if (age <= 12) {
                tongueSpeed += 1;
            } else if (age <= 30) {
                // continue and no longer add an speed
            } else { // subtract tongue speed after 30
                tongueSpeed -= 1;
            }
        
        }
        // cannot decrease tongue speed to less than 5
        // because of ternary operator, tongueSpeed is maintained when higher than 5, and set to 5 when it's lower
        tongueSpeed = (tongueSpeed < 5) ? 5 : tongueSpeed; // where '?' is the ternary operator
        
        // update isFroglet() 
        isFroglet = (age > 1) && (age < 7);
    }

    public void grow() { // for simple 1 month growth
        grow(1); // avoid duplicating code
    }

    /**
     * This method allows for the attempt to eat a fly
     * 
     * @param prey is the fly that the frog is trying to eat (pre-instantiated)
     */
    public void eat(Fly prey) {
        if (!prey.isDead()) { // fly IS caught 
            if (tongueSpeed > prey.getSpeed()) {
                if (prey.getMass() >= (age * 0.5)) {
                    grow();
                }
                prey.setMass(0);
            } else { // fly NOT caught
                prey.grow(1);   
            }
        }
    }

    /**
     * @return a description of the frog or froglet with name, age, and tongue speed
     */
    public String toString() {
        if (isFroglet) {
            return String.format("My name is %s and I'm a rare froglet! I'm %d months old"
            + " and my tongue has a speed of %.2f.", name, age, tongueSpeed);
        } else {
            return String.format("My name is %s and I'm a rare frog. I'm %d months old"
            + " and my tongue has a speed of %.2f.", name, age, tongueSpeed);
        }
    }

    /**
     * @return the name of the frog species
     */
    public static String getSpecies() {
        return species;
    }

    /**
     * This method changes the species of all frog instances
     * @return 
     */
    public static void setSpecies(String newSpecies) {
        species = newSpecies;
    }
    
}
