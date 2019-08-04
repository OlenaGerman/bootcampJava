package homework10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tracks tracks = new Tracks("red", 2010, 450);
        Tracks tracks1 = new Tracks("green", 2019, 2000);
        Cars cars = new Cars("black", 2018, 180);
        Cars cars1 = new Cars("blue", 2016, 220);

        ArrayList<Cars>car = new ArrayList<>();
        car.add(cars1);
        car.add(cars);

        ArrayList<Tracks>track = new ArrayList<>();
        track.add(tracks);
        track.add(tracks1);




    }
}
