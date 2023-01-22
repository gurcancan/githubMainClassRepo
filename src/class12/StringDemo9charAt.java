package class12;

public class StringDemo9charAt {
    public static void main(String[] args) {

        String str="asdasd 3242342 >^*^%";

        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
