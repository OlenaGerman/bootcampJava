package homework6;

public class Admin {
    public void casting(Model model) {
        if (model.getSex().equals("male") && model.getHeight() > 185) {
            System.out.println("Welcome to the show" + model.getName());
        } else {
            if (model.getSex().equals("female") && model.getHeight() > 180) {


                System.out.println("Welcome to the next level" + model.getName());
            }

        }


    }







}
