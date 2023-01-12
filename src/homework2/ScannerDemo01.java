package homework2;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre Your Age : ");

        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You Are Eligible To Work");
        } else {
            System.out.println("You Are Not Eligible To Work");
        }
    }
}
