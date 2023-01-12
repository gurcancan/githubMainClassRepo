package class4;

public class NestedIfDemo7 {
    public static void main(String[] args) {

        boolean studyHard = true;
        int salary = 12000;

        if (studyHard) {

            System.out.println("We get the jobs");

            if (salary > 100000) {
                System.out.println("We want to buy Tesla");
            } else {
                System.out.println("Lets buy toyota");
            }


        } else {
            System.out.println("It might take a little longer for us to get the jobs");
        }

    }
}
