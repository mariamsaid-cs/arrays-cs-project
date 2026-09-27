package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions = new double[1000];
    int countTrans = 0;

    public BankAccount(String name, int startingBalance){
        this.name = name;
        this.currentBalance = startingBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            currentBalance += amount;
            transactions[countTrans] = amount;
            countTrans++;
            System.out.println(this.name + " : " + amount);
        }else {
            System.out.println("Unsuccessful deposit");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= currentBalance){
            currentBalance -= amount;
            transactions[countTrans] = -1 * amount;
            countTrans++;
        }else {
            System.out.println("Unsuccessful withdrawal");
        }
    }

    public void displayTransactions(){
        for(double amount : transactions){
            if(amount > 0){
                System.out.println("deposit : " + amount);
            }else {
                System.out.println("withdrawal : " + -1 * amount);
            }
            System.out.println("\n");
        }
    }

    public void displayBalance(){
        System.out.println("current balance : " + currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
