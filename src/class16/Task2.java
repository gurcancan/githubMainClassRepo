package class16;

public class Task2 {
    /*
    Create a method that will take a number and prints
     whether the number is even or odd.

     return type => int
     name => isEven
     parameters => int number
     {
     }
     */

    void isEven(int number){
        if(number%2==0){
            System.out.println(number+" is even");
        }else {
            System.out.println(number+" is Not even");
        }
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        task2.isEven(40);
    }
}
