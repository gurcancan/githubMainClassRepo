package homework3;

import java.util.List;
import java.util.Scanner;

public class ScannerMonth04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your BirthMonth ");

        String month = input.nextLine();

        if (List.of("january", "february", "december").contains(month)) {
            System.out.println("You were born in winter");
        } else if (month.equals("march") || month.equals("april") || month.equals("may")) {
            System.out.println("You were born in spring");
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            System.out.println("You were born in summer");
        } else if (month.equals("september") || month.equals("october") || month.equals("november")) {
            System.out.println("You were born in fall");
        }
    }
}
