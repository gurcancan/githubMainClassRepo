package class6;

import java.util.Scanner;

public class LogicalReview1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the Day ");

        String day=input.next();

        if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("friday")) {
            System.out.println("No Class Today");
        } else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
            System.out.println("Java Class Today");
        } else if (day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday")) {
            System.out.println("Manual Testing Class Today");
        } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println("Reviewing Class");
        } else {
            System.out.println("Wrong day Entered");
        }
    }
}
