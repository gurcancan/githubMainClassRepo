package homework6;

public class Task1PhoneTester {
    public static void main(String[] args) {

        Task1Phone iphone=new Task1Phone();
        Task1Phone pixel=new Task1Phone();
        Task1Phone samsung=new Task1Phone();

        System.out.println("Iphone*****");

        iphone.color="blue";
        iphone.name="iphone 13";
        iphone.price=1000;
        iphone.size=16;
        iphone.waterProof=true;
        iphone.camera();
        iphone.music();
        iphone.signal();

        System.out.println("Pixel*****");

        pixel.color="black";
        pixel.size=12;
        pixel.waterProof=true;
        pixel.music();
        pixel.signal();

        System.out.println("Samsung*****");

        samsung.color="grey";
        samsung.price=1200;
        samsung.camera();
    }
}
