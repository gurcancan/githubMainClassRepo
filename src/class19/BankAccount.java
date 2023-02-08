package class19;

public class BankAccount {
    long accountNumber;
    double money;

    void deposit(){
        System.out.println("Deposit methods from Bank account class");
    }
}

class Checking extends BankAccount{ //child class or subclass or derived class

    double interest;

    void transfer(){
        System.out.println("Transfer methods from checking class");
    }
}

class Saving extends BankAccount{
    double profit;

    void takeProfit(){
        System.out.println("Profit method from Saving class");
    }
}
