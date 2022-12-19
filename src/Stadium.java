public enum Stadium {

    STADIUM1 ("Old Trafford"),
    STADIUM2 ("Parc des Princes"),
    STADIUM3 ("Santiago Bernabéu"),
    STADIUM4 ("Dragão");
    private String name;
    Stadium(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
