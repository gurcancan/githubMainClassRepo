package homework5;

import java.util.Arrays;

public class Task9MaxMinNumbers {
    public static void main(String[] args) {

        int[] numbers={2,3,14,55,23,33,7};

        System.out.println(Arrays.toString(numbers));

        int maxNumber=numbers[0];
        int minNumber=numbers[6];

        for (int i = 0; i < 7; i++) {
            if (numbers[i]>maxNumber){
                maxNumber=numbers[i];
            }
        }
        System.out.println("Max Number is "+maxNumber);
        for (int i = 0; i < 7; i++) {
            if (numbers[i]<minNumber){
                minNumber=numbers[i];
            }
        }
        System.out.println("Min Number is "+minNumber);
    }
}
