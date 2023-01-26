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
        System.out.println();
        System.out.println("************");
        //short way to do same
        String dadsName = "Gurcan";
        String momsName = "Asli";
        String babySex = "Boy";
        String firstHalf;
        String secondHalf;

        if (babySex.equalsIgnoreCase("boy")) {
            firstHalf = dadsName.substring(0, dadsName.length() / 2);
            secondHalf = momsName.substring(momsName.length() / 2, momsName.length());
            System.out.println(firstHalf + secondHalf);
        } else {
            firstHalf = momsName.substring(0, momsName.length() / 2);
            secondHalf = dadsName.substring(dadsName.length() / 2, dadsName.length());
            System.out.println(firstHalf + secondHalf);
        }
    }
}
