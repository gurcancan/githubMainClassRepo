package class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=75;

       /* while (summer){
            if (temp<=100){
                System.out.println("I love summer");
            }else {
                System.out.println("Its very hot");
                break;
            }
            temp+=5;
        }*/

        System.out.println("********");

        while (summer) {
            if (temp <= 100) {
                System.out.println("I love summer");
            } else {
                summer = false;
                System.out.println("Its Hot");
            }
            temp+=5;
        }
    }
}
