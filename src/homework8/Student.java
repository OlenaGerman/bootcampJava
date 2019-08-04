package homework8;

public class Student {

    private String name;
    private String LastName;
    private String address;
    private double GPA;

    public Student(String name, String LastName, String address, double GPA){
        this.name = name;
        this.LastName = LastName;
        this.address = address;
        this.GPA = GPA;

    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return LastName;
    }

    public double getGPA(){
        return GPA;
    }









}
