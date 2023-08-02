package org.lessons.java.calcio;

import java.util.*;

public class Generator {
    private static final ArrayList<String> nameContainer = new ArrayList<>(Arrays.asList("Marco Rossi", "Alessio Bianchi", "Lorenzo Russo", "Simone Ferrara", "Andrea Martini",
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
            "Francesco Russo", "Raffaele Martini", "Federico Coppola", "Emanuele Bellini", "Alessio Ricci"));

    private static final ArrayList<String> nameCoachContainer = new ArrayList<>(Arrays.asList("John Smith", "Maria Garcia", "Robert Johnson", "Emily Martinez", "Michael Brown",
            "Jessica Davis", "William Taylor", "Jennifer Anderson", "David Wilson", "Linda Martinez",
            "James Thompson", "Patricia Rodriguez", "Daniel White", "Susan Lee", "Charles Harris",
            "Karen Miller", "Matthew Moore", "Nancy Taylor", "Andrew Davis", "Margaret Martinez",
            "Joseph Clark", "Sarah Jones", "Christopher Martinez", "Lisa Taylor", "Thomas Anderson",
            "Betty Williams", "Daniel Martin", "Linda Thompson", "Paul Harris", "Donna Johnson"));
    private static final ArrayList<String> strategyContainer = new ArrayList<>(Arrays.asList("4-4-2", "4-3-3", "3-5-2", "4-2-3-1",
            "5-3-2", "4-1-4-1", "4-5-1", "3-4-3", "4-3-1-2", "3-4-2-1",
            "3-3-3-1", "5-2-2-1", "4-2-2-2", "3-4-1-2", "5-4-1",
            "3-4-3", "4-2-4", "4-2-2-2", "4-1-2-1-2", "4-3-2-1",
            "4-4-1-1", "3-6-1", "5-2-3", "3-3-1-3", "3-4-1-2",
            "3-5-1-1", "3-3-2-2", "5-3-1-1", "4-3-1-2", "4-3-3-1"));
    private static final ArrayList<String> roleContainer = new ArrayList<>(Arrays.asList("Portiere", "Difensore", "Centrocampista", "Attaccante"));
    private static final Map<String, int[]> strategyToRolesMap = new HashMap<>();
    static {
        strategyToRolesMap.put("4-4-2", new int[]{4, 4, 2});
        strategyToRolesMap.put("4-3-3", new int[]{4, 3, 3});
        strategyToRolesMap.put("3-5-2", new int[]{3, 5, 2});
        strategyToRolesMap.put("4-2-3-1", new int[]{4, 2, 4});
        strategyToRolesMap.put("5-3-2", new int[]{5, 3, 2});
        strategyToRolesMap.put("4-1-4-1", new int[]{4, 1, 5});
        strategyToRolesMap.put("4-5-1", new int[]{4, 5, 1});
        strategyToRolesMap.put("3-4-3", new int[]{3, 4, 3});
        strategyToRolesMap.put("4-3-1-2", new int[]{4, 3, 3});
        strategyToRolesMap.put("3-4-2-1", new int[]{3, 4, 3});
        strategyToRolesMap.put("3-3-3-1", new int[]{3, 3, 4});
        strategyToRolesMap.put("5-2-2-1", new int[]{5, 2, 3});
        strategyToRolesMap.put("4-2-2-2", new int[]{4, 2, 4});
        strategyToRolesMap.put("3-4-1-2", new int[]{3, 4, 3});
        strategyToRolesMap.put("5-4-1", new int[]{5, 4, 1});
        strategyToRolesMap.put("3-4-3", new int[]{3, 4, 3});
        strategyToRolesMap.put("4-2-4", new int[]{4, 2, 4});
        strategyToRolesMap.put("4-2-2-2", new int[]{4, 2, 4});
        strategyToRolesMap.put("4-1-2-1-2", new int[]{4, 3, 3});
        strategyToRolesMap.put("4-3-2-1", new int[]{4, 3, 3});
        strategyToRolesMap.put("4-4-1-1", new int[]{4, 4, 2});
        strategyToRolesMap.put("3-6-1", new int[]{3, 6, 1});
        strategyToRolesMap.put("5-2-3", new int[]{5, 2, 3});
        strategyToRolesMap.put("3-3-1-3", new int[]{3, 3, 4});
        strategyToRolesMap.put("3-4-1-2", new int[]{3, 4, 3});
        strategyToRolesMap.put("3-5-1-1", new int[]{3, 5, 2});
        strategyToRolesMap.put("3-3-2-2", new int[]{3, 3, 4});
        strategyToRolesMap.put("5-3-1-1", new int[]{5, 3, 2});
        strategyToRolesMap.put("4-3-1-2", new int[]{4, 3, 3});
        strategyToRolesMap.put("4-3-3-1", new int[]{4, 3, 4});
    }
    private static final Random random = new Random();
    private static String nameCoach;
    private static String namePlayer;
    private static String rolePlayer;
    private static String strategy;
    private static final ArrayList<String> usedNames = new ArrayList<>();
    private static final ArrayList<String> usedNamesCoach = new ArrayList<>();



    //methods
    public static Player generatePlayer() {
        generateNameRandom();
        return new Player(namePlayer, rolePlayer);
    }
    public static Coach generateCoach() {
        generateCoachNameRandom();
        return new Coach(nameCoach, strategy);
    }
    //toString
    @Override
    public String toString() {
        return "PlayerGenerator: " +
                "name= " + namePlayer;
    }
    //private methods
        //generation name random
        private static String generateNameRandom() {
            if (usedNames.size() == nameContainer.size()) {
                usedNames.clear();
            }
            int indexRandom;
            do {
                indexRandom = random.nextInt(nameContainer.size());
                namePlayer = nameContainer.get(indexRandom);
            } while (usedNames.contains(namePlayer));
            usedNames.add(namePlayer);
            return namePlayer;
        }
        //generation name coach random
        private static String generateCoachNameRandom() {
            if (usedNamesCoach.size() == nameCoachContainer.size()) {
                usedNamesCoach.clear();
            }
            int indexRandom;
            do {
                indexRandom = random.nextInt(nameCoachContainer.size());
                nameCoach = nameCoachContainer.get(indexRandom);
            } while (usedNamesCoach.contains(nameCoach));
            usedNamesCoach.add(nameCoach );
            return nameCoach;
        }


}
