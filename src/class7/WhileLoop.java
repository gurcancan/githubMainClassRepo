package class7;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number=0;

        while (number!=5){
            System.out.println("Please Enter a number");
            number=scanner.nextInt();
        }
    }
}
