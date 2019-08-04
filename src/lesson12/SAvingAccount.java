package lesson12;

public class SAvingAccount {

    private String name;
    private String curency;
    private double amount;


    public SAvingAccount(String name, String curency, double amount){
         this.name = name;
         this.curency = curency;
         this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurency() {
        return curency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
