package BankSynchronized;

import java.util.ArrayList;

public class Bank {




    int reserves = 1000;
    ArrayList<User> usersList = new ArrayList<>();


    public Bank() {
    }


    public static void main(String[] args) {


        Bank bank = new Bank();
        User user1 = new User(bank);
        User user2 = new User(bank);

        bank.usersList.add(user1);
        bank.usersList.add(user2);

        Runnable myRunnable = () ->{
            user1.requestWithDraw(900);
        };

        Runnable myRunnble2 = () -> {
            user2.requestWithDraw(900);
        };

        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnble2);

        t1.start();
        t2.start();



    }
}
