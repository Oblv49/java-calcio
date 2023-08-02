package org.lessons.java.calcio;

import java.util.Random;

public abstract class Person {
    //VARIABLES
    private String name;
    private int age;
    //CONSTRUCTOR
    public Person(String name) {
        this.name = name;
        this.age = age;
    }
    //getter & setter
        //get
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        //set
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
    //tostring
    @Override
    public String toString() {
        return "Person: " +
                "name= " + name +
                ", age= " + age +
                '.';
    }

    //methods private
        //generation random age
        //creare metodo random che genera un'età compresa tra 18 e 45


}
