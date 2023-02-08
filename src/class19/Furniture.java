package class19;

public class Furniture {

    String type;

    double price;

    String color;

    //with the help of constructor we can initialize object with specific value
    Furniture(String type,double price,String color){
        this.type=type;
        this.price=price;
        this.color=color;
    }
    /*below is a method with name Furniture. Why - because of return type
     void Furniture(){

    }
     */
    void print(){
        System.out.println(type+" furniture "+price+" price "+color+" color");
    }

    public static void main(String[] args) {
        Furniture furniture=new Furniture("Sofa",100,"Blue");
        furniture.print();

       Furniture furniture1=new Furniture("Table",50,"brown");
        furniture1.print();
    }
}
