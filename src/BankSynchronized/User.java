package BankSynchronized;

public class User{

    public int wallet;
    public Bank bank;

    public User(Bank bank) {
        this.wallet =0;
        this.bank = bank;
    }

    public void requestWithDraw(int quantity){

        if(bank.reserves>0 && quantity <= bank.reserves ){
            bank.reserves -= quantity;
            wallet += quantity;
        }
        System.out.println("Bank reserves are: "  + bank.reserves);
    }
}
