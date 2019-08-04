package lesson10;

import java.beans.PersistenceDelegate;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> array1 = new ArrayList<>();

        array1.add("Java");
        array1.add("Hello");
        array1.add("Hi");
        array1.add("Selenium");
        array1.add("Java");

        for (int i = 0; i < array1.size(); i++){

            System.out.println(array1.get(i));

        }

        System.out.println();

        for (int i = 0; i < array1.size(); i++){
            if(i % 2 == 0){
                System.out.println(array1.get(i));
            }
        }

        System.out.println();

        int summ = 0;

        for (int i = 0; i < array1.size(); i++) {
            if(array1.get(i).equals("Java")){
                summ = summ +1;

            }
        }
        System.out.println(summ);

        ArrayList<Integer> array2 = new ArrayList<>();

        array2.add(5);
        array2.add(3);
        array2.add(-3);
        array2.add(-7);
        array2.add(8);

        System.out.println();

        for (int i = 0; i< array2.size(); i++) {
            System.out.println(array2.get(i));
        }

        System.out.println();


        int summary = 0;
        for (int i = 0; i < array2.size(); i++){
            summary = summary + array2.get(i);
        }
        System.out.println(summary);

        System.out.println();

        int m = 0;
        int n = 0;
        for (int i = 0; i < array2.size(); i++){
            if (array2.get(i) > 0){
                m = m + 1;
            } else {
                n = n +1;
            }
        }
        if( m > n){
            System.out.println(" + ");
        } else {
            System.out.println(" - ");
        }


        Person person1 = new Person("Oleg", "Ivanov", 34);
        Person person2 = new Person("Nik", "Jones", 45);
        Person person3 = new Person("Bob", "Snow", 56);

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        for (int i = 0; i < persons.size(); i++){
            System.out.println(persons.get(i).getFirstname());
            System.out.println(persons.get(i).getLastname());

        }

        for (int i = 0; i < persons.size(); i++){
            System.out.println(persons.get(i).getLastname());


        }

        System.out.println();

        for (int i = 0; i < persons.size(); i ++){
            persons.get(i).setAge(30);
            System.out.println(persons.get(i).getFirstname() + " " + persons.get(i).getAge());
        }









    }
}
