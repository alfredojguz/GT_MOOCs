public abstract class Pet { // abstract because i may not want to make pet objects but may help to draw basic characteristics from more specific classes
    private String name;
    private double health; // 0.0 - 1.0 double
    private int painLevel; // 1- 10 integer

    public Pet(String name, double health, int painLevel) {
        this.name = name;
        if (health > 1.0) {
            this.health = 1.0;
        } else if (health < 0.0) {
            this.health = 0.0;
        } else {
            this.health = health;
        }
        if (painLevel > 10) {
            this.painLevel = 10;
        } else if (painLevel < 1) {
            this.painLevel = 1;
        } else {
            this.painLevel = painLevel;
        }
    }

    // Getters
    public String getName() {
		return name;
	}
	
	public double getHealth() {
		return health;
	}
	
	public int getPainLevel() {
		return painLevel;
	}
	
	public abstract int treat(); // ! instantiate abstract variable treats to be used by both cats and dogs
	
	public void speak() {
		if (painLevel > 5) {
			System.out.println(("Hello! My name is " + name).toUpperCase());
		} else {
			System.out.println("Hello! My name is " + name);
		}
	}

    public boolean equals(Object o) {
	    if (!(o instanceof Pet)) {
	        return false;
	    }
	    Pet pet = (Pet) o;
	    return ((pet.name == name));
	}

    protected void heal() {
		health = 1.0;
		painLevel = 1;
	}
}
    


