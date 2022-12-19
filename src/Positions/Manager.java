package Positions;

import java.util.ArrayList;

public class Manager {

    String name;
    int age;
    private ArrayList<Manager> managers = new ArrayList<>();

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }
}
