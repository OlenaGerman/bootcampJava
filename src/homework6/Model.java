package homework6;

public class Model {
    private String name;
    private String lastName;
    private String sex;
    private int height;

    public Model(String sex, int height){
        this.sex = sex;
        this.height = height;

    }

    public String getSex(){
        return sex;
    }

    public int getHeight(){
        return  height;
    }

    public String getName() {
        return name;
    }

}
