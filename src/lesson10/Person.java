package lesson10;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age) {

        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
