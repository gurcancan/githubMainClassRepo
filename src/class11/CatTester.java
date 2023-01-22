package class11;

public class CatTester {
    public static void main(String[] args) {

        Cat cat1= new Cat();
        Cat cat2= new Cat();
        Cat cat3= new Cat();
        cat1.eat();
        cat1.name="lego";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.color="Grey";
        cat1.attitude=false;

        cat2.name="Cedric";
        cat2.color="White";
        cat2.age=1;
        cat2.breed="Domestic";
        cat2.sleep();
    }
}
