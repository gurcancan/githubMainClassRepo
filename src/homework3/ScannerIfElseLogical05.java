package homework3;

import java.util.Scanner;

public class ScannerIfElseLogical05 {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers ");

        System.out.println("First number :");
        num1 = scanner.nextDouble();
        System.out.println("Second number :");
        num2 = scanner.nextDouble();
        System.out.println("Third number :");
        num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("First number is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second number is greater");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Third number is greater");
        }


    }
}
