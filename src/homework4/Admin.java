package homework4;

public class Admin {
//    public void selection(int weight, String lastName) {
//        if(weight > 300 || lastName.contains("ov") ) {
//            System.out.println("Welcome to the show");
//        } else {
//            System.out.println("Sorry. Not this time");
//        }
        public void selection(Candidate can) {
            if (can.getWeight() > 300 || can.getLastName().contains("ov")) {
                System.out.println("Welcome to the show");
            } else {
                System.out.println("Sorry. Not this time");
            }

    }

    }
