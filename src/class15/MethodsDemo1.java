package class15;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num=scanner.nextInt();

        System.out.println("You enter "+ num);

    }

    public static void methods1(){
        int a=0;
        for (int i = 0; i < 5; i++) {
            a+=i;
        }
    }

    String method2(){
        return "Hi Java";
    }
}
