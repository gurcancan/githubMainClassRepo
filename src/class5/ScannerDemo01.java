package class5;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pleas Enter Your Age ");
        int age = scan.nextInt();
        System.out.println("You Are " + age + " Years Old");

        System.out.println("Please Enter Your Weight ");
        double weight= scan.nextDouble();
        System.out.println("Your Weight is "+weight+" kg");

        System.out.println("Are You Hungry ");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);

        System.out.println("Please Enter Your Gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your Gender is "+gender);

        System.out.println("Please Enter Your Name");
        String name = scan.next();
        System.out.println("Your Name is " + name);

        scan.nextLine();
        System.out.println("Please Enter Your Full Name");
        String fullName = scan.nextLine();
        System.out.println("Your Full Name is " + fullName);
        scan.close();




    }
}
