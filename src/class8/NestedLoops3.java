package class8;

public class NestedLoops3 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }

        for (int i = 0; i < 5; i++){
            if (i==1||i==2||i==3){
                System.out.print(" O");
                for (int k = 0; k < 3; k++) {
                    System.out.print("    ");
                }
                System.out.println("O");
                continue;
            }
            for (int j = 0; j < 5; j++) {
                System.out.print(" O ");
            } System.out.println();


        }



    }
}
