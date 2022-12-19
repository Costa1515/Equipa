package Teams;
import Positions.*;
public class PrintTeam extends Team {

    public void print(Team team1, Team team2) {
        team1.starters();
        team2.starters();
        System.out.println("\n               "+ANSI_BLACK+"Goalkeeper"+ "\033[39m" + "\033[49m"+"                                     "+ANSI_BLACK+"Goalkeeper"+ "\033[39m" + "\033[49m");
        for (int i = 0; i < team1.players.size(); i++) {
            if (team1.players.get(i).isStarter && team1.players.get(i).getPosition().equals("goalkeeper")) {
                System.out.println("            "+team1.players.get(i).getNumShirt() + " " + team1.players.get(i).getName()+"                                "+team2.players.get(i).getNumShirt() + " " + team2.players.get(i).getName());
            }
        }
        System.out.println("\n               "+ANSI_BLACK+"Defender"+ "\033[39m" + "\033[49m"+"                                     "+ANSI_BLACK+"Defender"+"\033[39m" + "\033[49m");
        for (int i = 0; i < team1.players.size(); i++) {
            if (team1.players.get(i).isStarter && team1.players.get(i).getPosition().equals("defender")) {
                System.out.println("            "+team1.players.get(i).getNumShirt() + " " + team1.players.get(i).getName()+"                                "+team2.players.get(i).getNumShirt() + " " + team2.players.get(i).getName());            }
        }
        System.out.println("\n               "+ANSI_BLACK+"Midfield"+ "\033[39m" + "\033[49m"+"                                     "+ANSI_BLACK+"Midfield"+"\033[39m" + "\033[49m");
        for (int i = 0; i < team1.players.size(); i++) {
            if (team1.players.get(i).isStarter && team1.players.get(i).getPosition().equals("midfield")) {
                System.out.println("            "+team1.players.get(i).getNumShirt() + " " + team1.players.get(i).getName()+"                                "+team2.players.get(i).getNumShirt() + " " + team2.players.get(i).getName());            }
        }
        System.out.println("\n               "+ANSI_BLACK+"Forward"+ "\033[39m" + "\033[49m"+"                                     "+ANSI_BLACK+"Forward"+"\033[39m" + "\033[49m");
        for (int i = 0; i < team1.players.size(); i++) {
            if (team1.players.get(i).isStarter && team1.players.get(i).getPosition().equals("forward")) {
                System.out.println("            "+team1.players.get(i).getNumShirt() + " " + team1.players.get(i).getName()+"                                "+team2.players.get(i).getNumShirt() + " " + team2.players.get(i).getName());            }
        }
    }
}
