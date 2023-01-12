package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computers memory
        we are calling it box1 if we need the information that we are storing inside
        this box we can simply say to the computer give us the contents of box 1.
        int=> what type of data we want to store
        box1=> is the name of the box
        = sing will take whatever we write after it and will store it inside the box1
        10=> is what we are storing inside the box
         */
        int box1=10;
        // if we are printing something from a box we don't need""
        System.out.println(box1);
        // bring the contents of box1 and print them on the console
        /*To store whole numbers(Numbers without decimals points) we have 4 different
        types of boxes, for example number like 10 20 3000 1000000 33000000
        1) byte 2) short 3) int 4) long
         */
        byte box2=127; // range for byte is from -128 to 127 if we need to store larger numbers we should try short
        byte box3=-128;
        short box4=32767; // range for short is from -32768 to 32767
        int biggerBox=1234567890; // most common type of box is int
        long maxBox=1231242341435525232l;
        /* Reserve a box which can data the number 10000 call it myBox and print its
         */
        short myBox=10000;
        System.out.println(myBox);


    }
}
