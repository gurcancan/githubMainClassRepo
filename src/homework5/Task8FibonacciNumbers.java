package homework5;

public class Task8FibonacciNumbers {
    public static void main(String[] args) {
        // fibonacci numbers, first 10 fibonacci numbers

        int x=0,y=1,z=1;
        System.out.print(x+" "+y+" "+z+" ");

        for (int i = 0; i < 7; i++) {
            x=y+z;
            System.out.print(x+" ");
            y=z;
            z=x;
        }
    }

}
