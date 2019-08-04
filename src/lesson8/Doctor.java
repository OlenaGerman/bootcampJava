package lesson8;

public class Doctor {
//    public void tests(int age, int weight) {
//        if(age > 3 && weight > 10) {
//            System.out.println("Go take a shot");
//        } else {
//            System.out.println("Not needed yet");
//        }


        public void tests(Enimals eni) {
            if(eni.getAge() > 3 && eni.getWeight() > 10) {
                System.out.println("Go take a shot");
            } else {
                System.out.println("Not needed yet");
            }

    }



}
