package homework3;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Height ");
        char height = (char) scanner.nextInt();

        if (height < 60) {
            System.out.println("You are short");
        }else if (height >= 60 & height <= 72) {
            System.out.println("You are medium");
        }else if (height > 72) {
            System.out.println("You are tall");
        }
    }
}
