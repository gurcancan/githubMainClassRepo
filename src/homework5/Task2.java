package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 Countries");
        String [] countries=new String[3];
        String [] capitols=new String[3];

        for (int i = 0; i < countries.length; i++) {
            countries[i]=scanner.next();
        }
        System.out.println("Please Enter 3 capitols");
        for (int i = 0; i < capitols.length; i++) {
            capitols[i]=scanner.next();
        }
        System.out.println(Arrays.toString(countries));
        System.out.println(Arrays.toString(capitols));
    }
}
