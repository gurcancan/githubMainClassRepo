package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        /*
        if the score in all the subject are greater than 90 print brilliant student
        otherwise print you need to study hard
         */

        double math=92.5;
        double history=91.5;
        double science=93.5;

      /*  if (math>90.0){
            if (history>90.0){
                if (science>90.0){
                    System.out.println("you are a brilliant student");
                }
            }
        }else {
            System.out.println("you need to study hard");
        }*/

        if (math>90&&history>90&&science>90){
            System.out.println("you are a brilliant student");
        }else {
            System.out.println("you need to study hard");
        }

    }
}
