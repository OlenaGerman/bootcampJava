package lesson3;

public class Dog {


    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {

        this.name = name;
        this.age = age;
        this.breed = breed;

    }

    public void into() {


        System.out.println( "My name is " + name + " I'm " + age);


    }

    public void setName(String name) {

        this.name = name;


    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introducing () {
        System.out.println("I'm " + age + " years old");
    }

    public void play () {
        System.out.println("The " + name + " gives a clow");


    }

}
