package homework13;

public class Task2 {
    static void method(String str1){
        System.out.println("Method with one String "+str1);
    }
    static void method(String str1, String str2){
        System.out.println("Method with two String "+str1+" "+str2);
    }
    static void method(String str1, String str2, String str3){
        System.out.println("Method with three String "+str1+" "+str2+" "+str3);
    }

    public static void main(String[] args) {
        method("java");
        method("love","java");
        method("I","love","java");
    }
}
