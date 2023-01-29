package class16;

public class Task5 {
    //Write a method to return whether given number is prime or not?
    /*
    return type => boolean
    name => isPrime
    parameter => int number
    {
    }
     */

    boolean isPrime(int number){
        boolean flag=true;
        if (number>1){
            for (int i = 2; i < number; i++) {
                if (number%i==0){
                    flag=false;
                    break;
                }
            }
        }else {
            flag=false;
        }
        System.out.println("Number "+number+" is a prime "+flag);
        return flag;
    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        task5.isPrime(5);
        //we can do system.out.println(task.isPrime(5));  to print 'true'
    }

}
