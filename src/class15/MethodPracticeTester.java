package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {


        MethodPractice mp = new MethodPractice();
        boolean isEven = mp.isEven(15);
        System.out.println(isEven);
        boolean isEven1 = mp.isEven1(100);
        System.out.println(isEven1);
        boolean isEvent2 = mp.isEven(45);
        System.out.println(isEvent2);
        System.out.println(mp.isEven(34));
    }

}
