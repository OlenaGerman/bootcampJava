package homework6;

public class Main1 {
    public static void main(String[] args) {
       Dog dog1 = new Dog();
       Dog dod2 = new Dog();
       Dog dog3 = new Dog();
       Dog dog4 = new Dog();
       Dog dog5 = new Dog();

       dog1.setName("Nikki");
       dog1.setAge(9);
       dog1.setBreed("kokker");

        System.out.println(dog1.getName());


        Cat cat1 = new Cat("Bobic", 6);
        Cat cat2 = new Cat("Bursik", 5);
        Cat cat3 = new Cat("Lukky", 2);
        Cat cat4 = new Cat("Nika", 10);

        Cat[] arrayCat = new Cat[4];

        arrayCat[0] = cat1;
        arrayCat[1] = cat2;
        arrayCat[2] = cat3;
        arrayCat[3] = cat4;




    }





}


