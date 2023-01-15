package class9;

public class ArraysDemo4 {
    public static void main(String[] args) {

        int number = 10;


        int[] numbers = new int[5]; // an empty array of size 5 will be created

        numbers[0]=50;
        numbers[1]=30;
        numbers[2]=55;
        numbers[3]=60;
        numbers[4]=52;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
