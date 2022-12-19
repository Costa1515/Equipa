package Teams;
import Positions.*;


public class Psg extends Team {

    public Psg(String name) {
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


    Goalkeeper goalkeeper1 = new Goalkeeper(99, " G. Donnarumma", "goalkeeper");
    Goalkeeper goalkeeper2 = new Goalkeeper(1, " K. Navas", "goalkeeper");
    Defender defender1 = new Defender(2, " A. Hakimi", "defender");
    Defender defender2 = new Defender(5, " Marquinhos", "defender");
    Defender defender3 = new Defender(4, " Sergio Ramos", "defender");
    Defender defender4 = new Defender(25, " Nuno Mendes", "defender");
    Defender defender5 = new Defender(26, " N. Mukiele", "defender");
    Defender defender6 = new Defender(3, " P. Kimpembe", "defender");
    Defender defender7 = new Defender(14, " Juan Bernat", "defender");
    Defender defender8 = new Defender(31, " E. Bitshiabu", "defender");
    Midfield midfield1 = new Midfield(6, " M. Verratti", "midfield");
    Midfield midfield2 = new Midfield(17, " Vitinha", "midfield");
    Midfield midfield3 = new Midfield(15, " Danilo Pereira", "midfield");
    Midfield midfield4 = new Midfield(8, " Fabián Ruiz", "midfield");
    Midfield midfield5 = new Midfield(18, " Renato Sanches", "midfield");
    Midfield midfield6 = new Midfield(19, " Pablo Sarabia", "midfield");
    Forward forward1 = new Forward(7, " K. Mbappé", "forward");
    Forward forward2 = new Forward(30, " Messi", "forward");
    Forward forward3 = new Forward(10, " Neymar", "forward");
    Forward forward4 = new Forward(44, " H. Ekitike", "forward");
    Forward forward5 = new Forward(9, " Icardi", "forward");
    Forward forward6 = new Forward(21, " Cavani", "forward");
    Manager manager = new Manager("C. Galtier ", 56);


    public void psg() {
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

