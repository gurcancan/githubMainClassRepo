package class9;

public class ArraysTask1 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            if (i%2==0){
                sum=sum+numbers[i];
            }
        }
        System.out.println(sum);
    }
}
