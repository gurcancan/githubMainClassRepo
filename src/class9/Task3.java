package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number");
        int start = scanner.nextInt();
        System.out.println("Enter ending number");
        int end = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of the even numbers " + evenSum);
        System.out.println("Sum of the odd numbers " + oddSum);
    }
}
