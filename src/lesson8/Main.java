package lesson8;

import lesson7.Admin;

public class Main {
    public static void main(String[] args) {
        Enimals eni1 = new Enimals(10, 12);
        Enimals eni2 = new Enimals(2, 8);
        Enimals eni3 = new Enimals(14, 15);

//        int age1 = eni1.getAge();
//        int weight1 = eni1.getWeight();

        Doctor doc1 = new Doctor();
        doc1.tests(eni1);
        doc1.tests(eni2);
        doc1.tests(eni3);
        System.out.println();





    }
}
