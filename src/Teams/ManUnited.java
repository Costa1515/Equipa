package Teams;
import Positions.*;
public class ManUnited extends Team {


    public ManUnited(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    Goalkeeper goalkeeper1 = new Goalkeeper(1, " David de Gea", "goalkeeper");
    Goalkeeper goalkeeper2 = new Goalkeeper(31, " M. Dúbravka", "goalkeeper");
    Defender defender1 = new Defender(20, " Diogo Dalot", "defender");
    Defender defender2 = new Defender(19, " R. Varane", "defender");
    Defender defender3 = new Defender(6, " Lisandro Martínez", "defender");
    Defender defender4 = new Defender(23, " L. Shaw", "defender");
    Defender defender5 = new Defender(29, " A. Wan-Bissaka", "defender");
    Defender defender6 = new Defender(5, " H. Maguire", "defender");
    Defender defender7 = new Defender(2, " V. Lindelöf", "defender");
    Defender defender8 = new Defender(12, " T. Malacia", "defender");
    Midfield midfield1 = new Midfield(8, " Bruno Fernandes", "midfield");
    Midfield midfield2 = new Midfield(18, " Casemiro", "midfield");
    Midfield midfield3 = new Midfield(17, " Fred", "midfield");
    Midfield midfield4 = new Midfield(14, " C. Eriksen", "midfield");
    Midfield midfield5 = new Midfield(34, " D. van de Beek", "midfield");
    Midfield midfield6 = new Midfield(39, " S. McTominay", "midfield");
    Forward forward1 = new Forward(7, " Cristiano Ronaldo", "forward");
    Forward forward2 = new Forward(21, " Antony", "forward");
    Forward forward3 = new Forward(25, " J. Sancho", "forward");
    Forward forward4 = new Forward(10, " M. Rashford", "forward");
    Forward forward5 = new Forward(9, " A. Martial", "forward");
    Forward forward6 = new Forward(36, " A. Elanga", "forward");
    Manager manager = new Manager("E. ten Hag ", 52);


    public void manUnited() {
        players.add(goalkeeper1);
        players.add(goalkeeper2);
        players.add(defender1);
        players.add(defender2);
        players.add(defender3);
        players.add(defender4);
        players.add(defender5);
        players.add(defender6);
        players.add(defender7);
        players.add(defender8);
        players.add(midfield1);
        players.add(midfield2);
        players.add(midfield3);
        players.add(midfield4);
        players.add(midfield5);
        players.add(midfield6);
        players.add(forward1);
        players.add(forward2);
        players.add(forward3);
        players.add(forward4);
        players.add(forward5);
        players.add(forward6);
        manager.getManagers().add(manager);
    }

    public void starters() {
        goalkeeper1.setStarter(true);
        defender1.setStarter(true);
        defender2.setStarter(true);
        defender3.setStarter(true);
        defender4.setStarter(true);
        midfield1.setStarter(true);
        midfield2.setStarter(true);
        midfield3.setStarter(true);
        forward1.setStarter(true);
        forward2.setStarter(true);
        forward3.setStarter(true);
    }

}
