package homework4;

public class Task5 {
    public static void main(String[] args) {

        int[] numbers={10,15,20,100,150};
        int sum=0;
        for (int i = 0; i <5; i++) {
            System.out.print(numbers[i]+"+");
            sum=sum+numbers[i];
        }
        System.out.print("=");
        System.out.print(sum);

    }
}
