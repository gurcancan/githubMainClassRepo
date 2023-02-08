package class19;

public class Donkey {
    String name;

    int age;

    double weight;


    Donkey(String donName, int donAge) {
        this.name=donName;
        this.age=donAge;
    }

        void printOut(){
        System.out.println("Name Of the donkey is "+name+" and age is "+age+" and weight is "+weight);
        }

    public static void main(String[] args) {
       // Donkey donkey=new Donkey(); // Donkey() is a default constructor created by the compiler

        Donkey donkey=new Donkey("Papper",3);// the moment we create a constructor
                                                //compiler does not give any Default constructor.
        donkey.printOut();
    }
}
