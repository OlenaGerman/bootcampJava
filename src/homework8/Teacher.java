package homework8;

public class Teacher {
    private String FirstName;
    private String LastName;
    private double LOS;
    private double AW;

    public Teacher(String FirstName, String LastName, double LOS, double AW ){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.LOS = LOS;
        this.AW = AW;
    }

    public String getFirstName(){
        return FirstName;
    }

    public String getLastName(){
        return LastName;

    }

    public double getLOS() {
        return LOS;
    }

    public double getAW(){
        return AW;
    }

}
