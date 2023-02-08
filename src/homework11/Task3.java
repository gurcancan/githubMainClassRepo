package homework11;

public class Task3 {
    /*
    Write a java class that have 4 constructors with 4 different access
    levels of constructors(private,public,default,protected) and
    create 4 objects of this class: 1 - inside same class;
    2 - from outside the class; 3 - from different class inside different
    package  and observe result.
     */
    private Task3(){
        System.out.println("Constructor without any parameters");
    }
    Task3(String name){
        System.out.println("Constructor with a String as parameter");
    }
    protected Task3(int number){
        System.out.println("Constructor with an int as parameter");
    }
    public Task3(char c){
        System.out.println("Constructor with a char as parameter");
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        Task3 task31=new Task3("Java");
        Task3 task32=new Task3(30);
        Task3 task33=new Task3('G');
    }
}
