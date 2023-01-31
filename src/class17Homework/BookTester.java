package class17Homework;

public class BookTester {
    public static void main(String[] args) {
        Book seuss=new Book("The Cat in The Hat","Dr.Seuss",1957,36);
        seuss.print();
        Book drSeuss=new Book("How The Grinch Stole Christmas!",1957,"Dr. Seuss",33);
        drSeuss.print();
    }
}
