package class12;

public class StringDemo11Substring {
    public static void main(String[] args) {

        // it gives us the characters starting 5th character
        String str="Send it to support channel";
        String newStr=str.substring(5);
        System.out.println(newStr);

        //we specified starting character and ending character
        System.out.println(str.substring(11,str.length()));
    }
}
