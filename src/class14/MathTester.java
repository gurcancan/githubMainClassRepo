package class14;

public class MathTester {
    public static void main(String[] args) {

        Math math=new Math();
        math.add(10,10);
        math.multiply(2,2,2);

        int result=math.sub(100,50);
        System.out.println(result);
    }
}
