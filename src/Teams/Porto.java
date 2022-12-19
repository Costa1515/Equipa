package Teams;
import Positions.*;
public class Porto extends Team {

    public Porto(String name) {
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

    Goalkeeper goalkeeper1 = new Goalkeeper(99, " Diogo Costa", "goalkeeper");
    Goalkeeper goalkeeper2 = new Goalkeeper(14, " Cláudio Ramos", "goalkeeper");
    Defender defender1 = new Defender(22, " Wendell", "defender");
    Defender defender2 = new Defender(3, " Pepe", "defender");
    Defender defender3 = new Defender(4, " David Carmo", "defender");
    Defender defender4 = new Defender(12, " Zaidu", "defender");
    Defender defender5 = new Defender(23, " João Mário", "defender");
    Defender defender6 = new Defender(2, " Fábio Cardoso", "defender");
    Defender defender7 = new Defender(5, " Marcano", "defender");
    Defender defender8 = new Defender(18, " Manafá", "defender");
    Midfield midfield1 = new Midfield(25, " Otávio", "midfield");
    Midfield midfield2 = new Midfield(8, " M.Uribe", "midfield");
    Midfield midfield3 = new Midfield(46, " Eustaquio", "midfield");
    Midfield midfield4 = new Midfield(16, " Grujic", "midfield");
    Midfield midfield5 = new Midfield(20, " A.Franco", "midfield");
    Midfield midfield6 = new Midfield(28, " B.Costa", "midfield");
    Forward forward1 = new Forward(9, " M.Taremi", "forward");
    Forward forward2 = new Forward(11, " Pepê", "forward");
    Forward forward3 = new Forward(7, " Veron", "forward");
    Forward forward4 = new Forward(13, " Galeno", "forward");
    Forward forward5 = new Forward(29, " T.Martínez", "forward");
    Forward forward6 = new Forward(30, " Evanilson", "forward");
    Manager manager = new Manager("S.Conceição ", 47);


    public void porto() {
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

