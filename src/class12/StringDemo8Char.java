package class12;

public class StringDemo8Char {
    public static void main(String[] args) {

        String str="Java is love";
        char c=str.charAt(2);
        System.out.println(c);

        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            counter++;
        }
        System.out.println();
        System.out.println(counter);

        int counter2=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                counter2++;
            }
        }
        System.out.println("There are "+counter2+" a");
    }
}
