package homework6;

public class Task4Cars2DArrays {
    public static void main(String[] args) {

        String[][] cars = {{"American", "German", "Korean", "Italian"},
                {"Ford", "BMW", "Hyundai", "Ferrari"}};

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[1][j] + " is ");
                System.out.println(cars[i][j]);
            }
        }
    }

}
