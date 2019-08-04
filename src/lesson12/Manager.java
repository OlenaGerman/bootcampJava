package lesson12;

import java.util.ArrayList;

public class Manager {
    public static SAvingAccount openaccount(Client client, String curency, double amount){

        SAvingAccount account = new SAvingAccount(client.getLastName(), curency, amount);
        return account;

    }

    public static void printAccout(ArrayList<SAvingAccount> accounts){
        for (int i = 0; i < accounts.size(); i++){
            System.out.println(accounts.get(i).getName() + " " + accounts.get(i).getAmount() );

        }
    }

    public static void deposit(Client client, double amount, ArrayList<SAvingAccount> accounts){
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getName().equals(client.getLastName())){
                accounts.get(i).setAmount(accounts.get(i).getAmount() + amount);
            }
        }

    }

    public static void withdrawal(Client client, double amount, ArrayList<SAvingAccount> accounts) {
        for (int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getName().equals(client.getLastName())) {
                accounts.get(i).setAmount(accounts.get(i).getAmount() - amount);
            }

            if (accounts.get(i).getAmount() < amount){
                System.out.println(accounts.get(i).getName() + " " + " There is not enogh money");
            }

            }
        }






}
