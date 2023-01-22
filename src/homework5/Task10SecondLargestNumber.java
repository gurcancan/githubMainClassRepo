package homework5;

public class Task10SecondLargestNumber {
    public static void main(String[] args) {

        int[] numbers={2,3,14,55,23,33,7};

        int maxNumber=numbers[0];

        for (int i = 0; i < 7; i++) {
            if (numbers[i]>maxNumber){
                maxNumber=numbers[i];
            }
        }
        System.out.println("Max Number is "+maxNumber);

        int secondMaxNumber=numbers[0];
        for (int i = 0; i <7; i++) {
            if (numbers[i]<maxNumber&&numbers[i]>secondMaxNumber){
                secondMaxNumber=numbers[i];
            }
        }
        System.out.println("Second Max Number is "+secondMaxNumber);
    }
}
