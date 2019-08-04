package lesson3;

import javax.print.DocFlavor;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;


    }

    public void voice() {

        System.out.println("Myau");

    }

    public void intraduce() {

        System.out.println(" Hi! I'm " + name) ;




    }
    public void setName(String name) {
        this.name = name;



    }

    public void play () {
        System.out.println(" I'm plaing now");

    }







}