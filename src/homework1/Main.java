package homework1;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Chuk", "Gek");
        Student student2 = new Student("Bob", "Dilan", 30);
        Student student3 = new Student (25);



        student1.checkout(40);
        student1.checkout2("Chuk", "Chuk Morning");
        student1.sayWorld();


        student1.setAge(19);
        student2.setFirstname("Marik");
        student3.setLastname("Jacobs");

        String resultname = student1.getFirstname();
        System.out.println(resultname);

        String resultLastname = student2.getLastname();
        System.out.println(resultLastname);

        int resultAge = student3.getAge();
        System.out.println(resultAge);


        Teacher teacher1 = new Teacher("Bob", "Sinkler", "math", 3600);
        Teacher teacher2 = new Teacher("Alex", "Mox", "diology", 2100);

//        teacher1.intro();
//        System.out.println(teacher1);

        teacher1.setName("Mark");
        teacher1.setLastName("Kruglov");
        teacher1.setJob("Phizra");
        teacher1.setSalary(2000);

        teacher2.setName("Tomas");
        teacher2.setLastName("Burch");
        teacher2.setSalary(1500);
        teacher2.setJob("phizics");






        Teacher teacher3 = new Teacher("chemical", 2400);
        Teacher teacher4 = new Teacher("biology", 2700);

        teacher3.setName("Ali");
        System.out.println();
        teacher3.getLastName("Aliev");
        System.out.println();


        teacher4.setName("Eric");
        teacher4.setLastName("Gomes");







    }







}
