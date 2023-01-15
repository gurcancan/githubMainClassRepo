package class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please Enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the total amount that you have to pay"+totalPrice);
        }
        System.out.println("Please pay for items");
        double amountPaid=scanner.nextDouble();

        if (amountPaid>totalPrice){
            double change=amountPaid-totalPrice;
            System.out.println("Here is your change"+change);
        } else if (amountPaid<totalPrice) {
            System.out.println("You can't buy all the items");
        }
        System.out.println("Thanks for shopping");
    }
}
