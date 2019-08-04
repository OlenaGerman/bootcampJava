package lesson5;

public class Calculator {

    public void ptint1(){
        System.out.println("Hello world");
    }

    public void print2(String str) {
        System.out.println(str);

    }

    public void summ( int n, int m) {
        int result = n + m;
        System.out.println( "Summ is" + result);

    }

    public void summ1(int n, int m, int z) {
        int result = (n + m) * z;
        System.out.println(result);


    }

    public void compare(String n, String m) {
        if(n.equals(m)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void compare1(int n, int m) {
        if(n<m) {
            System.out.println("Minimum" + n);
        } else {
            System.out.println(" Maximum" +m);
        }


    }

    public void mult(int a, int b) {

        int result = a * b;
        System.out.println(result);

    }

    public int mult1(int a, int b) {

        int result = a * b;
        return result;
    }

    public String eq(int a, int b) {
        String result;
        if(a == b) {
            result = "equals";
        } else {
            result = "noy equals";
        }
        return result;

    }




}
