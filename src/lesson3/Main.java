package lesson3;

public class Main {
    public static void main(String[] args) {

        System.out.println( " My name is Inan. My adge is 45 ");

        String  name;
        name = " Inan";
        int age;
        age = 45;

        System.out.println(" My name is " + name + "." + " My age is " + age );




        Cat cat1 = new Cat("Amour", 8);
        cat1.voice();


        Cat cat2 = new Cat("Dayse", 10);
        cat2.voice();

        cat1.intraduce();
        cat2.intraduce();
        cat1.intraduce();

        cat1.setName("Alba");
        cat1.intraduce();

        cat1.play();
        cat2.play();

        Cat cat3 = new Cat("Bublic", 8);
        cat3.voice();
        cat3.intraduce();
        cat3.setName("Prjanik");
        cat3.intraduce();
        cat3.play();



        Dog dog1 = new Dog( "Bobik", 10, "boxer");
        dog1.into();

        Dog dog2 = new Dog("Tuzik", 12, "cokker-spaniel");

        dog2.into();

        Dog dog3 = new Dog("Sharik", 9, "taksa");
        dog3.into();


        dog1.setName("Ogon");
        dog1.into();

        dog2.setName("A");
        dog2.into();

        dog3.setName("B");
        dog3.into();

        dog1.setAge(3);
        dog1.introducing();
        dog2.setAge(5);
        dog2.introducing();
        dog3.setAge(20);
        dog3.introducing();

        dog1.play();
        dog2.play();
        dog3.play();

        Dog dog4 = new Dog("Gav", 35, "buldog");
        dog4.into();

        Dog dog5 = new Dog("Lay", 16, "chao");
        dog5.into();

        dog4.setName("Bulu");
        dog4.into();

        dog5.setName("Hulu");
        dog5.into();

        dog4.play();
        dog5.play();


        Frog frog1 = new Frog("Kva", 2, 3.2);
        Frog frog2 = new Frog("Krya", 5, 6.8);


        frog1.intro();
        frog1.setName("Kva-Kva");
        frog1.setAge(4);
        frog1.intro();

        frog2.intro();
        frog2.setName("Krya-Krya");
        frog2.setAge(89);
        frog2.intro();











    }

}





