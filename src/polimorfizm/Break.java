package polimorfizm;

public class Break extends Dancer {

    public Break(String firstname, String lastname){
        super(firstname, lastname);
    }


    @Override
    public void dancing(){
        System.out.println("I can dance break");
    }

}
