package class24;

public class FileTester {
    public static void main(String[] args) {
        File[] files={new JavaFile(1024),new PdfFile(25),new WordFile(50)};
        /*for (File f:files){
            f.open();
            f.edit();
            f.close();
        }*/
        for (int i = 0; i < files.length; i++) {
            File f=files[i];
            f.open();
            f.edit();
            f.close();
        }
    }
}
