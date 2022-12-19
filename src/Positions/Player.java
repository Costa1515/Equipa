package Positions;

public abstract class Player {
    protected String position;
    private int numShirt;
   private String name;
   public boolean isStarter;

   public Player(int numShirt, String name,String position){
       this.name = name;
       this.numShirt = numShirt;
       this.position = position;
   }

    public void setStarter(boolean starter) {
        isStarter = starter;
    }

    public int getNumShirt() {
        return numShirt;
    }

    public void setNumShirt(int numShirt) {
        this.numShirt = numShirt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

