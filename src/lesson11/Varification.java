package lesson11;

import homework8.Teacher;

import java.util.ArrayList;

public class Varification {
    public void varificationC(ArrayList<Cat> cats) {

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).getName());

        }
    }

    public void varificationD(ArrayList<Dog> dogs) {
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).getAge() + " " + dogs.get(i).getName());

        }
    }

    public void varificationA(ArrayList<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getAge() + " " + animals.get(i).getName());

        }
    }

    public static void ptintAnimalName(ArrayList<Animal> teachers) {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getName());


        }

    }

}