package org.lessons.java.calcio;

public class Coach extends Person{
    //VARIABLES
    private String strategy;
    //CONSTRUCTOR
    public Coach(String name, String strategy) {
        super(name);
        this.strategy = strategy;
    }
    //getter & setter
        //get
        public String getStrategy() {
            return strategy;
        }
        //set
        public void setStrategy(String strategy) {
            this.strategy = strategy;
        }
    //toString
    @Override
    public String toString() {
        return
                "Coach: " +
                super.toString() +
                " strategy= " + strategy +
                '.';
    }
}
