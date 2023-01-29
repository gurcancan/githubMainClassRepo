package class15;

public class MPracticeTester {
    public static void main(String[] args) {

        MPractice3 mp=new MPractice3();
        int [] array={10,20,30};
        System.out.println(mp.arraySum(array));

        System.out.println(mp.arraySum(new int[]{10,10,10}));
    }
}
