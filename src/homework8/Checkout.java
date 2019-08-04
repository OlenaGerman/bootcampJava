package homework8;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Checkout {
    public void selectingName(ArrayList<Student> students){
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName());

        }

    }

    public void selectingLastName(ArrayList<Student> students){
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName()+ " " + students.get(i).getLastName());
        }
    }

    public void selectingGPA(ArrayList<Student> students){
        for (int i = 0; i< students.size(); i++){
            System.out.println(students.get(i).getName() + " " + students.get(i).getLastName() + " "+ students.get(i).getGPA());

        }


    }








}
