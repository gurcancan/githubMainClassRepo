package homework5;

public class Task5 {
    public static void main(String[] args) {

        int[][] numbers = {{11, 12, 13, 14}, {15, 16, 17}, {18, 19, 20}};

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    evenSum = evenSum + numbers[i][j];
                } else {
                    oddSum = oddSum + numbers[i][j];
                }
            }
        }
        System.out.println("even number sum= " + evenSum);
        System.out.println("odd numbers sum= " + oddSum);
    }
}
