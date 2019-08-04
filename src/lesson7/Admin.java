package lesson7;

public class Admin {
    public void verification(int age, boolean id, String firstname, String lastname) {
        if(id == true && age < 16){
            System.out.println("Welcome " +  firstname  + lastname);
        } else {
            System.out.println("Go home " +  firstname  + lastname);
        }
    }

}
