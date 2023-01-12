package class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int number1, number2, number3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 3 Numbers");
        number1 = scan.nextInt();
        number2 = scan.nextInt();
        number3 = scan.nextInt();

        if (number1>number2){
            if (number1>number3){
                System.out.println("Number1 is the largest "+number1);
            }
        }

        if (number2>number1){
            if (number2>number3){
                System.out.println("Number2 is the largest "+number2);
            }
        }

        if (number3>number1){
            if (number3>number2){
                System.out.println("Number3 is the largest "+number3);
            }
        }
    }
}
