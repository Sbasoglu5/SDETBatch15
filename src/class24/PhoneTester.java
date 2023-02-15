package class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone [] array={new Iphone(),new Samsung()};
        for (Phone p:array){
            p.displayPictures();
            p.unlockPhone();
        }
    }
}
