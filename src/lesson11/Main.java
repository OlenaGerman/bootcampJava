package lesson11;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat("", 9, 128);

       Cat cat1 = new Cat("Mursik", 8, 56);
       Cat cat2 = new Cat("Tuzik", 2, 12);
       Cat cat3 = new Cat("Nika", 4, 120);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        System.out.println(cat1.getName());

        System.out.println(cat1.getAge());

        System.out.println();


        Dog dog1 = new Dog("Bobik", 10, "taksa");
        Dog dog2 = new Dog("Sharic", 7, "kokker");
        Dog dog3 = new Dog("Zhuk", 6, "pincher");

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);


        System.out.println(dog1.getAge());

        System.out.println(dog1.getName());

        System.out.println();

        Varification varification = new Varification();

        varification.varificationC(cats);
        varification.varificationD(dogs);


        System.out.println();



        ArrayList<Animal>animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(cat1);
        animals.add(cat2);
        animals.add(dog2);
        animals.add(cat3);
        animals.add(dog3);

        varification.varificationA(animals);

        Varification.ptintAnimalName(animals);








    }




}
