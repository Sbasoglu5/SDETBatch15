package class19Asel;

public class ThisBook {
    /*Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed*/

    String author;
    String title;
    int pages;
    int year;

    ThisBook(String author, String title) {
        this.author = author;
        this.title = title;
    }

    ThisBook(String author, String title, int pages, int year) {
        this(author, title);
        this.pages = pages;
        this.year = year;
    }

    void bookInfo() {
        System.out.println("Author " + author + " Title " + title
                + " number of pages " + pages + " year of publishing "
                + year);
    }

    void bookRecomend() {
        System.out.println("I strongly recomend to read " + title + " by " + author);
    }

    public static void main(String[] args) {

        ThisBook book1 = new ThisBook("Lev Tolstoy", "Anna Karenina", 400, 1877);
        book1.bookInfo();
        book1.bookRecomend();
    }
}

