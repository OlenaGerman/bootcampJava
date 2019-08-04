package lesson3;

public class Frog {
    String name;
    int age;
    double length;

    public Frog(String name, int age, double lendth) {
        this.name = name;
        this.age = age;
        this.length = length;

    }

    public void intro(){

        System.out.println("My name is " + name  + " I'm " + age);

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

     public static void main(String[] args) {
        int n;
        n = 2;
        int m;
        m = 2;

        int result = n + m;
         System.out.println(result);

    }






}


