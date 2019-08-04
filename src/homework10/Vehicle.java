package homework10;

public abstract class Vehicle {
    private String color;
    private int year;

    public Vehicle(String color, int year){
        this.year = year;
        this.color = color;

    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
