package org.lessons.java.calcio;

public class Player extends Person{
    //VARIABLES
    private String playerRole;
    //CONSTRUCTOR
    public Player(String name, String playerRole) {
        super(name);
        this.playerRole = playerRole;
    }
    //getter & setter
        //get
        public String getPlayerRole() {
            return playerRole;
        }
        //set
        public void setPlayerRole(String playerRole) {
            this.playerRole = playerRole;
        }
    //toString
    @Override
    public String toString() {
        return
                "Player: " +
                super.toString() +
                " playerRole= " + playerRole +
                '.';
    }
}
