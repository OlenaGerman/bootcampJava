package polimorfizm;

public class Main {
    public static void main(String[] args) {
        Dancer dancer1 = new Walz("Oleg", "A");
        Dancer dancer2 = new Break("Nick", "B");

        dancer1.dancing();
        dancer2.dancing();

    }
}
