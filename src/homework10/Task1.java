package homework10;

public class Task1 {
    /*
    Create a method that will accept an array as parameters and will return a
    sum of all elements from that array. Method should be visibly only within same
    package and accessible by the creating an instance of the class.
     */
    /*
    return type => int
    name => sum
    parameter => int [] number
    access modifier= default
     */

    int sumArray(int[] number){
        int sum=0;
        for (int num:number){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        int [] arr={10,20,30,11};
        System.out.println(task1.sumArray(arr));
    }
}
