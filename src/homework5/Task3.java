package homework5;

public class Task3 {
    public static void main(String[] args) {

        int[][] numbers = {{2, 2, 2},
                {3, 3, 3},
                {4, 4, 4}};
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum=sum+numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
