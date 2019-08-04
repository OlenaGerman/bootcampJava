package homework1;

public class Student {
    private String firstname;
    private String lastname;
    private int age;


    public Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }


    public Student(int age) {
        this.age = age;
    }


    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }





    public void checkout (int n) {
        if (n> 30 && n % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    public void checkout2 (String firstname, String lastname) {
        if (lastname.contains(firstname)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    public void sayWorld () {
        System.out.println("World is mine");
        System.out.println("World is mine");
        System.out.println("World is mine");
        System.out.println("World is mine");
        System.out.println("World is mine");
        System.out.println("World is mine");
        System.out.println("World is mine");
        System.out.println("World is mine");
        System.out.println("World is mine");
        System.out.println("World is mine");
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;

    }

    public void setAge(int age) {
        this.age = age;
    }



}
