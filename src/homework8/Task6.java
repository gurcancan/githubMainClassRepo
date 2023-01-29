package homework8;

public class Task6 {
    //How would you swap  2 strings without a temporary variable?
    public static void main(String[] args) {

        String str1="Hello World";
        String str2="Bye Bye World";
        System.out.println(str1+" & "+str2);

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println(str1+" and "+str2);

    }
}
