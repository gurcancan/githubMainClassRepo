package homework13;

public class Task3 {
    private void method(String str1){
        System.out.println("Method with one String "+str1);
    }
    private void method(String str1, String str2){
        System.out.println("Method with two String "+str1+" "+str2);
    }
    private void method(String str1, String str2, String str3){
        System.out.println("Method with three String "+str1+" "+str2+" "+str3);
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        task3.method("java");
        task3.method("love","java");
        task3.method("I","love","java");
    }
}
