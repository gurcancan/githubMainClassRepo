package homework2;

public class IfElseDemo02 {
    public static void main(String[] args) {
        int temperature = 20;
        if (temperature >= 60) {
            System.out.println("The Weather Is Hot");
        } else if (temperature >= 30) {
            System.out.println("The Weather Is Cold");
        } else if (temperature <= 30) {
            System.out.println("The Weather Is Soo Cold");
        }
    }
}
