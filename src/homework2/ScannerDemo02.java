package homework2;

import java.util.Scanner;

public class ScannerDemo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Temperature : ");
        int temperature = input.nextInt();

        if (temperature >= 70) {
            System.out.println("The Room Temperature Is Fine");
        } else {
            System.out.println("The Room Temperature Is Low");
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter New Temperature : ");
            int temperature2 = input2.nextInt();
            if (temperature2 >= 70) {
                System.out.println("The Room Temperature Is Fine");
            }
        }
    }
}
