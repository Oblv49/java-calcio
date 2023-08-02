package org.lessons.java.calcio;

import java.util.Random;

public abstract class Person {
    //VARIABLES
    private String name;
    private int age;
    //CONSTRUCTOR
    public Person(String name, int age) {
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
        //generation name random
        private String randomName() {
            Random random = new Random();
            String charAlphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            int lengthCode = 7;
            char[] code = new char[lengthCode];
            for (int i = 0; i < lengthCode; i++) {
                int indexRandom = random.nextInt(charAlphanumeric.length());
                code[i] = charAlphanumeric.charAt(indexRandom);
            }
            alfanumericCode = new String(code);
            return alfanumericCode;
        }


}
