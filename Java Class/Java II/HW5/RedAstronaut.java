import java.util.Arrays;

public class RedAstronaut extends Player implements Impostor{
    private String skill;

    // DEFAULTS
    private static final int DEFAULT_SUSLEVEL = 15;
    private static final String DEFAULT_SKILL = "experienced";

    // Constructors for Red Astro from most to least specific to declare
    public RedAstronaut(String name, int suslevel, String skill) {
        super(name, suslevel); //?multiple inheritence Player() undefined
        this.skill  = skill; // subclass specific
    }
    public RedAstronaut(String name) {
        this(name, DEFAULT_SUSLEVEL, DEFAULT_SKILL); // defined for this because the super Player()
        // class only accepts a name and a default_skill
    }

    // Methods
    @Override
    public void emergencyMeeting() {
        if (!super.isFrozen()) {
            Player[] players = super.getPlayers();
            Arrays.sort(players);
            int pointer =  players.length - 1;
            int second; // second pointer below first 
            while (players[pointer].isFrozen() == true) { // Cycle through frozen players until we find one that's not frozen
                pointer--;
            }
            second = pointer - 1; // intialize second pointer to next highest suspicion level 
            while (players[second].isFrozen() == true) {
                second--;
            }
            if (players[pointer].getSusLevel() == players[second].getSusLevel()) {
                // instance where susLevel is the same where nothing happens
            } else if (players[pointer].getName() != super.getName()) { // ! explore init player name default
                players[pointer].setFrozen(true); // Freeze most suspicious player 
            }
        }
        gameOver(); // init endgame
    }


    // Freeze Method
    @Override
    public void freeze(Player p) {
        if (p instanceof Impostor || super.isFrozen() == true || p.isFrozen() == true){ 
			return;  // cases for the player already being frozen 
		} else {
			if (this.getSusLevel() < p.getSusLevel()) {
				p.setFrozen(true); // DECISION for freezing amoungst any two players
			} else {
				this.setSusLevel(getSusLevel()*2); // raises the susLevel for player 
			}
		}
		gameOver(); // check if the game is over
    }

    @Override
    public void sabotage(Player p) {
        if (p instanceof Impostor || super.isFrozen() == true || p.isFrozen() == true) {
            return;
        } else { // begin successful sabotage
            if (this.getSusLevel() < 20) {
                double temp_suschange = p.getSusLevel() * 1.50;
                p.setSusLevel((int) temp_suschange);
            } else {
                double temp_suschange = p.getSusLevel() * 1.25;
                p.setSusLevel((int) temp_suschange);
            }
        }
    }

    // equals to compare instances of Red Astro
    @Override
    public boolean equals(Object o) {
        if (o instanceof RedAstronaut) { // ! might have to change for specific variables in instance declarations
            RedAstronaut tempRedAstronaut = (RedAstronaut) o;
            return super.getName().equals(tempRedAstronaut.getName()) && super.isFrozen() == (tempRedAstronaut.isFrozen()) && 
            super.getSusLevel() == tempRedAstronaut.getSusLevel();
        } else {
        return false;
        }
    }

    // toString calling super method 
    public String toString() {
        String redAstroString = super.toString() + String.format(" I am an %s player!", this.getSkill());
        if (this.getSusLevel() > 15) {
            return redAstroString.toUpperCase();
        }
        return redAstroString;
    }

    // Getters and Setters
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    
}