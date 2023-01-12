package homework2;

import java.util.Scanner;

public class ScannerDemo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Salary : ");
        int salary = input.nextInt();

        if (salary <= 40000) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("How Many Years You Have Been In Your Current Address : ");
            int year = input2.nextInt();
            if (year >= 2) {
                System.out.println("You Are Eligible For Free Health Care");
            } else {
                System.out.println("Try Later!");
            }
        } else {
            System.out.println("You Are Not Eligible!");
        }


    }
}
