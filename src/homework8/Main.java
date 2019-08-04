package homework8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Oleg", "A", "Brooklyn Bridge 2265", 4.75);
        Student student2 = new Student("Nick", "B", "2250 Ocean Ave", 4.9);
        Student student3 = new Student("Luck", "C", "665 88th street", 3.96);
        Student student4 = new Student("Bob", "D", "567 Coney island Ave", 3.56);
        Student student5 = new Student("Rob", "E", "9 Brighton Bch", 5);


        ArrayList<Student>students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Checkout checkout = new Checkout();

        checkout.selectingName(students);
        checkout.selectingLastName(students);
        checkout.selectingGPA(students);






        ArrayList<Teacher>teachers = new ArrayList<>();

        DataProsess dataProsess = new DataProsess();

        dataProsess.DataProsessing(teachers);


    }

}
