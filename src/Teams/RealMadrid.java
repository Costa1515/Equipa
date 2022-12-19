package Teams;
import Positions.*;
public class RealMadrid extends Team {


    public RealMadrid(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    Goalkeeper goalkeeper1 = new Goalkeeper(1, " T. Courtois", "goalkeeper");
    Goalkeeper goalkeeper2 = new Goalkeeper(13, " A. Lunin", "goalkeeper");
    Defender defender1 = new Defender(2, " Carvajal", "defender");
    Defender defender2 = new Defender(22, " A. Rüdiger", "defender");
    Defender defender3 = new Defender(4, " D. Alaba", "defender");
    Defender defender4 = new Defender(23, " F. Mendy", "defender");
    Defender defender5 = new Defender(6, " Nacho", "defender");
    Defender defender6 = new Defender(3, " Éder Militão", "defender");
    Defender defender7 = new Defender(16, " Odriozola", "defender");
    Defender defender8 = new Defender(5, " Vallejo", "defender");
    Midfield midfield1 = new Midfield(10, " L. Modrić", "midfield");
    Midfield midfield2 = new Midfield(8, " T. Kroos", "midfield");
    Midfield midfield3 = new Midfield(15, " F. Valverde", "midfield");
    Midfield midfield4 = new Midfield(12, " E. Camavinga", "midfield");
    Midfield midfield5 = new Midfield(18, " A. Tchouaméni", "midfield");
    Midfield midfield6 = new Midfield(17, " Lucas Vázquez", "midfield");
    Forward forward1 = new Forward(9, " K. Benzema", "forward");
    Forward forward2 = new Forward(21, " Rodrygo", "forward");
    Forward forward3 = new Forward(20, " Vinícius Júnior", "forward");
    Forward forward4 = new Forward(11, " Asensio", "forward");
    Forward forward5 = new Forward(7, " E. Hazard", "forward");
    Forward forward6 = new Forward(24, " M. Díaz", "forward");
    Manager manager = new Manager("C. Ancelotti ", 63);


    public void realMadrid() {
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


