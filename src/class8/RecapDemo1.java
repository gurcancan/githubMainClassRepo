package class8;

public class RecapDemo1 {
    public static void main(String[] args) {
        // 10 8 6 4 2

        int i=10;
        while (i>0){
            System.out.println(i);
            i-=2;
        }

        System.out.println("****************");

        int num=10;
        do {
            System.out.println(num);
            num = num - 2;
        }while (num>0);
    }
}
