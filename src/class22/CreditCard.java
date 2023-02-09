package class22;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
    int balance = 2500;
    int interest = 3;

    void calculate() {
        System.out.println((balance / 100) * interest);
    }
}
class  Visa extends CreditCard{

}
class AMEX extends CreditCard{
    int balance=3000;
    void calculate(){
        System.out.println((balance/100)*interest);
    }
}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.calculate();
        Visa visa=new Visa();
        visa.calculate();
        AMEX amex=new AMEX();
        amex.calculate();
    }
}
