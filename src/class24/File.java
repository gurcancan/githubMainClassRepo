package class24;

public abstract class File {
    int size;
    File(int size){
        this.size=size;
    }
    abstract void open();
    void edit(){
        System.out.printf("Edit Files");
    }
    void close(){
        System.out.printf("Close Files");
    }
}
class JavaFiles extends File{

    JavaFiles(int size){
        super(size);
    }
    void open(){
        System.out.printf("To open .java you need notepad++");
    }
    void close(){
        System.out.printf("Close java file ");
    }
}
class WordFile extends File{
    WordFile(int size){
        super(size);
    }
    void open(){
        System.out.printf("To open .doc you need Microsoft word");
    }
}
