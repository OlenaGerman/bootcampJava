package homework4;

public class Main {
    public static void main(String[] args) {
        Candidate can1 = new Candidate("Lara", "Krovt", 300);
        Candidate can2 = new Candidate("Tomb", "Rider", 230);
        Candidate can3 = new Candidate("Ira", "Popov", 165);
        Candidate can4 = new Candidate("Lora", "Norman", 200);


        String lastName1 = can1.getLastName();
        int weight1 = can1.getWeight();

        String lastName2 = can2.getLastName();
        int weight2 = can2.getWeight();

        String lastName3 = can3.getLastName();
        int weight3 = can3.getWeight();

        String lastName4 = can4.getLastName();
        int weight4 = can3.getWeight();

        Admin admin = new Admin();
        admin.selection(can1);
        admin.selection(can2);
        admin.selection(can3);
        admin.selection(can3);
        System.out.println();



    }





}
