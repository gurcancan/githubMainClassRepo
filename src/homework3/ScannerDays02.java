package homework3;

import java.util.Scanner;

public class ScannerDays02 {
    public static void main(String[] args) {
        System.out.println("Today's Number Is ");
        Scanner input = new Scanner(System.in);

        int day = input.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("It is a weekday");
        } else if (day >= 6 & day <= 7) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid day");
        }
    }
}
