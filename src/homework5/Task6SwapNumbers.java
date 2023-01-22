package homework5;

public class Task6SwapNumbers {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.println("a= "+a);
        System.out.println("b= "+b);

        System.out.println("*************");

        a=a+b; // a=10+20 --> a=30
        b=a-b; // b=30-20 --> b=10
        a=a-b; // a=30-10 --> a=20

        System.out.println("a= "+a);
        System.out.println("b= "+b);

    }
}
