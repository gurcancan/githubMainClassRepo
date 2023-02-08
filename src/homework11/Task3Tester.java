package homework11;

public class Task3Tester {
    public static void main(String[] args) {

       // Task3 task3=new Task3();// private that why it give error
        Task3 task31=new Task3("Java"); //default so it is fine in same class and package
        Task3 task32=new Task3(30); // protected so we can reach from outside the package but only inheritance
        Task3 task33=new Task3('G'); // public so we can reach from anywhere/
    }
}
