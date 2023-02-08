package class19;

public class Task2 {
    /*
    Write Book class that will have instance variables and 2 constructors.
    While creating an object make sure: instance variables are being initialized
    both constructors are being executed
     */
    String name;
    int classNum;
    String subject;

    Task2(String name, int classNum){
        this.name=name;
        this.classNum=classNum;
    }
    Task2(String name, int classNum, String subject){
        this(name, classNum);
        this.subject=subject;
    }
    void print(){
        System.out.println("Class Name : "+name);
        System.out.println("Class Number : "+classNum);
        System.out.println("Class Subject : "+subject);
    }

    public static void main(String[] args) {
        Task2 bookClass=new Task2("java",15);
        bookClass.print();

        Task2 bookClass1=new Task2("Java",16,"This");
        bookClass1.print();

        new StringBuilder();
        new StringBuilder("hello");
    }
}
