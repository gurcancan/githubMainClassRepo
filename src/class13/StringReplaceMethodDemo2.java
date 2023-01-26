package class13;

public class StringReplaceMethodDemo2 {
    public static void main(String[] args) {

        String str="saSADFSAF87676sdfsf3245124/,/.*&(&*";
        //replaceAll and [A-Z] replace all the uppercase letters between A and Z
        System.out.println(str.replaceAll("[A-Z]","#"));
        //replace lowercase a to z
        System.out.println(str.replaceAll("[a-z]","#"));
        //replace 0 to 9
        System.out.println(str.replaceAll("[0-9]","#"));
        // replace all letters
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        // replace all letters and numbers
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        //do not replace A to Z and do not replace a to z
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
    }
}
