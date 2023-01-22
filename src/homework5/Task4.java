package homework5;

public class Task4 {
    public static void main(String[] args) {
// print out only even numbers

        int[][] num = {{20, 33, 45}, {12, 22, 15}, {66, 55, 41}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j]%2==0){
                    System.out.print(num[i][j]+" ");
                }
            }
        }
    }
}
