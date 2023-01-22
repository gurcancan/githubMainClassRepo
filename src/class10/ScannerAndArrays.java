package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 5 Numbers");
        int[] numbers=new int[5];
/*
        numbers[0]=40;
        numbers[1]=50;
        numbers[2]=60;
        numbers[3]=70;
        numbers[4]=80;
*//*
        numbers[0]=scanner.nextInt();
        numbers[1]=scanner.nextInt();
        numbers[2]=scanner.nextInt();
        numbers[3]=scanner.nextInt();
        numbers[4]=scanner.nextInt();
*/
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= scanner.nextInt();
        }


        System.out.println(Arrays.toString(numbers));
    }
}
