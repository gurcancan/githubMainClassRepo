package class15;

public class MethodPractice {
    //crate a method which returns true or false and takes the int numbers as
    // a parameter if number is even it returns true otherwise it returns false


    // first way
    boolean isEven(int number){
        boolean flag;
        if (number%2==0){
            flag=true;
        }else {
            flag=false;
        }
        return flag;
    }

    //second way
    boolean isEven1(int number){
        if (number%2==0){
            return true;
        }else {
            return false;
        }
    }
}
