package class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String str="I love java";
        boolean startWith=str.startsWith("I");
        System.out.println(startWith);
        System.out.println(str.endsWith("java"));

        System.out.println(str.toLowerCase().startsWith("i"));
    }
}
