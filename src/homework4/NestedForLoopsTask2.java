package homework4;

public class NestedForLoopsTask2 {
    public static void main(String[] args) {


        for (int j = 0; j < 4; j++) {
            if (j == 0 || j == 3) {
                for (int i = 0; i < 4; i++) {
                    System.out.print("$" + " ");
                }
            } else {
                System.out.print("$" + "     "+ "$");
            }
            System.out.println();
        }

    }
}
