package org.lessons.java.calcio;

import java.util.ArrayList;

public class SoccerTeam {
    //VARIABLES
    private String coach;
    private String goalKeeper;
    private ArrayList<Player> soccerTeam;

    //CONSTRUCTOR
    public SoccerTeam(String coach, String goalKeeper, ArrayList<Player> soccerTeam) {
        this.coach = coach;
        this.goalKeeper = goalKeeper;
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
        public String getGoalKeeper() {
            return goalKeeper;
        }
        //set
        public void setCoach(String coach) {
            this.coach = coach;
        }
        public void setSoccerTeam(ArrayList<Player> soccerTeam) {
            this.soccerTeam = soccerTeam;
        }
        public void setGoalKeeper(String goalKeeper) {
            this.goalKeeper = goalKeeper;
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
