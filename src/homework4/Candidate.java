package homework4;

public class Candidate {
    private String name;
    private String lastName;
    private int weight;

    public Candidate(String name, String lastName, int weight) {
        this.lastName = lastName;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWeight() {
        return weight;
    }


}
