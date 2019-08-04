package homework11;

public class Main {
    public static void main(String[] args) {

        Person men1 = new Men("Oleg", "AA", 35, true);
        Person women1 = new Women("Anna", "CC", 33, false);
        Person men2 = new Men("Stas", "BB", 45, true);
        Person women2 = new Women("Lizi", "ZZ", 21, false);
        Person men3 = new Men("Sasha", "DD", 24, false);
        Person women3 = new Women("Lena", "OO", 27, true);

        MarriageLicenes licenes = CityHall.registration(men1, 23/23/23, 1234.56);
        System.out.println(licenes.getFamilyName());

        //new changes








    }








}
