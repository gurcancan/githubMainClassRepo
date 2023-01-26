package class14;

public class MethodsDemo1 {
    public static void main(String[] args) {

        int [] arr={10,20,30,45,50};

        int sum=0;
        for (int number:arr){
            sum+=number;
        }
        System.out.println(sum);

        //System.out.println(Arrays.taString(arr))
        int[] arr2={10,10,10,20,30};

        int sum2=0;
        for (int number:arr2){
            sum2+=number;
        }
        System.out.println(sum2);
    }
}
