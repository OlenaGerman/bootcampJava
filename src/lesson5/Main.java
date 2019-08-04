package lesson5;

public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();

        calc1.ptint1();

        calc1.print2("Mom");

        calc1.summ(4, 6);

        calc1.summ(7, 5);

        calc1.summ1(30,20, 2);
        calc1.compare("Privet", "Poka");

        calc1.compare("Poka", "Poka");

        calc1.compare1(25, 30);

        calc1.mult(5,7);

        int res = calc1.mult1(5,4);
        System.out.println(res);

        String result = calc1.eq(56, 2);
        System.out.println(result);

        String result1 = calc1.eq(22, 22);
        System.out.println(result1);















    }


}
