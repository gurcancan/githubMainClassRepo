package class9;

public class ArraysDemo {
    public static void main(String[] args) {


        String [] names={"Slave","Safi","Jason","Nabi","Anees","Joseph"};

        System.out.println(names[0]);
        System.out.println(names[4]);
        //System.out.println(names[500]); error because there is no name on index 500
        //System.out.println(names[-4]);  error because index can't be negative
        System.out.println("******************");
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
