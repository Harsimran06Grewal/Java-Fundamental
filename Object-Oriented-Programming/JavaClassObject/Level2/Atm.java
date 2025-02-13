package Level2;

class BankAccount{
    //Attributes
    String accountHolder;
    long accountNumber;
    int balance;

    //Constructor
    BankAccount(String accountHolder, long accountNumber, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //method to print deposited money
    void deposit(int money){
        balance += money;
        System.out.println("money deposited: " + money);
    }

    //method to withdraw money
    void withDraw(int amount){
        if(balance > amount){
            balance -= amount;;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    //method to print current balance
    void cuurentBalance(){
        System.out.println("current balance is: " + balance);
    }

}

public class Atm{
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Simran", 45678, 34560);

        bank.deposit(4000);
        bank.withDraw(3000);
        bank.cuurentBalance();
    }
}
