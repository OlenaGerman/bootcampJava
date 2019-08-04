package lesson6;

public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[5];

        array1[0] = 7;
        array1[1] = 9;
        array1[2] = 3;
        array1[3] = 6;
        array1[4] = 2;

        System.out.println(array1[0]);
        array1[0] = 5;
        System.out.println(array1[0]);

        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);

        int size = array1.length;
        System.out.println(size);


        for (int i = 0; i < 100; i++) {
            System.out.println("Hello world");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(array1[i]);

        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }


    }

}
