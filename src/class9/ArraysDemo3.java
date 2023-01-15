package class9;

public class ArraysDemo3 {
    public static void main(String[] args) {

        char [] letters={'A','B','c','d','e','F'};
        letters[0]='a'; // updating the element at index 0
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

    }
}
