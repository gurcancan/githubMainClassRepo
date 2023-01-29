package class15;

public class MPractice4 {
    /*
    create a method that takes two numbers as parameters and return the larger numbers
     */
    // return type => int
    // name => paramaters
    // parameters => int number1, int number2

    int parameters(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {

        MPractice4 mp=new MPractice4();
        System.out.println(mp.parameters(12,13));
    }
}
