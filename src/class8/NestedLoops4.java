package class8;

public class NestedLoops4 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            if (i==2){
                for (int j = 2; j < 6; j++) {
                    System.out.print(j+" ");
                }
            } else if (i==1) {
                for (int j = 1; j < 6; j++) {
                    System.out.print(j+" ");
                }
            }else {
                for (int j = 0; j < 6; j++) {
                    System.out.print(j+" ");
                }
        }
            System.out.println();
        }

        System.out.println("*************");

        for (int i = 0; i < 3; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
