package org.lessons.java.calcio;

import java.util.ArrayList;

/*
*   Creare una classe Persona con gli attributi nome ed età.
*    Estendere la classe Persona con una classe Giocatore e una classe Allenatore: ogni giocatore ha un ruolo e
*    ogni allenatore ha la sua strategia (es: difensiva o offensiva).Definire una classe Squadra che contiene una
*    lista di oggetti di tipo Giocatore e un Allenatore.Creare infine una classe Main e definire al suo
*    interno un array di nomi e un array con i possibili ruoli per i giocatori.
*   Nel metodo main, generare una Squadra formata da 11 giocatori creati in modo randomico:
*
*        prelevare un nome casuale dall’array di nomi
*        generare l’età in modo casuale
*        prelevare un ruolo casuale dall’array di possibili ruoli
*
*    BONUS: nella classe Persona, al posto dell’età, memorizzare la data di nascita
*/
public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        Coach coach = generator.generateCoach();
        Player goalkeeper = generator.generateGoalKeeper();
        ArrayList<Player> players = generator.generatePlayerList(10);
        SoccerTeam team = new SoccerTeam(coach, goalkeeper, players, generator.getStrategyToRolesMap());
        team.assignRolesToPlayers();
        System.out.println("------------------------------------");
        System.out.println("ECCO LA TUA SQUADRA GENERATA RANDOM:");
        System.out.println("------------------------------------");
        System.out.println(team);
        System.out.println("------------------------------------");
    }
}

