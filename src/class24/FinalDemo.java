package class24;

public class FinalDemo {
    public static void main(String[] args) {
        final int num; // we have created a constant variable
        num=20;
        //num=30; we can't assign it because it already assigned.
    }
    final void noOneShouldOverrideIt(){
        System.out.println("This method should never be overridden otherwise it might break the code base");

    }
}
class Nelson extends FinalDemo{
    //void noOneShouldOverrideIt(){
    //    System.out.println("Let me do");
   // }
}
