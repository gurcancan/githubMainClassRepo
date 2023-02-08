package class19;

public class ThisKeyWord {

    int a, b;

    ThisKeyWord(int a, int b){
        this.a=a;
        this.b=b;
    }
    void sum(int a, int b){
        System.out.println(a+b);
        System.out.println(this.a+this.b);
    }
    void helloBatch15(){
        System.out.println("Hello Batch 15");
    }
    void howAreYou(){
        System.out.println("How Are You ?");
    }
    void greetings(){
        this.helloBatch15();// this keyword refers current method
        this.howAreYou();
    }

    public static void main(String[] args) {

        ThisKeyWord obj=new ThisKeyWord(10,20);
        System.out.println(obj.a);
        obj.sum(100,200);
        obj.greetings();
    }
}
