package homework3;

import java.util.Scanner;

public class NestedIf06 {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 different numbers ");

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The largest number is num1");
            }
        }
        if (num2 > num3) {
            if (num2 > num1) {
                System.out.println("The largest number is num2");
            }
        }
        if (num3 > num1) {
            if (num3 > num1) {
                System.out.println("The largest number is num3");
            }
        }


    }
}
