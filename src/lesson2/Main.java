package lesson2;

public class Main {

    public static void main(String[] args) {

     int a;
     a = 5;
     int b;
     b = 3;



     boolean x;
     x = a > b;

     if (x) {

     }


     if (a > b) {
         System.out.println("Yes");
     } else {
         System.out.println("No");
     }

     String name;
     name = "Sergey Petrov";

     int age;
     age = 15;

     if (age > 21) {
         System.out.println("Welcome");
     } else {
         System.out.println("Go home");

     }


     if (age == 20) {
         System.out.println("Get in");

     } else {
         System.out.println("Step back");
     }

     if (name.equals("Elena")) {
         System.out.println("Welcome");
     } else {
         System.out.println("Go home");
     }

     if (name.contains("Petrov")) {
         System.out.println("Welcome");

     } else {
         System.out.println("Go home");

     }

     if (age >= 21 && name.contains("Petrov")) {
         System.out.println("Get in");

     } else {
         System.out.println(" Get out");

     }

     if (age >= 21 || name.contains("Petrov")) {
         System.out.println("Get in");
     } else {
         System.out.println(" Get out");
     }

     int n;
     n = 9;
     int result = n / 2;
        System.out.println(result);

        int result1 = n % 2;
        System.out.println(result1);


        int z;
        z = 9;

        if (z % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        int k = 5;
        int m = 3;

         if (a==b) {
             System.out.println("Yes");



         }



    }


}
