package org.lessons.java.calcio;

import java.util.ArrayList;
import java.util.Map;

public class SoccerTeam {
    //VARIABLES
    private Coach coach;
    private Player goalKeeper;
    private ArrayList<Player> soccerTeam;
    private Map<String, int[]> strategyToRolesMap;

    //CONSTRUCTOR
    public SoccerTeam(Coach coach, Player goalKeeper, ArrayList<Player> soccerTeam, Map<String, int[]> strategyToRolesMap) {
        this.coach = coach;
        this.goalKeeper = goalKeeper;
        this.soccerTeam = soccerTeam;
        this.strategyToRolesMap = strategyToRolesMap;
    }

    //getter & setter
        //get
        public Coach getCoach() {
            return coach;
        }
        public Player getGoalKeeper() {
            return goalKeeper;
        }
        public ArrayList<Player> getSoccerTeam() {
            return soccerTeam;
        }
        public Map<String, int[]> getStrategyToRolesMap() {
            return strategyToRolesMap;
        }
        //set
        public void setCoach(Coach coach) {
            this.coach = coach;
        }
        public void setGoalKeeper(Player goalKeeper) {
            this.goalKeeper = goalKeeper;
        }
        public void setSoccerTeam(ArrayList<Player> soccerTeam) {
            this.soccerTeam = soccerTeam;
        }
        public void setStrategyToRolesMap(Map<String, int[]> strategyToRolesMap) {
            this.strategyToRolesMap = strategyToRolesMap;
        }

    //methods
    public void assignRolesToPlayers() {
        String strategy = coach.getStrategy();
        int[] roleDistribution = strategyToRolesMap.get(strategy);

        int defendersCount = roleDistribution[0];
        int midfieldersCount = roleDistribution[1];
        int forwardsCount = roleDistribution[2];

        for (int i = 0; i < defendersCount; i++) {
            Player player = soccerTeam.get(i);
            player.setPlayerRole("Difensore");
        }

        for (int i = defendersCount; i < defendersCount + midfieldersCount; i++) {
            Player player = soccerTeam.get(i);
            player.setPlayerRole("Centrocampista");
        }

        for (int i = defendersCount + midfieldersCount; i < defendersCount + midfieldersCount + forwardsCount; i++) {
            Player player = soccerTeam.get(i);
            player.setPlayerRole("Attaccante");
        }
    }

    //toString
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("SoccerTeam:\n");
        result.append("Coach:\n").append(coach).append("\n");
        result.append("Goalkeeper:\n").append(goalKeeper).append("\n");
        result.append("Players:\n");

        for (Person player : soccerTeam) {
            result.append(player).append("\n");
        }

        return result.toString();
    }
}
