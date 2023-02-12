package class23;

public class Task1 {
    /*
    Create a class CreditCard and define variable balance and interest.
     Create an instance method that will calculate
    Create 2 subclasses: Visa and AX. In Ax class override method calculate interest.
    Call the method by creating and object of each of the classes.
     */
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100,10);
        creditCard.calculateInterest();
        Vise vise=new Vise(100,10);
        vise.calculateInterest();
        AX ax=new AX(100,10);
        ax.calculateInterest();
    }
}

class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        System.out.println("Interest " + (balance * interest) / 100);
    }
}

class Vise extends CreditCard {

    public Vise(double balance, double interest) { // Matching constructor must be in a child class
        super(balance, interest);
    }
}

class AX extends CreditCard {

    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest " + (balance * interest / 100) + 30);

    }
}

