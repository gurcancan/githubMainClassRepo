package homework10;

public class Task3 {
    /*
    Create a method that will accept a String as a parameter and
    return a new String that consist only of vowels.
    Method should be available inside the class only
    where it was declared and executed by calling it is name.
     */
    /*
    return type => String
    name => getOnlyVowels
    parameter => String inputStr
     */
    public static void main(String[] args) {
        System.out.println(getOnlyVowels("Gurcan"));
    }

    private static String getOnlyVowels(String inputStr){
        return inputStr.replaceAll("[^AEIOUYaeiouy]","");
    }
}
