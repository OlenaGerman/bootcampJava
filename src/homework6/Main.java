package homework6;

public class Main {
    public static void main(String[] args) {
        Model model1 = new Model("female", 185);
        Model model2 = new Model("female", 180);
        Model model3 = new Model("male", 183);
        Model model4 = new Model("male", 190);


        Admin admin = new Admin();
        admin.casting(model1);
        admin.casting(model2);
        admin.casting(model3);
        admin.casting(model4);




    }
}
