package class14;

public class Math {
    //write a method that takes 2 int numbers add them and show the results on console

    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void multiply(int num1,int num2, int num3){
        System.out.println(num1*num2*num3);
    }

    //it tells java whenever this method is called
    //what value to return
    int sub(int num1, int num2){
        return num1-num2;
    }
}
