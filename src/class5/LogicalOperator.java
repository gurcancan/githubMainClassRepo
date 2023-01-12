package class5;

public class LogicalOperator {
    public static void main(String[] args) {

        if (10 > 5 || 4 > 6) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }

        String name = "Adam";
        int age = 30;
        if (name.equals("Adam") && age == 30) {
            System.out.println("You are the Adam From Batch 13");
        } else {
            System.out.println("I don't know you");
        }

        boolean isTrue = false;
        if (!isTrue) {
            System.out.println("You got it");
        } else {
            System.out.println("Need more practice");
        }
    }
}
