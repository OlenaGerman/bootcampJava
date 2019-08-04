package polimorfizm;

public class Walz extends Dancer {

    public Walz(String firstname, String lastname){
        super(firstname,lastname);

    }


    @Override
    public void dancing(){
        System.out.println("I can dance walz");
    }


}
