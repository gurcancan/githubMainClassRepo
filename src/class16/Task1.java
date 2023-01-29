package class16;

public class Task1 {
    /*
    Create a method
    that will take 2 parameters as a numbers and prints which number is larger.
     */
    /*
    return type => int
    name => isLarger
    parameter => int number1 , int number2
     */

    String  isLarger(int number1, int number2){
        if (number1>number2){
            return "Number1 is Larger";
        }else {
            return "Number2 is Larger";
        }
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        System.out.println(task1.isLarger(10,20));
    }
}
