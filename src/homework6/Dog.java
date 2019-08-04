package homework6;

public class Dog {
    private String breed;
    private String name;
    private int age;

    public void voice(){
        System.out.println("Hi! My name is " + name + "I'm " + age + " and I'm " + breed);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

}
