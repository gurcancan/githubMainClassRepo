package class24;

public abstract class File {
    int size;
    File(int size){
        this.size=size;
    }
    abstract void open();
    void edit(){
        System.out.println("Edit Files");
    }
    void close(){
        System.out.println("Close Files");
    }
}
class JavaFiles extends File{

    JavaFiles(int size){
        super(size);
    }
    void open(){
        System.out.println("To open .java you need notepad++");
    }
    void close(){
        System.out.println("Close java file ");
    }
}
class WordFile extends File{
    WordFile(int size){
        super(size);
    }
    void open(){
        System.out.println("To open .doc you need Microsoft word");
    }
}
