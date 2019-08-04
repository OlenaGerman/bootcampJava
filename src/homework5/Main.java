package homework5;

public class Main {
    public static void main(String[] args) {

        int[] array2 = new int [5];
        array2[0] = 3;
        array2[1] = 8;
        array2[2] = 7;
        array2[3] = 6;
        array2[4] = 9;
        int sum = 0;
        for(int i = 0; i < array2.length; i++){
            sum = sum+array2[i];
        }
        System.out.println(sum);
        System.out.println();

        int[] array3 = new int [10];
        array3[0] = 2;
        array3[1] = 4;
        array3[2] = 5;
        array3[3] = 7;
        array3[4] = 10;
        array3[5] = 20;
        array3[6] = 30;
        array3[7] = 40;
        array3[8] = 55;
        array3[9] = 56;

        int b = 0;
        int c = 0;

        for (int i = 0; i<array3.length; i++){
            if (array3[i] % 2 ==0){
                b = b+1;
            } else {
                c = c+1;}

        }

        if (b > c) {
            System.out.println("even");
        }else{
            System.out.println("not even");}

        System.out.println();




        int size = array2.length;

        for(int i = 0; i < 4; i ++)
        System.out.println(array2[i]);




        System.out.println();

        System.out.println(size);

        for(int i = 0; i < array2.length; i++) {
            if (array2[i] > 4) {
                System.out.println(array2[i] + "");
        } else {
                System.out.println("Don't have any");
            }
            System.out.println();







        }










    }
}
