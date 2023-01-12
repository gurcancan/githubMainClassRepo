package homework3;

import java.util.Scanner;

public class SwitchCase07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Country ");
        String country = input.next();

        switch (country) {
            case "Turkiye":
                System.out.println("Your language is Turkish");
                break;
            case "Germany":
                System.out.println("Your language is German");
                break;
            case "French":
                System.out.println("Your language is French");
                break;
            case "USA":
                System.out.println("Your language is English");
                break;
            case "Italy":
                System.out.println("Your language is Italian");
                break;
        }


    }

}
