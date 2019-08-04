package lesson7;

public class Main {
    public static void main(String[] args) {

       Client client1 = new Client("Slava", "Popo", 25, true);
       Client client2 = new Client ("John", "Snow", 27, false);
       Client client3 = new Client("Jemes", "Smith", 15, true);

        int age1 = client1.getAge();

        boolean id1 = client1.getId();
        String firstname1 = client1.getFirstname();
        String lastname1 = client1.getLastname();


        Admin admin1 = new Admin();
        admin1.verification(age1, id1,lastname1, firstname1);

        int age2 = client2.getAge();
        boolean id2 = client2.getId();
        String firstname2 = client2.getFirstname();
        String lastname2 = client2.getLastname();
        admin1.verification(age2, id2, firstname2, lastname2);

        int age3 = client3.getAge();
        boolean id3 = client3.getId();
        String firstname3 = client3.getFirstname();
        String lastname3 = client3.getLastname();
        admin1.verification(age3, id3, lastname3, firstname3);




        }




    }

