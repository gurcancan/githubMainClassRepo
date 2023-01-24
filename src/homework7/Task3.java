package homework7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Write a program that reads two people's first names and if they're
        //expecting boy or girl? Based on the input suggests a number for a baby.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Father's first name :");
        String dad = scanner.next();
        System.out.print("Please Enter Mother's first name :");
        String mom = scanner.next();

        System.out.print("Please choose 'B' for boy or 'G' for girl ");
        String baby = scanner.next();

        boolean boy = baby.equalsIgnoreCase("B");
        if (boy) {
            System.out.print("Baby is a boy and his name is :");
            for (int i = 0; i < dad.length() / 2; i++) {
                System.out.print(dad.charAt(i));
            }
            for (int i = mom.length() / 2; i < mom.length(); i++) {
                System.out.print(mom.charAt(i));
            }
        } else {
            System.out.print("Baby is a girl and her name is :");
            for (int i = 0; i < mom.length() / 2; i++) {
                System.out.print(mom.charAt(i));
            }
            for (int i = dad.length() / 2; i < dad.length(); i++) {
                System.out.print(dad.charAt(i));
            }
        }
    }
}
