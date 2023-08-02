package org.lessons.java.calcio;

import java.util.ArrayList;

public class SoccerTeam {
    //VARIABLES
    private String coach;
    private ArrayList<Player> soccerTeam;
    //CONSTRUCTOR
    public SoccerTeam(String coach, ArrayList<Player> soccerTeam) {
        this.coach = coach;
        this.soccerTeam = soccerTeam;
    }
    //getter & setter
        //get
        public String getCoach() {
            return coach;
        }
        public ArrayList<Player> getSoccerTeam() {
            return soccerTeam;
        }
        //set
        public void setCoach(String coach) {
            this.coach = coach;
        }
        public void setSoccerTeam(ArrayList<Player> soccerTeam) {
            this.soccerTeam = soccerTeam;
        }
    //toString
    @Override
    public String toString() {
        return "SoccerTeam: " +
                "coach= " + coach +
                ", soccerTeam= " + soccerTeam +
                '.';
    }
}
