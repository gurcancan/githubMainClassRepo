package class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};

        for (int x:arr){
            if (x%2!=0){
                x=0;
            }
        }
    }
}
