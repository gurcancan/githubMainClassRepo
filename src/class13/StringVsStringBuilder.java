package class13;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        String str = "";
        for (int i = 0; i < 1000; i++) {
            str = str + i;
        }
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            str1.append(i);
        }
    }
}
