package org.lessons.java.calcio;

import java.time.LocalDate;

public abstract class Person {
    //VARIABLES
    private String name;
    private LocalDate birthDate;
    private int age;
    //CONSTRUCTOR
    public Person(String name) {
        this.name = name;
        this.age = generateRandomAge(18, 40);
        this.birthDate = generateRandomBirthDate(age);
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
        return
                "name= " + name +
                ", birthDate= " + birthDate +
                ", age= " + age +
                '.';
    }



    //methods private
        //generation random age
        private int generateRandomAge(int min, int max) {
            return min + (int) (Math.random() * (max - min + 1));
        }
        //genration birthdate random
        private LocalDate generateRandomBirthDate(int age) {
            LocalDate currentDate = LocalDate.now();
            int year = currentDate.getYear() - age;
            int dayOfYear = (int) (Math.random() * currentDate.lengthOfYear());
            return LocalDate.ofYearDay(year, dayOfYear);
        }

}
