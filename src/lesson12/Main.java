package lesson12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      Client client1 = new Client("Ivan", "Petrov");
      Client client2 = new Client("Bob", "GG");
      Client client3 = new Client("Nick", "DD");

      SAvingAccount account1 = Manager.openaccount(client1,"USD", 100.15);

        System.out.println(client1.getLastName());
        System.out.println();

      SAvingAccount account2 = Manager.openaccount(client2, "USD", 200.15);
      SAvingAccount account3 = Manager.openaccount(client3, "USD", 300);

        System.out.println();

        ArrayList<SAvingAccount> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);


        Manager.printAccout(accounts);
        Manager.deposit(client1, 234.67, accounts) ;
        Manager.printAccout(accounts);

        Manager.withdrawal(client1, 180, accounts);
        Manager.printAccout(accounts);



    }
}
