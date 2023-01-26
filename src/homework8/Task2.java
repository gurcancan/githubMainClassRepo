package homework8;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Task2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters,
        // numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284)
        // characters are there in the String.

        String str = "asdad234234fdgdfgASDASFA456456&*^(%$%&#$^";
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                count1++;
            }
        }
        System.out.println(count1);
    }
}
