package class24;

public abstract class File {
    /*Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
     Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc*/
    int size;
    File(int size){
        this.size=size;
    }
    abstract void open();
    void edit(){
        System.out.println("Edit all files");
    }
    void close(){
        System.out.println("Close all files");
    }
}
class JavaFile extends File{

    JavaFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("we need a notepad++ "+size);
    }

    @Override
    void edit() {
        System.out.println("edit Java files with notepad++");
    }

    @Override
    void close() {
        System.out.println("close the file");
    }
}
class WordFile extends File{
    WordFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("sublime text to open "+size);
    }

    @Override
    void edit() {
        System.out.println("edit sublime");
    }

    @Override
    void close() {
        System.out.println("close the file at the end");
    }
}
class PdfFile extends File{
    PdfFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("we need microsoft word to be installed to open a .doc file "+size);
    }

    @Override
    void edit() {
        System.out.println("edit with microsoft word");
    }

    @Override
    void close() {
        System.out.println("close the file and microsoft word");
    }
}
