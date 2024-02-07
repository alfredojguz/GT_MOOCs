import java.util.Arrays;

public class BlueAstronaut extends Player implements Crewmate {
    // Variables 
    private int numTasks;
    private int taskSpeed; 

    // DEFAULTS
    private static final int DEFAULT_SUSLEVEL = 15;
    private static final int DEFAULT_NUMTASKS = 6;
    private static final int DEFAULT_TASKSPEED = 10;

    // Constructors
    public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed) {
        super(name, susLevel);
        this.numTasks = numTasks;
        this.taskSpeed = taskSpeed;
    }

    public BlueAstronaut(String name) {
        this(name, DEFAULT_SUSLEVEL, DEFAULT_NUMTASKS, DEFAULT_TASKSPEED);
    }
    

    // Methods
    @Override
    public void emergencyMeeting() {
        if (!super.isFrozen()) {
            Player[] players = super.getPlayers();
            Arrays.sort(players);
            int pointer = players.length - 1;
            int second;
            while (players[pointer].isFrozen() == true) {
                pointer--;
            }
            second = pointer - 1;
            while (players[second].isFrozen() == true) {
                second--;
            }
            if (players[pointer].getSusLevel() == players[second].getSusLevel()) {
                // do nothing 
            } else if (players[pointer].getName() != super.getName()) {
                players[pointer].setFrozen(true);
            }
        }
        gameOver(); //init endgame check
    }

    int count = 0;
    @Override
    public void completeTask() {
        if (!super.isFrozen()) {
            if (taskSpeed > 20) {
                numTasks -= 2;
            } else {
                numTasks -=1;
            }
            if (numTasks <= 0) {
                numTasks = 0;
                taskSpeed = 0;
                count++;
            }

        }

        if (numTasks == 0 && count == 1) {
            System.out.println("I have completed all my tasks");
            super.setSusLevel((int)(getSusLevel() * .5));
        } // ! figure out the point of the counter in this method
    }

    public boolean equals(Object o) {
        if (o instanceof BlueAstronaut) {
            BlueAstronaut red = (BlueAstronaut) o;
            return super.getName().equals(red.getName()) && super.isFrozen() == red.isFrozen()
            && super.getSusLevel() == red.getSusLevel() ;
        }
        return false;
    }

    public String toString() {
        String blueAstroString = super.toString() + " I have " + this.numTasks + " left over.";
        if (this.getSusLevel() > 15) {
            return blueAstroString.toUpperCase();
        } return blueAstroString;
    }
}
