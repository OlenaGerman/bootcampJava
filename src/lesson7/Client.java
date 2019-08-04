package lesson7;

import java.util.IdentityHashMap;

public class Client {
    private String firstname;
    private String lastname;
    private int age;
    private boolean id;

    public Client(String firstname, String lastname, int age, boolean id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.id = id;

    }

    public int getAge() {
        return age;
    }

    public boolean getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;

    }

    public String getLastname() {
        return lastname;

    }




}
