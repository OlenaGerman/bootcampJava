package lesson9;

public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[3];

        array1[0] = 7;
        array1[1] = 5;
        array1[2] = 9;

        String[] array2 = new String[5];

        array2[0] = "Java";
        array2[1] = "Hi";
        array2[2] = "Hello";
        array2[3] = "Java";
        array2[4] = "Agava";

        int java = 0;

        for (int i = 0; i < array2.length; i++ ) {
            if (array2[i].equalsIgnoreCase("Java")) {
                java = java + 1;
            }


        }

        System.out.println(java);

        LogicForArray logic = new LogicForArray();
        logic.findJava(array2);

        logic.printString(array2);

        Cat cat1 = new Cat("Nikki", 8);
        Cat cat2 = new Cat("Bobic", 10);
        Cat cat3 = new Cat("Chao", 8);

        Cat[] arrayCat = new Cat[3];

        arrayCat[0] = cat1;
        arrayCat[1] = cat2;
        arrayCat[2] = cat3;

        System.out.println();
        logic.printCat(arrayCat);















    }
}
