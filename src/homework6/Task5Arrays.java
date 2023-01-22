package homework6;

import java.util.Arrays;

public class Task5Arrays {
    public static void main(String[] args) {

        String[][] grocery = {{"veggies", "fruits", "dairy", "sweets"},
                {"tomato", "cucumber", "potato"},
                {"apple", "orange"},
                {"milk", "cheese"},
                {"chocolate", "candy", "ice cream"}};

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j] + " we need ");
                System.out.println(Arrays.toString(grocery[j + 1]));
            }
        }

    }
}
