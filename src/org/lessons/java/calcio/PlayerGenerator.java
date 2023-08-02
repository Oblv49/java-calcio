package org.lessons.java.calcio;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayerGenerator {
    private static final String[] nameContainer = {"Marco Rossi", "Alessio Bianchi", "Lorenzo Russo", "Simone Ferrara", "Andrea Martini",
            "Luca Rossetti", "Davide Fontana", "Giovanni Ricci", "Filippo Bellini", "Nicolas De Luca",
            "Emanuele Gallo", "Matteo Rossi", "Paolo Marini", "Riccardo Leone", "Tommaso Vitale",
            "Enrico Longo", "Lorenzo Gatti", "Mattia Barbieri", "Pietro Greco", "Luigi Fiore",
            "Dario Lombardi", "Andrea Mariani", "Fabio Serra", "Stefano Ruggiero", "Davide Palumbo",
            "Nicola Lombardi", "Michele Russo", "Alessio D'Amico", "Gianluca Santoro", "Nicolas Lombardi",
            "Fabrizio Marino", "Simone Barone", "Daniele Pellegrini", "Roberto Mariani", "Andrea Rizzi",
            "Matteo Moretti", "Davide Barbieri", "Stefano Bianchi", "Pietro Marchetti", "Nicolas Santoro",
            "Marco Monti", "Giovanni Martino", "Lorenzo Galli", "Alessandro Marchetti", "Luca Coppola",
            "Davide Palmieri", "Giacomo Leone", "Matteo Santoro", "Fabrizio Marino", "Gianluca Fontana",
            "Alessandro De Angelis", "Leonardo Sorrentino", "Davide Farina", "Federico Romano",
            "Simone Rinaldi", "Francesco Esposito", "Luca Vitale", "Domenico Ferrara", "Antonio Martini",
            "Mario Rossetti", "Angelo Coppola", "Carmine Bellini", "Vincenzo Ricci", "Salvatore Greco",
            "Giovanni Marchetti", "Francesco Barbieri", "Raffaele Lombardi", "Federico Bianchi",
            "Emanuele Pellegrini", "Alessio Marino", "Stefano De Rosa", "Lorenzo Santoro",
            "Gianluca De Luca", "Alberto Monti", "Gabriele Martino", "Roberto Galli", "Matteo Ferri",
            "Alessandro Mariani", "Antonio Vitale", "Nicola Romano", "Massimo Palmieri", "Daniele Ferrari",
            "Vincenzo Greco", "Salvatore Moretti", "Davide Santoro", "Riccardo Marini", "Leonardo Fiore",
            "Angelo Ruggiero", "Carmine Sorrentino", "Emanuele Farina", "Francesco Rinaldi",
            "Luigi Esposito", "Domenico Vitale", "Antonio De Angelis", "Mario Barbieri", "Giovanni Marchetti",
            "Francesco Russo", "Raffaele Martini", "Federico Coppola", "Emanuele Bellini", "Alessio Ricci"};
    private static String namePlayer;
    private static final String[] nameCoachContainer = {"John Smith", "Maria Garcia", "Robert Johnson", "Emily Martinez", "Michael Brown",
            "Jessica Davis", "William Taylor", "Jennifer Anderson", "David Wilson", "Linda Martinez",
            "James Thompson", "Patricia Rodriguez", "Daniel White", "Susan Lee", "Charles Harris",
            "Karen Miller", "Matthew Moore", "Nancy Taylor", "Andrew Davis", "Margaret Martinez",
            "Joseph Clark", "Sarah Jones", "Christopher Martinez", "Lisa Taylor", "Thomas Anderson",
            "Betty Williams", "Daniel Martin", "Linda Thompson", "Paul Harris", "Donna Johnson"};
    private static String nameCoach;
    private static final String[] roleContainer = { "Portiere", "Difensore", "Centrocampista", "Attaccante centrale"};
    private static String rolePlayer;
    private static final String[] strategyContainer = {};
    private static String strategy;

    //methods
    public static Player generatePlayer() {
        return new Player(namePlayer, rolePlayer);
    }
    public static Coach generateCoach() {
        return new Coach(nameCoach, strategy);
    }
}
