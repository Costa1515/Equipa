package Teams;
import Positions.*;
import java.util.ArrayList;

public class Team  {
    int goals;
    public static final String ANSI_BLACK = "\u001B[40m";
    public String name;

    ArrayList <Player> players = new ArrayList<>();



    public Team(String name){
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team() {
    }
    public void starters(){

    }

    public int getGoals() {
        return goals;
    }
    public void golo(){
        this.goals++;
    }

    @Override
    public String toString() {
        return getName();
    }
}

