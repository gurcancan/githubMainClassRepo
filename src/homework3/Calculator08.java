package homework3;

import java.util.Scanner;

public class Calculator08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Two Numbers ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Please Enter Your operator: +,-,*,/ ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }


    }
}
