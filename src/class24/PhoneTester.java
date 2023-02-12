package class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone[] phones={new Samsung(), new Iphone()};
        for (Phone p:phones){
            p.DisplayPicture();
            p.UnlockPhone();
            p.SendText();
        }
    }
}
