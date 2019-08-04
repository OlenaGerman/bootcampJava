package homework1;

public class Teacher {
    private String name;
    private String lastName;
    private String job;
    private int salary;

    public Teacher(String name, String lastName, String job, int salary) {
        this.lastName = lastName;
        this.name = name;
        this.job = job;
        this.salary = salary;

    }

    public Teacher(String job, int salary){
        this.job = job;
        this.salary = salary;

    }

    public void setName(String name) {
        this.name = name;

    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName(String name) {
        return name;
    }

    public String getLastName(String lastName) {
        return lastName;

    }

    public String getJob(String job) {
        return job;

    }

    public int getSalary(int salary) {
        return salary;
    }

//    public void intro() {
//        System.out.println("My name is " + name + lastName, " I teach the " + job + " with the " + salary + "per month");

    }














