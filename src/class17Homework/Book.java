package class17Homework;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed*/

    String name;
    String author;
    int year;
    int page;

    Book(String name2,String author2, int year2, int page2){
        name=name2;
        author=author2;
        year=year2;
        page=page2;
    }
    Book(String name2, int year2, String author2, int page2){
        name=name2;
        author=author2;
        year=year2;
        page=page2;
    }
    void print(){
        System.out.println("Name of the book: "+name+", Author of the book: "+author+", Publication year: "+year+", Page count: "+page);
    }

}
