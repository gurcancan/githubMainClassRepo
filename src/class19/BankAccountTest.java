package class19;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bank=new BankAccount();
        bank.accountNumber= 1232123213456456l;
        bank.money=1000;
        bank.deposit();

        System.out.println(bank.accountNumber);
        System.out.println(bank.money);

        System.out.println("--- Creating an Object of Checking Account");

        Checking check=new Checking();
        check.accountNumber=12321231232131l;
        check.money=780;
        check.interest=0;

        check.deposit();
        check.transfer();

        System.out.println("-- Creating on Object of Saving Account");

        Saving save=new Saving();
        save.accountNumber=123423422323l;
        save.money=7423;
        save.profit=100;

        save.deposit();
        save.takeProfit();

    }
}
